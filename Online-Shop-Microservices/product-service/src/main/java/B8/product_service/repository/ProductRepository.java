package B8.product_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import B8.product_service.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
    
}
