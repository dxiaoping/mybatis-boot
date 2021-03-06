package com.xp.mybatisboot.mapper;

import com.xp.mybatisboot.pojo.Wxinfo;
import com.xp.mybatisboot.pojo.WxinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxinfo
     *
     * @mbggenerated Tue Jun 02 16:21:13 CST 2020
     */
    int countByExample(WxinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxinfo
     *
     * @mbggenerated Tue Jun 02 16:21:13 CST 2020
     */
    int deleteByExample(WxinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxinfo
     *
     * @mbggenerated Tue Jun 02 16:21:13 CST 2020
     */
    int deleteByPrimaryKey(String openid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxinfo
     *
     * @mbggenerated Tue Jun 02 16:21:13 CST 2020
     */
    int insert(Wxinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxinfo
     *
     * @mbggenerated Tue Jun 02 16:21:13 CST 2020
     */
    int insertSelective(Wxinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxinfo
     *
     * @mbggenerated Tue Jun 02 16:21:13 CST 2020
     */
    List<Wxinfo> selectByExample(WxinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxinfo
     *
     * @mbggenerated Tue Jun 02 16:21:13 CST 2020
     */
    Wxinfo selectByPrimaryKey(String openid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxinfo
     *
     * @mbggenerated Tue Jun 02 16:21:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") Wxinfo record, @Param("example") WxinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxinfo
     *
     * @mbggenerated Tue Jun 02 16:21:13 CST 2020
     */
    int updateByExample(@Param("record") Wxinfo record, @Param("example") WxinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxinfo
     *
     * @mbggenerated Tue Jun 02 16:21:13 CST 2020
     */
    int updateByPrimaryKeySelective(Wxinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxinfo
     *
     * @mbggenerated Tue Jun 02 16:21:13 CST 2020
     */
    int updateByPrimaryKey(Wxinfo record);
}