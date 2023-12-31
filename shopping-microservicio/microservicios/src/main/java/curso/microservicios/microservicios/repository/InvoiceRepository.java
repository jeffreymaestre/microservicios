package curso.microservicios.microservicios.repository;

import curso.microservicios.microservicios.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
   public List<Invoice> findByCustomerId(Long customerId);
   public Invoice findByNumberInvoice(String numberInvoice);
}
