package com.example.baseBatch.client.repository;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class BookRentalEntityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452635007+09:00", comments="Source Table: book_rental")
    public static final BookRentalEntity bookRentalEntity = new BookRentalEntity();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452698936+09:00", comments="Source field: book_rental.book_rental_id")
    public static final SqlColumn<Long> bookRentalId = bookRentalEntity.bookRentalId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452729064+09:00", comments="Source field: book_rental.checkout_date")
    public static final SqlColumn<LocalDateTime> checkoutDate = bookRentalEntity.checkoutDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452760355+09:00", comments="Source field: book_rental.return_date")
    public static final SqlColumn<LocalDateTime> returnDate = bookRentalEntity.returnDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452787432+09:00", comments="Source field: book_rental.book_id")
    public static final SqlColumn<String> bookId = bookRentalEntity.bookId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452814599+09:00", comments="Source field: book_rental.member_id")
    public static final SqlColumn<Long> memberId = bookRentalEntity.memberId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.452670136+09:00", comments="Source Table: book_rental")
    public static final class BookRentalEntity extends AliasableSqlTable<BookRentalEntity> {
        public final SqlColumn<Long> bookRentalId = column("book_rental_id", JDBCType.BIGINT);

        public final SqlColumn<LocalDateTime> checkoutDate = column("checkout_date", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> returnDate = column("return_date", JDBCType.TIMESTAMP);

        public final SqlColumn<String> bookId = column("book_id", JDBCType.VARCHAR);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public BookRentalEntity() {
            super("book_rental", BookRentalEntity::new);
        }
    }
}