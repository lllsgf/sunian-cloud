package com.sunian.dao.model.test1;

public class TfsUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tf_s_user.id
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tf_s_user.name
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tf_s_user.id
     *
     * @return the value of tf_s_user.id
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tf_s_user.id
     *
     * @param id the value for tf_s_user.id
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tf_s_user.name
     *
     * @return the value of tf_s_user.name
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tf_s_user.name
     *
     * @param name the value for tf_s_user.name
     *
     * @mbg.generated Tue Jul 23 15:13:48 GMT+08:00 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}