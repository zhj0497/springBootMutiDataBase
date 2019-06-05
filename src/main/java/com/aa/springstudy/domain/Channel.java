package com.aa.springstudy.domain;

import java.util.Date;

public class Channel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channel.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channel.channel_code
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private String channelCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channel.channel_name
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private String channelName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channel.notify_url
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private String notifyUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channel.status
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channel.create_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channel.update_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channel.has_config
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Short hasConfig;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channel.priority
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Short priority;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channel.id
     *
     * @return the value of channel.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channel.id
     *
     * @param id the value for channel.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channel.channel_code
     *
     * @return the value of channel.channel_code
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channel.channel_code
     *
     * @param channelCode the value for channel.channel_code
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channel.channel_name
     *
     * @return the value of channel.channel_name
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channel.channel_name
     *
     * @param channelName the value for channel.channel_name
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channel.notify_url
     *
     * @return the value of channel.notify_url
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channel.notify_url
     *
     * @param notifyUrl the value for channel.notify_url
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channel.status
     *
     * @return the value of channel.status
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channel.status
     *
     * @param status the value for channel.status
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channel.create_date
     *
     * @return the value of channel.create_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channel.create_date
     *
     * @param createDate the value for channel.create_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channel.update_date
     *
     * @return the value of channel.update_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channel.update_date
     *
     * @param updateDate the value for channel.update_date
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channel.has_config
     *
     * @return the value of channel.has_config
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Short getHasConfig() {
        return hasConfig;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channel.has_config
     *
     * @param hasConfig the value for channel.has_config
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setHasConfig(Short hasConfig) {
        this.hasConfig = hasConfig;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channel.priority
     *
     * @return the value of channel.priority
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Short getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channel.priority
     *
     * @param priority the value for channel.priority
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setPriority(Short priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "id=" + id +
                ", channelCode='" + channelCode + '\'' +
                ", channelName='" + channelName + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
                ", status=" + status +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", hasConfig=" + hasConfig +
                ", priority=" + priority +
                '}';
    }
}