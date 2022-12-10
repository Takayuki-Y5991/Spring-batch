package com.example.baseBatch.client.mybatis.custom;

import com.example.baseBatch.client.entity.custom.TargetAudience;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

import java.util.List;

@Mapper
public interface CustomEntityMapper {

    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results({
            @Result(column = "title", property = "title"),
            @Result(column = "member_id", property = "memberId"),
            @Result(column = "name", property = "name"),
            @Result(column = "email", property = "email"),
            @Result(column = "return_date", property = "returnDate")
    })
    List<TargetAudience> selectAudience(SelectStatementProvider selectStatement);
}
