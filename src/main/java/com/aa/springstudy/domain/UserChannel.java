package com.aa.springstudy.domain;

public class UserChannel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_channel.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_channel.priority
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Integer priority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_channel.channel_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Long channelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_channel.user_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    private Long userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_channel.id
     *
     * @return the value of user_channel.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_channel.id
     *
     * @param id the value for user_channel.id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_channel.priority
     *
     * @return the value of user_channel.priority
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_channel.priority
     *
     * @param priority the value for user_channel.priority
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_channel.channel_id
     *
     * @return the value of user_channel.channel_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_channel.channel_id
     *
     * @param channelId the value for user_channel.channel_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_channel.user_id
     *
     * @return the value of user_channel.user_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_channel.user_id
     *
     * @param userId the value for user_channel.user_id
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}