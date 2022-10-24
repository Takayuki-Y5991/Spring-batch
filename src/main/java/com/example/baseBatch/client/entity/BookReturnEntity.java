package com.example.baseBatch.client.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;

public class BookReturnEntity {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.443033083+09:00", comments="Source field: book_return.book_return_id")
    private Long bookReturnId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.443175871+09:00", comments="Source field: book_return.return_date")
    private LocalDateTime returnDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.443255343+09:00", comments="Source field: book_return.book_rental_id")
    private Long bookRentalId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.44311009+09:00", comments="Source field: book_return.book_return_id")
    public Long getBookReturnId() {
        return bookReturnId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.443147217+09:00", comments="Source field: book_return.book_return_id")
    public void setBookReturnId(Long bookReturnId) {
        this.bookReturnId = bookReturnId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.443206576+09:00", comments="Source field: book_return.return_date")
    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.443233636+09:00", comments="Source field: book_return.return_date")
    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.44328495+09:00", comments="Source field: book_return.book_rental_id")
    public Long getBookRentalId() {
        return bookRentalId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.443312143+09:00", comments="Source field: book_return.book_rental_id")
    public void setBookRentalId(Long bookRentalId) {
        this.bookRentalId = bookRentalId;
    }
}