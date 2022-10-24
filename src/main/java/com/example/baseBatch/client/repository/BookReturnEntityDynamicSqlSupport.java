package com.example.baseBatch.client.repository;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class BookReturnEntityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.443394151+09:00", comments="Source Table: book_return")
    public static final BookReturnEntity bookReturnEntity = new BookReturnEntity();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449037177+09:00", comments="Source field: book_return.book_return_id")
    public static final SqlColumn<Long> bookReturnId = bookReturnEntity.bookReturnId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449171036+09:00", comments="Source field: book_return.return_date")
    public static final SqlColumn<LocalDateTime> returnDate = bookReturnEntity.returnDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449206043+09:00", comments="Source field: book_return.book_rental_id")
    public static final SqlColumn<Long> bookRentalId = bookReturnEntity.bookRentalId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.443437671+09:00", comments="Source Table: book_return")
    public static final class BookReturnEntity extends AliasableSqlTable<BookReturnEntity> {
        public final SqlColumn<Long> bookReturnId = column("book_return_id", JDBCType.BIGINT);

        public final SqlColumn<LocalDateTime> returnDate = column("return_date", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> bookRentalId = column("book_rental_id", JDBCType.BIGINT);

        public BookReturnEntity() {
            super("book_return", BookReturnEntity::new);
        }
    }
}