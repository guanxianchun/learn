package com.guanxc.mybatis.bean;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_user_id
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_login_name
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_display_name
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private String displayName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_type
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_mail_address
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private String mailAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_company_name
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private String companyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_create_time
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_phone
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_description
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_password_complexity
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private Byte passwordComplexity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_modify_passwd_time
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private Date modifyPasswdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_login_failed_time
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private Date loginFailedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_enabled
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private Byte enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_user_group
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private Integer userGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_failed_times
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private Integer failedTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_func_map
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private String funcMap;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_duties
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private String duties;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_locked
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private Byte locked;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_auto_unlock_time
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private Date autoUnlockTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_user_type
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private Byte userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_dept_id
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private Integer deptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_user_register_type
     *
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    private Byte userRegisterType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_user_id
     *
     * @return the value of t_user.f_user_id
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_user_id
     *
     * @param userId the value for t_user.f_user_id
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_login_name
     *
     * @return the value of t_user.f_login_name
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_login_name
     *
     * @param loginName the value for t_user.f_login_name
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_display_name
     *
     * @return the value of t_user.f_display_name
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_display_name
     *
     * @param displayName the value for t_user.f_display_name
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_type
     *
     * @return the value of t_user.f_type
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_type
     *
     * @param type the value for t_user.f_type
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_mail_address
     *
     * @return the value of t_user.f_mail_address
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_mail_address
     *
     * @param mailAddress the value for t_user.f_mail_address
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress == null ? null : mailAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_company_name
     *
     * @return the value of t_user.f_company_name
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_company_name
     *
     * @param companyName the value for t_user.f_company_name
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_create_time
     *
     * @return the value of t_user.f_create_time
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_create_time
     *
     * @param createTime the value for t_user.f_create_time
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_phone
     *
     * @return the value of t_user.f_phone
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_phone
     *
     * @param phone the value for t_user.f_phone
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_description
     *
     * @return the value of t_user.f_description
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_description
     *
     * @param description the value for t_user.f_description
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_password_complexity
     *
     * @return the value of t_user.f_password_complexity
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public Byte getPasswordComplexity() {
        return passwordComplexity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_password_complexity
     *
     * @param passwordComplexity the value for t_user.f_password_complexity
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setPasswordComplexity(Byte passwordComplexity) {
        this.passwordComplexity = passwordComplexity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_modify_passwd_time
     *
     * @return the value of t_user.f_modify_passwd_time
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public Date getModifyPasswdTime() {
        return modifyPasswdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_modify_passwd_time
     *
     * @param modifyPasswdTime the value for t_user.f_modify_passwd_time
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setModifyPasswdTime(Date modifyPasswdTime) {
        this.modifyPasswdTime = modifyPasswdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_login_failed_time
     *
     * @return the value of t_user.f_login_failed_time
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public Date getLoginFailedTime() {
        return loginFailedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_login_failed_time
     *
     * @param loginFailedTime the value for t_user.f_login_failed_time
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setLoginFailedTime(Date loginFailedTime) {
        this.loginFailedTime = loginFailedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_enabled
     *
     * @return the value of t_user.f_enabled
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public Byte getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_enabled
     *
     * @param enabled the value for t_user.f_enabled
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_user_group
     *
     * @return the value of t_user.f_user_group
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public Integer getUserGroup() {
        return userGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_user_group
     *
     * @param userGroup the value for t_user.f_user_group
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setUserGroup(Integer userGroup) {
        this.userGroup = userGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_failed_times
     *
     * @return the value of t_user.f_failed_times
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public Integer getFailedTimes() {
        return failedTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_failed_times
     *
     * @param failedTimes the value for t_user.f_failed_times
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setFailedTimes(Integer failedTimes) {
        this.failedTimes = failedTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_func_map
     *
     * @return the value of t_user.f_func_map
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public String getFuncMap() {
        return funcMap;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_func_map
     *
     * @param funcMap the value for t_user.f_func_map
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setFuncMap(String funcMap) {
        this.funcMap = funcMap == null ? null : funcMap.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_duties
     *
     * @return the value of t_user.f_duties
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public String getDuties() {
        return duties;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_duties
     *
     * @param duties the value for t_user.f_duties
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setDuties(String duties) {
        this.duties = duties == null ? null : duties.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_locked
     *
     * @return the value of t_user.f_locked
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public Byte getLocked() {
        return locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_locked
     *
     * @param locked the value for t_user.f_locked
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_auto_unlock_time
     *
     * @return the value of t_user.f_auto_unlock_time
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public Date getAutoUnlockTime() {
        return autoUnlockTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_auto_unlock_time
     *
     * @param autoUnlockTime the value for t_user.f_auto_unlock_time
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setAutoUnlockTime(Date autoUnlockTime) {
        this.autoUnlockTime = autoUnlockTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_user_type
     *
     * @return the value of t_user.f_user_type
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public Byte getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_user_type
     *
     * @param userType the value for t_user.f_user_type
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_dept_id
     *
     * @return the value of t_user.f_dept_id
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_dept_id
     *
     * @param deptId the value for t_user.f_dept_id
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_user_register_type
     *
     * @return the value of t_user.f_user_register_type
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public Byte getUserRegisterType() {
        return userRegisterType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_user_register_type
     *
     * @param userRegisterType the value for t_user.f_user_register_type
     * @mbg.generated Sun Jan 27 12:01:07 CST 2019
     */
    public void setUserRegisterType(Byte userRegisterType) {
        this.userRegisterType = userRegisterType;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", loginName='" + loginName + '\'' +
                ", displayName='" + displayName + '\'' +
                ", type=" + type +
                ", mailAddress='" + mailAddress + '\'' +
                ", companyName='" + companyName + '\'' +
                ", createTime=" + createTime +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                ", passwordComplexity=" + passwordComplexity +
                ", modifyPasswdTime=" + modifyPasswdTime +
                ", loginFailedTime=" + loginFailedTime +
                ", enabled=" + enabled +
                ", userGroup=" + userGroup +
                ", failedTimes=" + failedTimes +
                ", funcMap='" + funcMap + '\'' +
                ", duties='" + duties + '\'' +
                ", locked=" + locked +
                ", autoUnlockTime=" + autoUnlockTime +
                ", userType=" + userType +
                ", deptId=" + deptId +
                ", userRegisterType=" + userRegisterType +
                '}';
    }
}