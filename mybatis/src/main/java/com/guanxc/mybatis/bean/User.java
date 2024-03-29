package com.guanxc.mybatis.bean;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_users.f_id
     *
     * @mbg.generated Mon Jan 28 13:43:22 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_users.f_user_name
     *
     * @mbg.generated Mon Jan 28 13:43:22 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_users.f_age
     *
     * @mbg.generated Mon Jan 28 13:43:22 CST 2019
     */
    private Byte age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_users.f_address
     *
     * @mbg.generated Mon Jan 28 13:43:22 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_users.f_sex
     *
     * @mbg.generated Mon Jan 28 13:43:22 CST 2019
     */
    private String sex;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_users.f_id
     *
     * @return the value of t_users.f_id
     *
     * @mbg.generated Mon Jan 28 13:43:22 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_users.f_id
     *
     * @param id the value for t_users.f_id
     *
     * @mbg.generated Mon Jan 28 13:43:22 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_users.f_user_name
     *
     * @return the value of t_users.f_user_name
     *
     * @mbg.generated Mon Jan 28 13:43:22 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_users.f_user_name
     *
     * @param userName the value for t_users.f_user_name
     *
     * @mbg.generated Mon Jan 28 13:43:22 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_users.f_age
     *
     * @return the value of t_users.f_age
     *
     * @mbg.generated Mon Jan 28 13:43:22 CST 2019
     */
    public Byte getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_users.f_age
     *
     * @param age the value for t_users.f_age
     *
     * @mbg.generated Mon Jan 28 13:43:22 CST 2019
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_users.f_address
     *
     * @return the value of t_users.f_address
     *
     * @mbg.generated Mon Jan 28 13:43:22 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_users.f_address
     *
     * @param address the value for t_users.f_address
     *
     * @mbg.generated Mon Jan 28 13:43:22 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_users.f_sex
     *
     * @return the value of t_users.f_sex
     *
     * @mbg.generated Mon Jan 28 13:43:22 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_users.f_sex
     *
     * @param sex the value for t_users.f_sex
     *
     * @mbg.generated Mon Jan 28 13:43:22 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}