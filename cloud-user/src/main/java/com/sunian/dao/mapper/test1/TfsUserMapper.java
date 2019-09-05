package com.sunian.dao.mapper.test1;

import com.sunian.dao.model.test1.TfsUser;
import com.sunian.dao.model.test1.TfsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TfsUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_s_user
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    long countByExample(TfsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_s_user
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    int deleteByExample(TfsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_s_user
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_s_user
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    int insert(TfsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_s_user
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    int insertSelective(TfsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_s_user
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    List<TfsUser> selectByExample(TfsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_s_user
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    TfsUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_s_user
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") TfsUser record, @Param("example") TfsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_s_user
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    int updateByExample(@Param("record") TfsUser record, @Param("example") TfsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_s_user
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(TfsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_s_user
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    int updateByPrimaryKey(TfsUser record);
}