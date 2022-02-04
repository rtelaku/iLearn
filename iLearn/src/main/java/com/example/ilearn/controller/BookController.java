package com.example.ilearn.controller;


import com.example.ilearn.helper.GeneralResponse;
import com.example.ilearn.model.Book;
import com.example.ilearn.model.Course;
import com.example.ilearn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")

public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping("/{ISBN}")
    public GeneralResponse<Book> getBook(@PathVariable int ISBN){
        Book book = bookService.getBookByISBN(ISBN);
        if(book==null){
            return new GeneralResponse.GeneralResponseBuilder(401).setError("Exception on something").build();
        }
        return new GeneralResponse.GeneralResponseBuilder<>(201).setMessage("succefullyDone").setData(book).build();
    }

    @GetMapping("/ISBN/{ISBN}/bookname/{bname}")
    public GeneralResponse<Course> getCourse(@PathVariable int ISBN,@PathVariable String bname){
        Book b=bookService.getBookByISBNAndName(ISBN,bname);
        if(b==null){
            return new GeneralResponse.GeneralResponseBuilder(401).setError("Exception on something").build();
        }
        return new GeneralResponse.GeneralResponseBuilder<>(201).setMessage("succefullyDone").setData(b).build();
    }

}
