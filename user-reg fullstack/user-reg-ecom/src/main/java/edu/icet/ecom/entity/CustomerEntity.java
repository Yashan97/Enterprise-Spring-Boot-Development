package edu.icet.ecom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (name = "customer-new") // create automatically database and table
public class CustomerEntity {
    @Id // create id
    @GeneratedValue(strategy = GenerationType.AUTO) // cretae id is auto
    private long id;
    private String  name;
    private Integer age;
    private String address;
    private Integer number;
}
