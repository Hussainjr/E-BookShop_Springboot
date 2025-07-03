package com.E_BookShop_Springboot.adminportal.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String author;
    private String publisher;
    private String publicationDate;
    private String language;
    private String category;
    private int numberOfPages;
    private String format;
    private int isbn;
    private double shippingWeight;
    private double listPrice;
    private double ourPrice;
    private boolean active=true;

    @Column(columnDefinition = "text")
    private String description;
    private int inStockNumber;

    @Transient
    private MultipartFile bookImage;

    @OneToMany(mappedBy = "book")
    @JsonIgnore
    private List<BookToCartItem> bookToCartItemList;


    public Book(Long id, String title, String author, String publisher, String publicationDate, String language, String category, int numberOfPages, String format, int isbn, double shippingWeight, double listPrice, double ourPrice, boolean active, String description, int inStockNumber, MultipartFile bookImage, List<BookToCartItem> bookToCartItemList) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.language = language;
        this.category = category;
        this.numberOfPages = numberOfPages;
        this.format = format;
        this.isbn = isbn;
        this.shippingWeight = shippingWeight;
        this.listPrice = listPrice;
        this.ourPrice = ourPrice;
        this.active = active;
        this.description = description;
        this.inStockNumber = inStockNumber;
        this.bookImage = bookImage;
        this.bookToCartItemList = bookToCartItemList;
    }
}
