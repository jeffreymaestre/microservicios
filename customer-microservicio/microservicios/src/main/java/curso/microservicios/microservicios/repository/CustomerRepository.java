package curso.microservicios.microservicios.repository;

import curso.microservicios.microservicios.entity.Customer;
import curso.microservicios.microservicios.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Customer findByNumberID(String numberID);
    public List<Customer> findByLastName(String lastName);
    public List<Customer>findByRegion(Region region);
}
