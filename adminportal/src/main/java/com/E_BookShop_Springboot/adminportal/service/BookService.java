package com.E_BookShop_Springboot.adminportal.service;

import com.E_BookShop_Springboot.adminportal.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Long id);
    List<Book> findByCategory(String category);
    List<Book> blurrySearch(String title);

    void save(Book book);
}
