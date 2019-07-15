package com.alu4r.atcrowdfunding.manager.dao;

import com.alu4r.atcrowdfunding.bean.Dictionary;
import java.util.List;

public interface DictionaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    int insert(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    Dictionary selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    List<Dictionary> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    int updateByPrimaryKey(Dictionary record);
}