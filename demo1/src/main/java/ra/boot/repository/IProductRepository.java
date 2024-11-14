package ra.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.boot.model.entity.Product;

public interface IProductRepository extends JpaRepository<Product, String> {
}
