package com.aa.springstudy.mapper;

import com.aa.springstudy.domain.ChannelTemplateConfig;

public interface ChannelTemplateConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_template_config
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_template_config
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    int insert(ChannelTemplateConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_template_config
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    int insertSelective(ChannelTemplateConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_template_config
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    ChannelTemplateConfig selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_template_config
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    int updateByPrimaryKeySelective(ChannelTemplateConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_template_config
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    int updateByPrimaryKey(ChannelTemplateConfig record);
}