package com.example.baseBatch.client.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;

public class BookReturnEntity {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.819765497+09:00", comments="Source field: book_return.book_return_id")
    private Long bookReturnId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.819824618+09:00", comments="Source field: book_return.return_date")
    private LocalDateTime returnDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.819858095+09:00", comments="Source field: book_return.book_rental_id")
    private Long bookRentalId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.819794479+09:00", comments="Source field: book_return.book_return_id")
    public Long getBookReturnId() {
        return bookReturnId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.819810887+09:00", comments="Source field: book_return.book_return_id")
    public void setBookReturnId(Long bookReturnId) {
        this.bookReturnId = bookReturnId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.819838123+09:00", comments="Source field: book_return.return_date")
    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.819849134+09:00", comments="Source field: book_return.return_date")
    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.819867418+09:00", comments="Source field: book_return.book_rental_id")
    public Long getBookRentalId() {
        return bookRentalId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.819877694+09:00", comments="Source field: book_return.book_rental_id")
    public void setBookRentalId(Long bookRentalId) {
        this.bookRentalId = bookRentalId;
    }
}