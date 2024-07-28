package com.org.project.minor_project.Controller;

import com.org.project.minor_project.DTO.BookRequest;
import com.org.project.minor_project.Model.Book;
import com.org.project.minor_project.Model.BookFilterType;
import com.org.project.minor_project.Model.Operator;
import com.org.project.minor_project.Repository.BookRepository;
import com.org.project.minor_project.Services.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody @Valid BookRequest bookRequest){

        // validations before the business logic?
//        if(StringUtil.isNullOrEmpty(bookRequest.getBookNo())){
//            throw new Exception("book no should not be blank ");
//        }

        // to call the business logic
        Book book = bookService.addBook(bookRequest);

        // return the accurate/ required data
        return book;

    }

    @GetMapping("/filter")
    public List<Book> filter(@RequestParam("filterBy") BookFilterType bookFilterType,
                             @RequestParam("operator")Operator operator,
                             @RequestParam("value") String value){

        return bookService.filter(bookFilterType, operator, value);
    }
}

