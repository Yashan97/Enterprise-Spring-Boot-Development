package edu.icet.ecom.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookEntity {
    @Id
    private long isbn;
    private String title;
    private String author;
}
