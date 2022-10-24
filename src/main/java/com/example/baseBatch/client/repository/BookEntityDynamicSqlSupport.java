package com.example.baseBatch.client.repository;

import java.sql.JDBCType;
import java.time.LocalDate;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class BookEntityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.425324052+09:00", comments="Source Table: book")
    public static final BookEntity bookEntity = new BookEntity();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.425748548+09:00", comments="Source field: book.book_id")
    public static final SqlColumn<String> bookId = bookEntity.bookId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.426240715+09:00", comments="Source field: book.author")
    public static final SqlColumn<String> author = bookEntity.author;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.426300733+09:00", comments="Source field: book.description")
    public static final SqlColumn<String> description = bookEntity.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.42634286+09:00", comments="Source field: book.image_url")
    public static final SqlColumn<String> imageUrl = bookEntity.imageUrl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.426391828+09:00", comments="Source field: book.publish_date")
    public static final SqlColumn<LocalDate> publishDate = bookEntity.publishDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.426432379+09:00", comments="Source field: book.publisher")
    public static final SqlColumn<String> publisher = bookEntity.publisher;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.426471482+09:00", comments="Source field: book.status")
    public static final SqlColumn<Integer> status = bookEntity.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.426508286+09:00", comments="Source field: book.title")
    public static final SqlColumn<String> title = bookEntity.title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.425601358+09:00", comments="Source Table: book")
    public static final class BookEntity extends AliasableSqlTable<BookEntity> {
        public final SqlColumn<String> bookId = column("book_id", JDBCType.VARCHAR);

        public final SqlColumn<String> author = column("author", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> imageUrl = column("image_url", JDBCType.VARCHAR);

        public final SqlColumn<LocalDate> publishDate = column("publish_date", JDBCType.DATE);

        public final SqlColumn<String> publisher = column("publisher", JDBCType.VARCHAR);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);

        public BookEntity() {
            super("book", BookEntity::new);
        }
    }
}