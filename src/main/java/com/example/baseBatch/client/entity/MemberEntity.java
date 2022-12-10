package com.example.baseBatch.client.entity;

import java.time.LocalDate;
import javax.annotation.Generated;

public class MemberEntity {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821402884+09:00", comments="Source field: member.member_id")
    private Long memberId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821442982+09:00", comments="Source field: member.account_name")
    private String accountName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821474606+09:00", comments="Source field: member.birthday")
    private LocalDate birthday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821502679+09:00", comments="Source field: member.contact")
    private String contact;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821531257+09:00", comments="Source field: member.email")
    private String email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821559324+09:00", comments="Source field: member.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821584957+09:00", comments="Source field: member.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821612622+09:00", comments="Source field: member.sex")
    private Integer sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821418525+09:00", comments="Source field: member.member_id")
    public Long getMemberId() {
        return memberId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821432473+09:00", comments="Source field: member.member_id")
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.82145389+09:00", comments="Source field: member.account_name")
    public String getAccountName() {
        return accountName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821465852+09:00", comments="Source field: member.account_name")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821484983+09:00", comments="Source field: member.birthday")
    public LocalDate getBirthday() {
        return birthday;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821494907+09:00", comments="Source field: member.birthday")
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821512078+09:00", comments="Source field: member.contact")
    public String getContact() {
        return contact;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821523397+09:00", comments="Source field: member.contact")
    public void setContact(String contact) {
        this.contact = contact;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821540374+09:00", comments="Source field: member.email")
    public String getEmail() {
        return email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821551182+09:00", comments="Source field: member.email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821567843+09:00", comments="Source field: member.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821577075+09:00", comments="Source field: member.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821594012+09:00", comments="Source field: member.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821605002+09:00", comments="Source field: member.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821621775+09:00", comments="Source field: member.sex")
    public Integer getSex() {
        return sex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-12-06T23:23:42.821632759+09:00", comments="Source field: member.sex")
    public void setSex(Integer sex) {
        this.sex = sex;
    }
}