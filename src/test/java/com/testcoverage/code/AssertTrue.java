package com.testcoverage.code;

import com.testcoverage.code.entity.Book;
import com.testcoverage.code.service.BookService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrue {
    @BeforeAll
    static void initialMsg(){
        System.out.println("initilizing only");
    }

    @Test
    void testingAssertTrue(){
        System.out.println(" i m inside assertTrue method!!");
        BookService ser = new BookService();
        ser.addBook(new Book());
        List<Book> listOfBooks = ser.books();
        //assertTrue(listOfBooks.isEmpty());
        assertTrue(!listOfBooks.isEmpty(), "all is not good till now");
    }

    // using Supplier interface

    @Test
    void testingWithSupplier0(){
        System.out.println(" i m inside assertTrue method!!");
        BookService ser = new BookService();
        ser.addBook(new Book());
        List<Book> listOfBooks = ser.books();
        //assertTrue(listOfBooks.isEmpty());
        assertTrue(() -> !listOfBooks.isEmpty(), ()->"all is bad till now ");

    }
    
}
