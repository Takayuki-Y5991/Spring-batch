package com.example.baseBatch.client.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;

public class BookRentalEntity {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452234196+09:00", comments="Source field: book_rental.book_rental_id")
    private Long bookRentalId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452312434+09:00", comments="Source field: book_rental.checkout_date")
    private LocalDateTime checkoutDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452378521+09:00", comments="Source field: book_rental.return_date")
    private LocalDateTime returnDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452445078+09:00", comments="Source field: book_rental.book_id")
    private String bookId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452510018+09:00", comments="Source field: book_rental.member_id")
    private Long memberId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452268859+09:00", comments="Source field: book_rental.book_rental_id")
    public Long getBookRentalId() {
        return bookRentalId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452292692+09:00", comments="Source field: book_rental.book_rental_id")
    public void setBookRentalId(Long bookRentalId) {
        this.bookRentalId = bookRentalId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452335799+09:00", comments="Source field: book_rental.checkout_date")
    public LocalDateTime getCheckoutDate() {
        return checkoutDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452357922+09:00", comments="Source field: book_rental.checkout_date")
    public void setCheckoutDate(LocalDateTime checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452400711+09:00", comments="Source field: book_rental.return_date")
    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452423892+09:00", comments="Source field: book_rental.return_date")
    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452466252+09:00", comments="Source field: book_rental.book_id")
    public String getBookId() {
        return bookId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452490826+09:00", comments="Source field: book_rental.book_id")
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452532615+09:00", comments="Source field: book_rental.member_id")
    public Long getMemberId() {
        return memberId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452554366+09:00", comments="Source field: book_rental.member_id")
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
}