package com.alu4r.atcrowdfunding.manager.dao;

import com.alu4r.atcrowdfunding.bean.Permission;
import java.util.List;

public interface PermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    int insert(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    Permission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    List<Permission> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    int updateByPrimaryKey(Permission record);
}