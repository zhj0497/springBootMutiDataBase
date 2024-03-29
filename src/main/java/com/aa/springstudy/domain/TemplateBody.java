package com.aa.springstudy.domain;

import java.util.Date;

public class TemplateBody {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template_body.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template_body.context
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private String context;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template_body.update_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template_body.create_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template_body.body_code
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private String bodyCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template_body.id
     *
     * @return the value of template_body.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template_body.id
     *
     * @param id the value for template_body.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template_body.context
     *
     * @return the value of template_body.context
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template_body.context
     *
     * @param context the value for template_body.context
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template_body.update_date
     *
     * @return the value of template_body.update_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template_body.update_date
     *
     * @param updateDate the value for template_body.update_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template_body.create_date
     *
     * @return the value of template_body.create_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template_body.create_date
     *
     * @param createDate the value for template_body.create_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template_body.body_code
     *
     * @return the value of template_body.body_code
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public String getBodyCode() {
        return bodyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template_body.body_code
     *
     * @param bodyCode the value for template_body.body_code
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setBodyCode(String bodyCode) {
        this.bodyCode = bodyCode == null ? null : bodyCode.trim();
    }
}