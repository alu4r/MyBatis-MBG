package com.alu4r.atcrowdfunding.manager.dao;

import com.alu4r.atcrowdfunding.bean.MemberAddress;
import java.util.List;

public interface MemberAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_address
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_address
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    int insert(MemberAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_address
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    MemberAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_address
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    List<MemberAddress> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_member_address
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    int updateByPrimaryKey(MemberAddress record);
}