package com.adidas.poc.product.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.adidas.poc.product.model.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, String> {

	public List<Review> findByProductId(String productId);

}
