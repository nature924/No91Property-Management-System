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
 * 房产信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
@TableName("fangchanxinxi")
public class FangchanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangchanxinxiEntity() {
		
	}
	
	public FangchanxinxiEntity(T t) {
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
	 * 房屋编号
	 */
					
	private String fangwubianhao;
	
	/**
	 * 房产名
	 */
					
	private String fangchanming;
	
	/**
	 * 房屋类型
	 */
					
	private String fangwuleixing;
	
	/**
	 * 单元号
	 */
					
	private String danyuanhao;
	
	/**
	 * 楼栋
	 */
					
	private String loudong;
	
	/**
	 * 售价
	 */
					
	private Float shoujia;
	
	/**
	 * 建筑年份
	 */
					
	private String jianzhunianfen;
	
	/**
	 * 风格
	 */
					
	private String fengge;
	
	/**
	 * 房屋面积
	 */
					
	private String fangwumianji;
	
	/**
	 * 房屋朝向
	 */
					
	private String fangwuchaoxiang;
	
	/**
	 * 房屋地址
	 */
					
	private String fangwudizhi;
	
	/**
	 * 房屋状态
	 */
					
	private String fangwuzhuangtai;
	
	
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
	 * 设置：房屋编号
	 */
	public void setFangwubianhao(String fangwubianhao) {
		this.fangwubianhao = fangwubianhao;
	}
	/**
	 * 获取：房屋编号
	 */
	public String getFangwubianhao() {
		return fangwubianhao;
	}
	/**
	 * 设置：房产名
	 */
	public void setFangchanming(String fangchanming) {
		this.fangchanming = fangchanming;
	}
	/**
	 * 获取：房产名
	 */
	public String getFangchanming() {
		return fangchanming;
	}
	/**
	 * 设置：房屋类型
	 */
	public void setFangwuleixing(String fangwuleixing) {
		this.fangwuleixing = fangwuleixing;
	}
	/**
	 * 获取：房屋类型
	 */
	public String getFangwuleixing() {
		return fangwuleixing;
	}
	/**
	 * 设置：单元号
	 */
	public void setDanyuanhao(String danyuanhao) {
		this.danyuanhao = danyuanhao;
	}
	/**
	 * 获取：单元号
	 */
	public String getDanyuanhao() {
		return danyuanhao;
	}
	/**
	 * 设置：楼栋
	 */
	public void setLoudong(String loudong) {
		this.loudong = loudong;
	}
	/**
	 * 获取：楼栋
	 */
	public String getLoudong() {
		return loudong;
	}
	/**
	 * 设置：售价
	 */
	public void setShoujia(Float shoujia) {
		this.shoujia = shoujia;
	}
	/**
	 * 获取：售价
	 */
	public Float getShoujia() {
		return shoujia;
	}
	/**
	 * 设置：建筑年份
	 */
	public void setJianzhunianfen(String jianzhunianfen) {
		this.jianzhunianfen = jianzhunianfen;
	}
	/**
	 * 获取：建筑年份
	 */
	public String getJianzhunianfen() {
		return jianzhunianfen;
	}
	/**
	 * 设置：风格
	 */
	public void setFengge(String fengge) {
		this.fengge = fengge;
	}
	/**
	 * 获取：风格
	 */
	public String getFengge() {
		return fengge;
	}
	/**
	 * 设置：房屋面积
	 */
	public void setFangwumianji(String fangwumianji) {
		this.fangwumianji = fangwumianji;
	}
	/**
	 * 获取：房屋面积
	 */
	public String getFangwumianji() {
		return fangwumianji;
	}
	/**
	 * 设置：房屋朝向
	 */
	public void setFangwuchaoxiang(String fangwuchaoxiang) {
		this.fangwuchaoxiang = fangwuchaoxiang;
	}
	/**
	 * 获取：房屋朝向
	 */
	public String getFangwuchaoxiang() {
		return fangwuchaoxiang;
	}
	/**
	 * 设置：房屋地址
	 */
	public void setFangwudizhi(String fangwudizhi) {
		this.fangwudizhi = fangwudizhi;
	}
	/**
	 * 获取：房屋地址
	 */
	public String getFangwudizhi() {
		return fangwudizhi;
	}
	/**
	 * 设置：房屋状态
	 */
	public void setFangwuzhuangtai(String fangwuzhuangtai) {
		this.fangwuzhuangtai = fangwuzhuangtai;
	}
	/**
	 * 获取：房屋状态
	 */
	public String getFangwuzhuangtai() {
		return fangwuzhuangtai;
	}

}
