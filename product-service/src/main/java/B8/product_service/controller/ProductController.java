package B8.product_service.controller;

import B8.product_service.dto.ProductRequest;
import B8.product_service.dto.ProductResponse;
import B8.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
        return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List <ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }
}
