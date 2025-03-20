package B8.product_query_service.repository;

import B8.product_query_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<B8.product_query_service.entity.Product, Long> {
}
