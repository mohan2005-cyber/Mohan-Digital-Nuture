package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook() {
        System.out.println("Adding Book to the Repository....");
        bookRepository.saveBook();
    }
}
