package com.example.baseBatch.client.mybatis;

import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.time.LocalDateTime;

public final class BookReturnEntityDynamicSqlSupport {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.819962256+09:00", comments = "Source Table: book_return")
    public static final BookReturnEntity bookReturnEntity = new BookReturnEntity();

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820007507+09:00", comments = "Source field: book_return.book_return_id")
    public static final SqlColumn<Long> bookReturnId = bookReturnEntity.bookReturnId;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820025877+09:00", comments = "Source field: book_return.return_date")
    public static final SqlColumn<LocalDateTime> returnDate = bookReturnEntity.returnDate;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820040558+09:00", comments = "Source field: book_return.book_rental_id")
    public static final SqlColumn<Long> bookRentalId = bookReturnEntity.bookRentalId;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.819989746+09:00", comments = "Source Table: book_return")
    public static final class BookReturnEntity extends AliasableSqlTable<BookReturnEntity> {
        public final SqlColumn<Long> bookReturnId = column("book_return_id", JDBCType.BIGINT);

        public final SqlColumn<LocalDateTime> returnDate = column("return_date", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> bookRentalId = column("book_rental_id", JDBCType.BIGINT);

        public BookReturnEntity() {
            super("book_return", BookReturnEntity::new);
        }
    }
}