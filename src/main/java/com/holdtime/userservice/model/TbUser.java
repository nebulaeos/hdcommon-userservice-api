/**
  * Copyright @ 2015 HoldTime Inner Mongolia Co. Ltd.
  */ 
package com.holdtime.userservice.model;

import com.holdtime.framework.mybatis.annotation.Column;
import com.holdtime.framework.mybatis.annotation.PrimaryKeyGeneration;
import com.holdtime.framework.mybatis.annotation.Table;

/** 
 * 项目名称： jpbaseservice-api<br>
 * 功能描述： TbUser概述：<br>
 * 创  建 人： sunwei<br>
 * 创建日期： 2017-11-14<br>
 * 修  改 人：  <br>
 * 修改时间：<br>
 * 修改内容：<br>
 * 版      本： 1.0.0
 */ 
@Table(value = "TB_USER", primaryKeyGeneration = PrimaryKeyGeneration.UUID_Keys)
public class TbUser {
	public static final String USERID = "USERID";// 用户编号
	public static final String NAME = "NAME";// 姓名
	public static final String SEX = "SEX";// 性别
	public static final String AGE = "AGE";// 年龄
    @Column(value=USERID, isPrimaryKey = true)
    private Integer userid;
    @Column(NAME)
    private String name;
    @Column(SEX)
    private String sex;
    @Column(AGE)
    private Integer age;
    
	/**
	 *取得userid
	 *@return userid 用户编号
	 */
	public Integer getUserid(){
		return userid;
	}

	/**
	 *设置userid
	 *@param userid 用户编号
	 */
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	/**
	 *取得name
	 *@return name 姓名
	 */
	public String getName(){
		return name;
	}

	/**
	 *设置name
	 *@param name 姓名
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 *取得sex
	 *@return sex 性别
	 */
	public String getSex(){
		return sex;
	}

	/**
	 *设置sex
	 *@param sex 性别
	 */
	public void setSex(String sex){
		this.sex = sex;
	}
	/**
	 *取得age
	 *@return age 年龄
	 */
	public Integer getAge(){
		return age;
	}

	/**
	 *设置age
	 *@param age 年龄
	 */
	public void setAge(Integer age){
		this.age = age;
	}
}
