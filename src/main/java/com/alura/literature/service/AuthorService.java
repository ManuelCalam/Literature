package com.alura.literature.service;

import com.alura.literature.model.Author;
import com.alura.literature.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public List<Author> getAuthorsAliveInYear(Integer year){
        return authorRepository.findAuthorsAliveInYear(year);
    }
}