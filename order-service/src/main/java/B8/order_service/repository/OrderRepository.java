package B8.order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import B8.order_service.model.Order;

public interface OrderRepository extends JpaRepository <Order, Long>{
    
}
