package B8.order_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import B8.order_service.dto.OrderRequest;
import B8.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }
    
}
