package com.example.baseBatch.client.mybatis;

import com.example.baseBatch.client.entity.BookRentalEntity;
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

import static com.example.baseBatch.client.mybatis.BookRentalEntityDynamicSqlSupport.bookId;
import static com.example.baseBatch.client.mybatis.BookRentalEntityDynamicSqlSupport.bookRentalEntity;
import static com.example.baseBatch.client.mybatis.BookRentalEntityDynamicSqlSupport.bookRentalId;
import static com.example.baseBatch.client.mybatis.BookRentalEntityDynamicSqlSupport.checkoutDate;
import static com.example.baseBatch.client.mybatis.BookRentalEntityDynamicSqlSupport.memberId;
import static com.example.baseBatch.client.mybatis.BookRentalEntityDynamicSqlSupport.returnDate;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface BookRentalEntityMapper extends CommonSelectMapper, CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.821141684+09:00", comments = "Source Table: book_rental")
    BasicColumn[] selectList = BasicColumn.columnList(bookRentalId, checkoutDate, returnDate, bookId, memberId);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820859234+09:00", comments = "Source Table: book_rental")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "row.bookRentalId", before = true, resultType = Long.class)
    int insert(InsertStatementProvider<BookRentalEntity> insertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.82089475+09:00", comments = "Source Table: book_rental")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "BookRentalEntityResult", value = {
            @Result(column = "book_rental_id", property = "bookRentalId", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "checkout_date", property = "checkoutDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "return_date", property = "returnDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "book_id", property = "bookId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "member_id", property = "memberId", jdbcType = JdbcType.BIGINT)
    })
    List<BookRentalEntity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820933399+09:00", comments = "Source Table: book_rental")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("BookRentalEntityResult")
    Optional<BookRentalEntity> selectOne(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820955754+09:00", comments = "Source Table: book_rental")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, bookRentalEntity, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.820977732+09:00", comments = "Source Table: book_rental")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, bookRentalEntity, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.821028455+09:00", comments = "Source Table: book_rental")
    default int deleteByPrimaryKey(Long bookRentalId_) {
        return delete(c ->
                c.where(bookRentalId, isEqualTo(bookRentalId_))
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.821060507+09:00", comments = "Source Table: book_rental")
    default int insert(BookRentalEntity row) {
        return MyBatis3Utils.insert(this::insert, row, bookRentalEntity, c ->
                c.map(bookRentalId).toProperty("bookRentalId")
                        .map(checkoutDate).toProperty("checkoutDate")
                        .map(returnDate).toProperty("returnDate")
                        .map(bookId).toProperty("bookId")
                        .map(memberId).toProperty("memberId")
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.821100904+09:00", comments = "Source Table: book_rental")
    default int insertSelective(BookRentalEntity row) {
        return MyBatis3Utils.insert(this::insert, row, bookRentalEntity, c ->
                c.map(bookRentalId).toProperty("bookRentalId")
                        .map(checkoutDate).toPropertyWhenPresent("checkoutDate", row::getCheckoutDate)
                        .map(returnDate).toPropertyWhenPresent("returnDate", row::getReturnDate)
                        .map(bookId).toPropertyWhenPresent("bookId", row::getBookId)
                        .map(memberId).toPropertyWhenPresent("memberId", row::getMemberId)
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.821159732+09:00", comments = "Source Table: book_rental")
    default Optional<BookRentalEntity> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, bookRentalEntity, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.821176997+09:00", comments = "Source Table: book_rental")
    default List<BookRentalEntity> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, bookRentalEntity, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.82119574+09:00", comments = "Source Table: book_rental")
    default List<BookRentalEntity> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, bookRentalEntity, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.821215663+09:00", comments = "Source Table: book_rental")
    default Optional<BookRentalEntity> selectByPrimaryKey(Long bookRentalId_) {
        return selectOne(c ->
                c.where(bookRentalId, isEqualTo(bookRentalId_))
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.82123514+09:00", comments = "Source Table: book_rental")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, bookRentalEntity, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.82125216+09:00", comments = "Source Table: book_rental")
    static UpdateDSL<UpdateModel> updateAllColumns(BookRentalEntity row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookRentalId).equalTo(row::getBookRentalId)
                .set(checkoutDate).equalTo(row::getCheckoutDate)
                .set(returnDate).equalTo(row::getReturnDate)
                .set(bookId).equalTo(row::getBookId)
                .set(memberId).equalTo(row::getMemberId);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.821283051+09:00", comments = "Source Table: book_rental")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(BookRentalEntity row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookRentalId).equalToWhenPresent(row::getBookRentalId)
                .set(checkoutDate).equalToWhenPresent(row::getCheckoutDate)
                .set(returnDate).equalToWhenPresent(row::getReturnDate)
                .set(bookId).equalToWhenPresent(row::getBookId)
                .set(memberId).equalToWhenPresent(row::getMemberId);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.821314258+09:00", comments = "Source Table: book_rental")
    default int updateByPrimaryKey(BookRentalEntity row) {
        return update(c ->
                c.set(checkoutDate).equalTo(row::getCheckoutDate)
                        .set(returnDate).equalTo(row::getReturnDate)
                        .set(bookId).equalTo(row::getBookId)
                        .set(memberId).equalTo(row::getMemberId)
                        .where(bookRentalId, isEqualTo(row::getBookRentalId))
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-12-06T23:23:42.821343393+09:00", comments = "Source Table: book_rental")
    default int updateByPrimaryKeySelective(BookRentalEntity row) {
        return update(c ->
                c.set(checkoutDate).equalToWhenPresent(row::getCheckoutDate)
                        .set(returnDate).equalToWhenPresent(row::getReturnDate)
                        .set(bookId).equalToWhenPresent(row::getBookId)
                        .set(memberId).equalToWhenPresent(row::getMemberId)
                        .where(bookRentalId, isEqualTo(row::getBookRentalId))
        );
    }
}