package com.example.baseBatch.client.repository;

import static com.example.baseBatch.client.repository.MemberRentalBookEntityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.baseBatch.client.entity.MemberRentalBookEntity;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonSelectMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface MemberRentalBookEntityMapper extends CommonSelectMapper, CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<MemberRentalBookEntity>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.674320036+09:00", comments="Source Table: member_rental_book")
    BasicColumn[] selectList = BasicColumn.columnList(memberId, bookId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.673640344+09:00", comments="Source Table: member_rental_book")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MemberRentalBookEntityResult", value = {
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="book_id", property="bookId", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<MemberRentalBookEntity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.67367762+09:00", comments="Source Table: member_rental_book")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MemberRentalBookEntityResult")
    Optional<MemberRentalBookEntity> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.673701515+09:00", comments="Source Table: member_rental_book")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, memberRentalBookEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.673721109+09:00", comments="Source Table: member_rental_book")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, memberRentalBookEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.673739216+09:00", comments="Source Table: member_rental_book")
    default int deleteByPrimaryKey(Long memberId_, String bookId_) {
        return delete(c -> 
            c.where(memberId, isEqualTo(memberId_))
            .and(bookId, isEqualTo(bookId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.673767918+09:00", comments="Source Table: member_rental_book")
    default int insert(MemberRentalBookEntity row) {
        return MyBatis3Utils.insert(this::insert, row, memberRentalBookEntity, c ->
            c.map(memberId).toProperty("memberId")
            .map(bookId).toProperty("bookId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.674100387+09:00", comments="Source Table: member_rental_book")
    default int insertMultiple(Collection<MemberRentalBookEntity> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, memberRentalBookEntity, c ->
            c.map(memberId).toProperty("memberId")
            .map(bookId).toProperty("bookId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.674264846+09:00", comments="Source Table: member_rental_book")
    default int insertSelective(MemberRentalBookEntity row) {
        return MyBatis3Utils.insert(this::insert, row, memberRentalBookEntity, c ->
            c.map(memberId).toPropertyWhenPresent("memberId", row::getMemberId)
            .map(bookId).toPropertyWhenPresent("bookId", row::getBookId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.674341475+09:00", comments="Source Table: member_rental_book")
    default Optional<MemberRentalBookEntity> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, memberRentalBookEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.674370655+09:00", comments="Source Table: member_rental_book")
    default List<MemberRentalBookEntity> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, memberRentalBookEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.674391611+09:00", comments="Source Table: member_rental_book")
    default List<MemberRentalBookEntity> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, memberRentalBookEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.674414398+09:00", comments="Source Table: member_rental_book")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, memberRentalBookEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.674435296+09:00", comments="Source Table: member_rental_book")
    static UpdateDSL<UpdateModel> updateAllColumns(MemberRentalBookEntity row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(memberId).equalTo(row::getMemberId)
                .set(bookId).equalTo(row::getBookId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T21:47:19.674478757+09:00", comments="Source Table: member_rental_book")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MemberRentalBookEntity row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(memberId).equalToWhenPresent(row::getMemberId)
                .set(bookId).equalToWhenPresent(row::getBookId);
    }
}