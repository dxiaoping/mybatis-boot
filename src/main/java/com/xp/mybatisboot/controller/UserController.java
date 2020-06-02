package com.xp.mybatisboot.controller;

import com.xp.mybatisboot.mapper.UserMapper;
import com.xp.mybatisboot.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @PostMapping(value = "add",consumes = "application/json")
    @ResponseBody
    public void createUser(@RequestBody User user){
        int count = userMapper.insert(user);
    }

    @GetMapping("queryAll")
    @ResponseBody
    public User getUsers(@RequestParam("phone") long phone){
        return userMapper.select(phone);
    }

    @PostMapping("modify")
    @ResponseBody
    public int modify(@RequestBody User user){
        return userMapper.update(user);
    }

    @PostMapping("delete")
    @ResponseBody
    public int delete(@Param("phone") long phone){
        return userMapper.delete(phone);
    }
}
