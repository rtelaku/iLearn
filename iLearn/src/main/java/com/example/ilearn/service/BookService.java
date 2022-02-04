package com.example.ilearn.service;


import com.example.ilearn.model.Book;
import com.example.ilearn.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService{
    @Autowired
    public BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }

    public Book getBookByISBN(int ISBN){
        Optional<Book> bookOptional = bookRepository.findById(ISBN);
        if(bookOptional == null)
            return null;

        return bookOptional.get();
    }
    public Book getBookByISBNAndName(int ISBN, String bookName){
        Book book =bookRepository.findByISBNAndBookName(ISBN,bookName);
        return book;
    }
}
