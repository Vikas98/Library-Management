package com.org.project.minor_project.Services;

import com.org.project.minor_project.Model.Author;
import com.org.project.minor_project.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author getAuthorData(String email) {
        return  authorRepository.getAuthorByEmail(email);
    }
}