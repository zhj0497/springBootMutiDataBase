package com.aa.springstudy.domain;

import java.util.Date;

public class Template {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template.context
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private String context;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template.template_head_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Long templateHeadId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template.template_body_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Long templateBodyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template.update_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template.create_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column template.template_code
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private String templateCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template.id
     *
     * @return the value of template.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template.id
     *
     * @param id the value for template.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template.context
     *
     * @return the value of template.context
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template.context
     *
     * @param context the value for template.context
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template.template_head_id
     *
     * @return the value of template.template_head_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Long getTemplateHeadId() {
        return templateHeadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template.template_head_id
     *
     * @param templateHeadId the value for template.template_head_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setTemplateHeadId(Long templateHeadId) {
        this.templateHeadId = templateHeadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template.template_body_id
     *
     * @return the value of template.template_body_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Long getTemplateBodyId() {
        return templateBodyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template.template_body_id
     *
     * @param templateBodyId the value for template.template_body_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setTemplateBodyId(Long templateBodyId) {
        this.templateBodyId = templateBodyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template.update_date
     *
     * @return the value of template.update_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template.update_date
     *
     * @param updateDate the value for template.update_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template.create_date
     *
     * @return the value of template.create_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template.create_date
     *
     * @param createDate the value for template.create_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column template.template_code
     *
     * @return the value of template.template_code
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public String getTemplateCode() {
        return templateCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column template.template_code
     *
     * @param templateCode the value for template.template_code
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode == null ? null : templateCode.trim();
    }
}