package com.example.ilearn.repository;


import com.example.ilearn.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    @Query("select b from Book b where b.ISBN=?1 and b.bookName=?2")
    Book findByISBNAndBookName(int ISBN, String bookName);
}