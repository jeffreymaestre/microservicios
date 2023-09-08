package curso.microservicios.microservicios.service;

import curso.microservicios.microservicios.entity.Category;
import curso.microservicios.microservicios.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> listAllProduct();
    public  Product getProduct(Long id);
    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public Product deleteProduct(Long id);
    public List<Product> findByCategoria(Category category);
    public Product updateStock(Long id, Double quantity);

}
