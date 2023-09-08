package curso.microservicios.microservicios.entity;

import curso.microservicios.microservicios.model.Product;
import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_invoice_items")
public class InvoiceItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Positive(message = "El stock debe ser mayor que cero")
    private Double quantity;

    private Double price;

    @Column(name = "product_id")
    private Long producId;

    @Transient
    private Double subtotal;

    @Transient
    private Product product;

    public Double getSubtotal(){
        if(this.price > 0 && this.quantity > 0){
            return this.quantity * this.price;
        }else{
            return (double) 0;
        }
    }

    public InvoiceItem (){
        this.quantity = (double) 0;
        this.price = (double) 0;
    }
}
