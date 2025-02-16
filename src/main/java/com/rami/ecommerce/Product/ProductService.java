package com.rami.ecommerce.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public Product getProductById(Long id) {
    Optional<Product> productFinded = productRepository.findById(id);
    return productFinded.isPresent() ? productFinded.get() : null;
  }

  public List<Product> getProducts() {
    return productRepository.findAll();
  }

}
