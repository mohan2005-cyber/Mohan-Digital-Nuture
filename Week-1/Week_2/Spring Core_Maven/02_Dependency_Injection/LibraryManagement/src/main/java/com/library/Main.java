package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Initializes the Spring container via XML, retrieves the "bookService" bean (which has the "bookRepository" dependency automatically injected)
        BookService bookservice = (BookService) context.getBean("bookService");
        bookservice.addBook();
    }
}
