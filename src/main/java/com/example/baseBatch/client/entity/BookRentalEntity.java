package com.example.baseBatch.client.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;

public class BookRentalEntity {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.82055026+09:00", comments="Source field: book_rental.book_rental_id")
    private Long bookRentalId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.820589823+09:00", comments="Source field: book_rental.checkout_date")
    private LocalDateTime checkoutDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.820620126+09:00", comments="Source field: book_rental.return_date")
    private LocalDateTime returnDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.820648402+09:00", comments="Source field: book_rental.book_id")
    private String bookId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.820678406+09:00", comments="Source field: book_rental.member_id")
    private Long memberId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.820566195+09:00", comments="Source field: book_rental.book_rental_id")
    public Long getBookRentalId() {
        return bookRentalId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.820579573+09:00", comments="Source field: book_rental.book_rental_id")
    public void setBookRentalId(Long bookRentalId) {
        this.bookRentalId = bookRentalId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.820600973+09:00", comments="Source field: book_rental.checkout_date")
    public LocalDateTime getCheckoutDate() {
        return checkoutDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.820611897+09:00", comments="Source field: book_rental.checkout_date")
    public void setCheckoutDate(LocalDateTime checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.820630773+09:00", comments="Source field: book_rental.return_date")
    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.820640721+09:00", comments="Source field: book_rental.return_date")
    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.820658634+09:00", comments="Source field: book_rental.book_id")
    public String getBookId() {
        return bookId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.820670167+09:00", comments="Source field: book_rental.book_id")
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.820688213+09:00", comments="Source field: book_rental.member_id")
    public Long getMemberId() {
        return memberId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.820698477+09:00", comments="Source field: book_rental.member_id")
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
}