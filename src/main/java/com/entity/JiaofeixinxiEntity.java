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
 * 缴费信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
@TableName("jiaofeixinxi")
public class JiaofeixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaofeixinxiEntity() {
		
	}
	
	public JiaofeixinxiEntity(T t) {
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
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 缴费名称
	 */
					
	private String jiaofeimingcheng;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 业主姓名
	 */
					
	private String yezhuxingming;
	
	/**
	 * 缴费类型
	 */
					
	private String jiaofeileixing;
	
	/**
	 * 缴费明细
	 */
					
	private String jiaofeimingxi;
	
	/**
	 * 需缴金额
	 */
					
	private Float xujiaojine;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：缴费名称
	 */
	public void setJiaofeimingcheng(String jiaofeimingcheng) {
		this.jiaofeimingcheng = jiaofeimingcheng;
	}
	/**
	 * 获取：缴费名称
	 */
	public String getJiaofeimingcheng() {
		return jiaofeimingcheng;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：业主姓名
	 */
	public void setYezhuxingming(String yezhuxingming) {
		this.yezhuxingming = yezhuxingming;
	}
	/**
	 * 获取：业主姓名
	 */
	public String getYezhuxingming() {
		return yezhuxingming;
	}
	/**
	 * 设置：缴费类型
	 */
	public void setJiaofeileixing(String jiaofeileixing) {
		this.jiaofeileixing = jiaofeileixing;
	}
	/**
	 * 获取：缴费类型
	 */
	public String getJiaofeileixing() {
		return jiaofeileixing;
	}
	/**
	 * 设置：缴费明细
	 */
	public void setJiaofeimingxi(String jiaofeimingxi) {
		this.jiaofeimingxi = jiaofeimingxi;
	}
	/**
	 * 获取：缴费明细
	 */
	public String getJiaofeimingxi() {
		return jiaofeimingxi;
	}
	/**
	 * 设置：需缴金额
	 */
	public void setXujiaojine(Float xujiaojine) {
		this.xujiaojine = xujiaojine;
	}
	/**
	 * 获取：需缴金额
	 */
	public Float getXujiaojine() {
		return xujiaojine;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
