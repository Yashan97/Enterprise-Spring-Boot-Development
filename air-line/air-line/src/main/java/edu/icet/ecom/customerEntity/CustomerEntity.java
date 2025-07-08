package edu.icet.ecom.customerEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "books")
public class CustomerEntity {
    @Id
    private Integer isbn;
    private  String title;
    private  String author;
}
