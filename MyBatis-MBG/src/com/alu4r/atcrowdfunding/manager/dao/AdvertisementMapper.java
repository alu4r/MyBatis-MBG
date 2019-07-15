package com.alu4r.atcrowdfunding.manager.dao;

import com.alu4r.atcrowdfunding.bean.Advertisement;
import java.util.List;

public interface AdvertisementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    int insert(Advertisement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    Advertisement selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    List<Advertisement> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertisement
     *
     * @mbg.generated Mon Jul 15 16:17:09 CST 2019
     */
    int updateByPrimaryKey(Advertisement record);
}