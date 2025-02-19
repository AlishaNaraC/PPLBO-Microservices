package B8.order_service.client;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

public interface InventoryClient {
    
    @GetExchange("/api/inventory")
    boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity);
}
