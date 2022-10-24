package com.example.baseBatch.client.entity;

import javax.annotation.Generated;

public class MemberRentalBookEntity {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.6733858+09:00", comments="Source field: member_rental_book.member_id")
    private Long memberId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.673435955+09:00", comments="Source field: member_rental_book.book_id")
    private String bookId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.673406848+09:00", comments="Source field: member_rental_book.member_id")
    public Long getMemberId() {
        return memberId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.673422953+09:00", comments="Source field: member_rental_book.member_id")
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.673450521+09:00", comments="Source field: member_rental_book.book_id")
    public String getBookId() {
        return bookId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.67346493+09:00", comments="Source field: member_rental_book.book_id")
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}