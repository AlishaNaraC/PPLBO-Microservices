package B8.order_service.service;

import B8.order_service.common.dto.OrderRequestDTO;
import B8.order_service.common.mapper.OrderDTOtoEntityMapper;
import B8.order_service.common.mapper.OrderEntityToOutboxEntityMapper;
import B8.order_service.entity.Order;
import B8.order_service.entity.Outbox;
import B8.order_service.repository.OrderRepository;
import B8.order_service.repository.OutboxRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderDTOtoEntityMapper orderDTOtoEntityMapper;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OutboxRepository outboxRepository;

    @Autowired
    private OrderEntityToOutboxEntityMapper orderEntityToOutboxEntityMapper;


    @Transactional
    public Order createOrder(OrderRequestDTO orderRequestDTO) {

        Order order = orderDTOtoEntityMapper.map(orderRequestDTO);
        order = orderRepository.save(order);

        Outbox outbox = orderEntityToOutboxEntityMapper.map(order);
        outboxRepository.save(outbox);

        return order;
    }
}
