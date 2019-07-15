package com.alu4r.atcrowdfunding.manager.dao;

import com.alu4r.atcrowdfunding.bean.Member;
import java.util.List;

public interface MemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    int insert(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    Member selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    List<Member> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    int updateByPrimaryKey(Member record);
}