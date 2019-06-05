package com.aa.springstudy.domain;

import java.util.Date;

public class TemplateHead {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template_head.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template_head.context
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private String context;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template_head.update_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template_head.create_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template_head.head_code
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private String headCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template_head.id
     *
     * @return the value of template_head.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template_head.id
     *
     * @param id the value for template_head.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template_head.context
     *
     * @return the value of template_head.context
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template_head.context
     *
     * @param context the value for template_head.context
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template_head.update_date
     *
     * @return the value of template_head.update_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template_head.update_date
     *
     * @param updateDate the value for template_head.update_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template_head.create_date
     *
     * @return the value of template_head.create_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template_head.create_date
     *
     * @param createDate the value for template_head.create_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template_head.head_code
     *
     * @return the value of template_head.head_code
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public String getHeadCode() {
        return headCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template_head.head_code
     *
     * @param headCode the value for template_head.head_code
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setHeadCode(String headCode) {
        this.headCode = headCode == null ? null : headCode.trim();
    }
}