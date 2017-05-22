<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="dao.TbOrderCopyDao">
    <resultMap id="resultMap" type="TbOrderDto">
        <id     property="id"            column="id"              jdbcType="INTEGER"  javaType="java.lang.Integer" />
        <result property="billNumber"    column="bill_number"     jdbcType="VARCHAR"  javaType="java.lang.String" />
        <result property="buildDate"     column="build_date"      jdbcType="VARCHAR"  javaType="java.lang.String" />
        <result property="customer"      column="customer"        jdbcType="VARCHAR"  javaType="java.lang.String" />
        <result property="goodsName"     column="goods_name"      jdbcType="VARCHAR"  javaType="java.lang.String" />
        <result property="Amount"        column="amount"          jdbcType="DECIMAL"  javaType="java.math.BigDecimal" />
        <result property="saleMoney"     column="sale_money"      jdbcType="DECIMAL"  javaType="java.math.BigDecimal" />
    </resultMap>

    <insert id="insert" parameterType="TbOrderDto">
        insert into tborder_cp
        <trim prefix="(" suffixOverrides="," suffix=")">
            id,
            <if test="billNumber != null">
                bill_number,
            </if>
            <if test="buildDate != null">
                build_date,
            </if>
            <if test="customer != null">
                customer,
            </if>
            <if test="goodsName != null">
                goods_name,
            </if>
            <if test="Amount != null">
                amount,
            </if>
            <if test="saleMoney != null">
                sale_money,
            </if>
        </trim>
        values
        <trim prefix="(" suffixOverrides="," suffix=")">
            #{id, jdbcType=INTEGER},
            <if test="billNumber != null">
                #{billNumber, jdbcType=VARCHAR},
            </if>
            <if test="buildDate != null">
                #{buildDate, jdbcType=VARCHAR},
            </if>
            <if test="customer != null">
                #{customer, jdbcType=VARCHAR},
            </if>
            <if test="goodsName != null">
                #{goodsName, jdbcType=VARCHAR},
            </if>
            <if test="Amount != null">
                #{Amount, jdbcType=DECIMAL},
            </if>
            <if test="saleMoney != null">
                #{saleMoney, jdbcType=DECIMAL},
            </if>
        </trim>
    </insert>
</mapper>