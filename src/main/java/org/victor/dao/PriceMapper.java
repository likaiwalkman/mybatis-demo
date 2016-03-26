package org.victor.dao;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.victor.model.Price;
import org.victor.model.PriceExample;

public interface PriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Price
     *
     * @mbggenerated
     */
    int countByExample(PriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Price
     *
     * @mbggenerated
     */
    int deleteByExample(PriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Price
     *
     * @mbggenerated
     */
    @Delete({
        "delete from Price",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Price
     *
     * @mbggenerated
     */
    @Insert({
        "insert into Price (id, flightId, ",
        "price, tax, company)",
        "values (#{id,jdbcType=INTEGER}, #{flightid,jdbcType=INTEGER}, ",
        "#{price,jdbcType=VARCHAR}, #{tax,jdbcType=VARCHAR}, #{company,jdbcType=VARCHAR})"
    })
    int insert(Price record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Price
     *
     * @mbggenerated
     */
    int insertSelective(Price record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Price
     *
     * @mbggenerated
     */
    List<Price> selectByExample(PriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Price
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, flightId, price, tax, company",
        "from Price",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Price selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Price
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Price record, @Param("example") PriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Price
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Price record, @Param("example") PriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Price
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Price record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Price
     *
     * @mbggenerated
     */
    @Update({
        "update Price",
        "set flightId = #{flightid,jdbcType=INTEGER},",
          "price = #{price,jdbcType=VARCHAR},",
          "tax = #{tax,jdbcType=VARCHAR},",
          "company = #{company,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Price record);
}