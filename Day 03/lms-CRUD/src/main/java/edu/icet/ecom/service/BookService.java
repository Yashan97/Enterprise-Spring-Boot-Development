package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.BookDto;
import edu.icet.ecom.reporsitory.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookService {
    @Autowired
    BookRepository bookRepository;
    public List<BookDto> getAll(){
        return null;
    }
}
