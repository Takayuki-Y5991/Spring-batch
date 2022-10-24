package com.example.baseBatch.client.repository;

import static com.example.baseBatch.client.repository.BookReturnEntityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.baseBatch.client.entity.BookReturnEntity;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
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

@Mapper
public interface BookReturnEntityMapper extends CommonSelectMapper, CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449724609+09:00", comments="Source Table: book_return")
    BasicColumn[] selectList = BasicColumn.columnList(bookReturnId, returnDate, bookRentalId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449252758+09:00", comments="Source Table: book_return")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="row.bookReturnId", before=true, resultType=Long.class)
    int insert(InsertStatementProvider<BookReturnEntity> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449361357+09:00", comments="Source Table: book_return")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="BookReturnEntityResult", value = {
        @Result(column="book_return_id", property="bookReturnId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="return_date", property="returnDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="book_rental_id", property="bookRentalId", jdbcType=JdbcType.BIGINT)
    })
    List<BookReturnEntity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449438286+09:00", comments="Source Table: book_return")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("BookReturnEntityResult")
    Optional<BookReturnEntity> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449481947+09:00", comments="Source Table: book_return")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, bookReturnEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.44952041+09:00", comments="Source Table: book_return")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, bookReturnEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449553764+09:00", comments="Source Table: book_return")
    default int deleteByPrimaryKey(Long bookReturnId_) {
        return delete(c -> 
            c.where(bookReturnId, isEqualTo(bookReturnId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449589744+09:00", comments="Source Table: book_return")
    default int insert(BookReturnEntity row) {
        return MyBatis3Utils.insert(this::insert, row, bookReturnEntity, c ->
            c.map(bookReturnId).toProperty("bookReturnId")
            .map(returnDate).toProperty("returnDate")
            .map(bookRentalId).toProperty("bookRentalId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449645287+09:00", comments="Source Table: book_return")
    default int insertSelective(BookReturnEntity row) {
        return MyBatis3Utils.insert(this::insert, row, bookReturnEntity, c ->
            c.map(bookReturnId).toProperty("bookReturnId")
            .map(returnDate).toPropertyWhenPresent("returnDate", row::getReturnDate)
            .map(bookRentalId).toPropertyWhenPresent("bookRentalId", row::getBookRentalId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449759295+09:00", comments="Source Table: book_return")
    default Optional<BookReturnEntity> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, bookReturnEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449795462+09:00", comments="Source Table: book_return")
    default List<BookReturnEntity> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, bookReturnEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449835177+09:00", comments="Source Table: book_return")
    default List<BookReturnEntity> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, bookReturnEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449869049+09:00", comments="Source Table: book_return")
    default Optional<BookReturnEntity> selectByPrimaryKey(Long bookReturnId_) {
        return selectOne(c ->
            c.where(bookReturnId, isEqualTo(bookReturnId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449922646+09:00", comments="Source Table: book_return")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, bookReturnEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.449964901+09:00", comments="Source Table: book_return")
    static UpdateDSL<UpdateModel> updateAllColumns(BookReturnEntity row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookReturnId).equalTo(row::getBookReturnId)
                .set(returnDate).equalTo(row::getReturnDate)
                .set(bookRentalId).equalTo(row::getBookRentalId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450019626+09:00", comments="Source Table: book_return")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(BookReturnEntity row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookReturnId).equalToWhenPresent(row::getBookReturnId)
                .set(returnDate).equalToWhenPresent(row::getReturnDate)
                .set(bookRentalId).equalToWhenPresent(row::getBookRentalId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450074212+09:00", comments="Source Table: book_return")
    default int updateByPrimaryKey(BookReturnEntity row) {
        return update(c ->
            c.set(returnDate).equalTo(row::getReturnDate)
            .set(bookRentalId).equalTo(row::getBookRentalId)
            .where(bookReturnId, isEqualTo(row::getBookReturnId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.450128093+09:00", comments="Source Table: book_return")
    default int updateByPrimaryKeySelective(BookReturnEntity row) {
        return update(c ->
            c.set(returnDate).equalToWhenPresent(row::getReturnDate)
            .set(bookRentalId).equalToWhenPresent(row::getBookRentalId)
            .where(bookReturnId, isEqualTo(row::getBookReturnId))
        );
    }
}