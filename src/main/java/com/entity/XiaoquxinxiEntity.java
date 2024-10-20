package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 小区信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
@TableName("xiaoquxinxi")
public class XiaoquxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoquxinxiEntity() {
		
	}
	
	public XiaoquxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 小区名称
	 */
					
	private String xiaoqumingcheng;
	
	/**
	 * 小区类型
	 */
					
	private String xiaoquleixing;
	
	/**
	 * 物业名称
	 */
					
	private String wuyemingcheng;
	
	/**
	 * 小区人数
	 */
					
	private Integer xiaoqurenshu;
	
	/**
	 * 小区位置
	 */
					
	private String xiaoquweizhi;
	
	/**
	 * 小区简介
	 */
					
	private String xiaoqujianjie;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：小区名称
	 */
	public void setXiaoqumingcheng(String xiaoqumingcheng) {
		this.xiaoqumingcheng = xiaoqumingcheng;
	}
	/**
	 * 获取：小区名称
	 */
	public String getXiaoqumingcheng() {
		return xiaoqumingcheng;
	}
	/**
	 * 设置：小区类型
	 */
	public void setXiaoquleixing(String xiaoquleixing) {
		this.xiaoquleixing = xiaoquleixing;
	}
	/**
	 * 获取：小区类型
	 */
	public String getXiaoquleixing() {
		return xiaoquleixing;
	}
	/**
	 * 设置：物业名称
	 */
	public void setWuyemingcheng(String wuyemingcheng) {
		this.wuyemingcheng = wuyemingcheng;
	}
	/**
	 * 获取：物业名称
	 */
	public String getWuyemingcheng() {
		return wuyemingcheng;
	}
	/**
	 * 设置：小区人数
	 */
	public void setXiaoqurenshu(Integer xiaoqurenshu) {
		this.xiaoqurenshu = xiaoqurenshu;
	}
	/**
	 * 获取：小区人数
	 */
	public Integer getXiaoqurenshu() {
		return xiaoqurenshu;
	}
	/**
	 * 设置：小区位置
	 */
	public void setXiaoquweizhi(String xiaoquweizhi) {
		this.xiaoquweizhi = xiaoquweizhi;
	}
	/**
	 * 获取：小区位置
	 */
	public String getXiaoquweizhi() {
		return xiaoquweizhi;
	}
	/**
	 * 设置：小区简介
	 */
	public void setXiaoqujianjie(String xiaoqujianjie) {
		this.xiaoqujianjie = xiaoqujianjie;
	}
	/**
	 * 获取：小区简介
	 */
	public String getXiaoqujianjie() {
		return xiaoqujianjie;
	}

}
