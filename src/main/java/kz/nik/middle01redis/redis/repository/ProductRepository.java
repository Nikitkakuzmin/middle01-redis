package kz.nik.middle01redis.redis.repository;

import kz.nik.middle01redis.redis.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}