package com.xp.mybatisboot.mapper;

import com.xp.mybatisboot.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int insert(User user);
    User select(@Param("phone") long phone);
    int update(User user);
    int delete(@Param("phone") long phone);
}
