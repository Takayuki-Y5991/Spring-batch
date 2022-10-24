package com.example.baseBatch.client.entity;

import java.time.LocalDate;
import javax.annotation.Generated;

public class MemberEntity {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450283473+09:00", comments="Source field: member.member_id")
    private Long memberId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450369568+09:00", comments="Source field: member.account_name")
    private String accountName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450442137+09:00", comments="Source field: member.birthday")
    private LocalDate birthday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450509658+09:00", comments="Source field: member.contact")
    private String contact;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450575994+09:00", comments="Source field: member.email")
    private String email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450640442+09:00", comments="Source field: member.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.45070541+09:00", comments="Source field: member.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450771775+09:00", comments="Source field: member.sex")
    private Integer sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450320471+09:00", comments="Source field: member.member_id")
    public Long getMemberId() {
        return memberId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450346495+09:00", comments="Source field: member.member_id")
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450392114+09:00", comments="Source field: member.account_name")
    public String getAccountName() {
        return accountName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450421506+09:00", comments="Source field: member.account_name")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450467503+09:00", comments="Source field: member.birthday")
    public LocalDate getBirthday() {
        return birthday;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450490548+09:00", comments="Source field: member.birthday")
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450532809+09:00", comments="Source field: member.contact")
    public String getContact() {
        return contact;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450556795+09:00", comments="Source field: member.contact")
    public void setContact(String contact) {
        this.contact = contact;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450597386+09:00", comments="Source field: member.email")
    public String getEmail() {
        return email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450621464+09:00", comments="Source field: member.email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450661967+09:00", comments="Source field: member.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450686715+09:00", comments="Source field: member.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450727234+09:00", comments="Source field: member.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450752098+09:00", comments="Source field: member.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450793268+09:00", comments="Source field: member.sex")
    public Integer getSex() {
        return sex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450816865+09:00", comments="Source field: member.sex")
    public void setSex(Integer sex) {
        this.sex = sex;
    }
}