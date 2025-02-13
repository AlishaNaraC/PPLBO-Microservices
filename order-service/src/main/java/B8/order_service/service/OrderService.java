package B8.order_service.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import B8.order_service.dto.OrderRequest;
import B8.order_service.model.Order;
import B8.order_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder( OrderRequest orderRequest){
        // map orderRequest to Order object
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());

        // save order to orderRepo
        orderRepository.save(order);
    }
    
}
