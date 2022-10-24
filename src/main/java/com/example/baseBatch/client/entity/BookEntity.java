package com.example.baseBatch.client.entity;

import java.time.LocalDate;
import javax.annotation.Generated;

public class BookEntity {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.418392531+09:00", comments="Source field: book.book_id")
    private String bookId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.419805766+09:00", comments="Source field: book.author")
    private String author;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.419921012+09:00", comments="Source field: book.description")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.420025924+09:00", comments="Source field: book.image_url")
    private String imageUrl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.420123515+09:00", comments="Source field: book.publish_date")
    private LocalDate publishDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.42023725+09:00", comments="Source field: book.publisher")
    private String publisher;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.420352595+09:00", comments="Source field: book.status")
    private Integer status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.420433212+09:00", comments="Source field: book.title")
    private String title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.419280848+09:00", comments="Source field: book.book_id")
    public String getBookId() {
        return bookId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.419746618+09:00", comments="Source field: book.book_id")
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.419848991+09:00", comments="Source field: book.author")
    public String getAuthor() {
        return author;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.41988955+09:00", comments="Source field: book.author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.419951015+09:00", comments="Source field: book.description")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.419998089+09:00", comments="Source field: book.description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.420057072+09:00", comments="Source field: book.image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.420092977+09:00", comments="Source field: book.image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.420179464+09:00", comments="Source field: book.publish_date")
    public LocalDate getPublishDate() {
        return publishDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.420212105+09:00", comments="Source field: book.publish_date")
    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.420292031+09:00", comments="Source field: book.publisher")
    public String getPublisher() {
        return publisher;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.42032856+09:00", comments="Source field: book.publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.420378132+09:00", comments="Source field: book.status")
    public Integer getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.420407846+09:00", comments="Source field: book.status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.420461189+09:00", comments="Source field: book.title")
    public String getTitle() {
        return title;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.420509059+09:00", comments="Source field: book.title")
    public void setTitle(String title) {
        this.title = title;
    }
}