package ra.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.boot.model.entity.Catalog;

public interface ICatalogRepository extends JpaRepository<Catalog, Integer> {
}
