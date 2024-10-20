package com.entity.vo;

import com.entity.XiaoquxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 小区信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
public class XiaoquxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
