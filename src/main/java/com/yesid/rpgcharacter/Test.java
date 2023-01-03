package com.yesid.rpgcharacter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static class Book{
        String author;
        public Book(String author){
            this.author = author;
        }
    }

    public static void main(String[] args) {
        Book book = new Book("yesid");
        modify(book);
        System.out.println(book.author);

        Map map = new HashMap<>();
        Error
    }

    private static void modify(Book book) {
        Book book1 = new Book("Fernando");
        book = book1;
    }
}
