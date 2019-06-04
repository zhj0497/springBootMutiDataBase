package com.cnepay.springstudy.domain;

import java.util.Date;

public class ChannelTemplateBodyConfig {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channel_template_body_config.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channel_template_body_config.channel_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Long channelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channel_template_body_config.template_body_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Long templateBodyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channel_template_body_config.create_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channel_template_body_config.update_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channel_template_body_config.context
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private String context;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channel_template_body_config.id
     *
     * @return the value of channel_template_body_config.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channel_template_body_config.id
     *
     * @param id the value for channel_template_body_config.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channel_template_body_config.channel_id
     *
     * @return the value of channel_template_body_config.channel_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channel_template_body_config.channel_id
     *
     * @param channelId the value for channel_template_body_config.channel_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channel_template_body_config.template_body_id
     *
     * @return the value of channel_template_body_config.template_body_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Long getTemplateBodyId() {
        return templateBodyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channel_template_body_config.template_body_id
     *
     * @param templateBodyId the value for channel_template_body_config.template_body_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setTemplateBodyId(Long templateBodyId) {
        this.templateBodyId = templateBodyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channel_template_body_config.create_date
     *
     * @return the value of channel_template_body_config.create_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channel_template_body_config.create_date
     *
     * @param createDate the value for channel_template_body_config.create_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channel_template_body_config.update_date
     *
     * @return the value of channel_template_body_config.update_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channel_template_body_config.update_date
     *
     * @param updateDate the value for channel_template_body_config.update_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channel_template_body_config.context
     *
     * @return the value of channel_template_body_config.context
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channel_template_body_config.context
     *
     * @param context the value for channel_template_body_config.context
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}