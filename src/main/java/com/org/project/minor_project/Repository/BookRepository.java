package com.org.project.minor_project.Repository;


import com.org.project.minor_project.Model.Book;
import com.org.project.minor_project.Model.BookType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

     List<Book> findByTitle(String title);

     List<Book> findByTitleContaining(String title);

     List<Book> findByBookType(BookType bookType);

     List<Book> findByBookNo(String bookNo);

}
