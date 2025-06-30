package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.BookDto;
import edu.icet.ecom.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController { //controller class for all req handaling
        @Autowired
        BookService bookService;
        @GetMapping
        public  List<BookDto> getAll(){
            return bookService.getAll();
        }
}
