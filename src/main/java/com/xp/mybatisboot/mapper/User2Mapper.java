package com.xp.mybatisboot.mapper;

import com.xp.mybatisboot.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface User2Mapper {
    @Insert("insert into user(phone,name,gender,age)\n" +
            "        value (#{phone},#{name},#{gender},#{age})")
    int insert(User user);

    @Select("select * from user where phone = #{phone}")
    User select(@Param("phone") long phone);

    @Update("<script>" +
            "" +
            "" +
            "</script>")
    int update(User user);
//    int delete(int id);
}
