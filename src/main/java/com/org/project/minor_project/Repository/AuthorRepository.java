package com.org.project.minor_project.Repository;

import com.org.project.minor_project.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
    // native Query
    @Query(value = "select * from author where email = :email", nativeQuery = true)
    Author getAuthorByEmail(String email);
}
