package com.aa.springstudy.mapper;

import com.aa.springstudy.domain.Template;

public interface TemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    int insert(Template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    int insertSelective(Template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    Template selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    int updateByPrimaryKeySelective(Template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Mon Jun 03 17:25:15 CST 2019
     */
    int updateByPrimaryKey(Template record);
}