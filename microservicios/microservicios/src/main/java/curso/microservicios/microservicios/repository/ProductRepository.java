package curso.microservicios.microservicios.repository;

import curso.microservicios.microservicios.entity.Category;
import curso.microservicios.microservicios.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByCategory(Category category);
}
