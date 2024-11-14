package ra.springdatajpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 36)
    private String id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "created_date", columnDefinition = "date")
    private LocalDate createdData;
    @ManyToOne
    @JoinColumn(name = "category_id")
        private Category category;


}
