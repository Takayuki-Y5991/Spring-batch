package com.example.baseBatch.client.entity;

import java.time.LocalDate;
import javax.annotation.Generated;

public class BookEntity {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.807249528+09:00", comments="Source field: book.book_id")
    private String bookId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808088524+09:00", comments="Source field: book.author")
    private String author;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808148665+09:00", comments="Source field: book.description")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808194602+09:00", comments="Source field: book.image_url")
    private String imageUrl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808237706+09:00", comments="Source field: book.publish_date")
    private LocalDate publishDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808288881+09:00", comments="Source field: book.publisher")
    private String publisher;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808332465+09:00", comments="Source field: book.status")
    private Integer status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808385237+09:00", comments="Source field: book.title")
    private String title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.807779534+09:00", comments="Source field: book.book_id")
    public String getBookId() {
        return bookId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808043327+09:00", comments="Source field: book.book_id")
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808112196+09:00", comments="Source field: book.author")
    public String getAuthor() {
        return author;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808134654+09:00", comments="Source field: book.author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808164001+09:00", comments="Source field: book.description")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.80818045+09:00", comments="Source field: book.description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808208857+09:00", comments="Source field: book.image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808224995+09:00", comments="Source field: book.image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808262181+09:00", comments="Source field: book.publish_date")
    public LocalDate getPublishDate() {
        return publishDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808277084+09:00", comments="Source field: book.publish_date")
    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808302302+09:00", comments="Source field: book.publisher")
    public String getPublisher() {
        return publisher;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.8083197+09:00", comments="Source field: book.publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.80834593+09:00", comments="Source field: book.status")
    public Integer getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808373077+09:00", comments="Source field: book.status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808399733+09:00", comments="Source field: book.title")
    public String getTitle() {
        return title;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.808417243+09:00", comments="Source field: book.title")
    public void setTitle(String title) {
        this.title = title;
    }
}