package com.example.baseBatch.client.mybatis;

import com.example.baseBatch.client.entity.BookReturnEntity;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonSelectMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

import javax.annotation.Generated;
import java.util.List;
import java.util.Optional;

import static com.example.baseBatch.client.mybatis.BookReturnEntityDynamicSqlSupport.bookRentalId;
import static com.example.baseBatch.client.mybatis.BookReturnEntityDynamicSqlSupport.bookReturnEntity;
import static com.example.baseBatch.client.mybatis.BookReturnEntityDynamicSqlSupport.bookReturnId;
import static com.example.baseBatch.client.mybatis.BookReturnEntityDynamicSqlSupport.returnDate;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface BookReturnEntityMapper extends CommonSelectMapper, CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820292396+09:00", comments = "Source Table: book_return")
    BasicColumn[] selectList = BasicColumn.columnList(bookReturnId, returnDate, bookRentalId);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820059495+09:00", comments = "Source Table: book_return")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "row.bookReturnId", before = true, resultType = Long.class)
    int insert(InsertStatementProvider<BookReturnEntity> insertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820105473+09:00", comments = "Source Table: book_return")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "BookReturnEntityResult", value = {
            @Result(column = "book_return_id", property = "bookReturnId", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "return_date", property = "returnDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "book_rental_id", property = "bookRentalId", jdbcType = JdbcType.BIGINT)
    })
    List<BookReturnEntity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820144758+09:00", comments = "Source Table: book_return")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("BookReturnEntityResult")
    Optional<BookReturnEntity> selectOne(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820167756+09:00", comments = "Source Table: book_return")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, bookReturnEntity, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820197608+09:00", comments = "Source Table: book_return")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, bookReturnEntity, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820214004+09:00", comments = "Source Table: book_return")
    default int deleteByPrimaryKey(Long bookReturnId_) {
        return delete(c ->
                c.where(bookReturnId, isEqualTo(bookReturnId_))
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.82023299+09:00", comments = "Source Table: book_return")
    default int insert(BookReturnEntity row) {
        return MyBatis3Utils.insert(this::insert, row, bookReturnEntity, c ->
                c.map(bookReturnId).toProperty("bookReturnId")
                        .map(returnDate).toProperty("returnDate")
                        .map(bookRentalId).toProperty("bookRentalId")
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820258026+09:00", comments = "Source Table: book_return")
    default int insertSelective(BookReturnEntity row) {
        return MyBatis3Utils.insert(this::insert, row, bookReturnEntity, c ->
                c.map(bookReturnId).toProperty("bookReturnId")
                        .map(returnDate).toPropertyWhenPresent("returnDate", row::getReturnDate)
                        .map(bookRentalId).toPropertyWhenPresent("bookRentalId", row::getBookRentalId)
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820311222+09:00", comments = "Source Table: book_return")
    default Optional<BookReturnEntity> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, bookReturnEntity, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.82032993+09:00", comments = "Source Table: book_return")
    default List<BookReturnEntity> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, bookReturnEntity, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820349902+09:00", comments = "Source Table: book_return")
    default List<BookReturnEntity> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, bookReturnEntity, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820366487+09:00", comments = "Source Table: book_return")
    default Optional<BookReturnEntity> selectByPrimaryKey(Long bookReturnId_) {
        return selectOne(c ->
                c.where(bookReturnId, isEqualTo(bookReturnId_))
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820386557+09:00", comments = "Source Table: book_return")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, bookReturnEntity, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820404634+09:00", comments = "Source Table: book_return")
    static UpdateDSL<UpdateModel> updateAllColumns(BookReturnEntity row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookReturnId).equalTo(row::getBookReturnId)
                .set(returnDate).equalTo(row::getReturnDate)
                .set(bookRentalId).equalTo(row::getBookRentalId);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820433347+09:00", comments = "Source Table: book_return")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(BookReturnEntity row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookReturnId).equalToWhenPresent(row::getBookReturnId)
                .set(returnDate).equalToWhenPresent(row::getReturnDate)
                .set(bookRentalId).equalToWhenPresent(row::getBookRentalId);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820460929+09:00", comments = "Source Table: book_return")
    default int updateByPrimaryKey(BookReturnEntity row) {
        return update(c ->
                c.set(returnDate).equalTo(row::getReturnDate)
                        .set(bookRentalId).equalTo(row::getBookRentalId)
                        .where(bookReturnId, isEqualTo(row::getBookReturnId))
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820486987+09:00", comments = "Source Table: book_return")
    default int updateByPrimaryKeySelective(BookReturnEntity row) {
        return update(c ->
                c.set(returnDate).equalToWhenPresent(row::getReturnDate)
                        .set(bookRentalId).equalToWhenPresent(row::getBookRentalId)
                        .where(bookReturnId, isEqualTo(row::getBookReturnId))
        );
    }
}