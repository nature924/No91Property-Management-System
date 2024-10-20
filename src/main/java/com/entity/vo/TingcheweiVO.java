package com.entity.vo;

import com.entity.TingcheweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 停车位
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
public class TingcheweiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车位区号
	 */
	
	private String cheweiquhao;
		
	/**
	 * 车位编号
	 */
	
	private String cheweibianhao;
		
	/**
	 * 车场类型
	 */
	
	private String chechangleixing;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
				
	
	/**
	 * 设置：车位区号
	 */
	 
	public void setCheweiquhao(String cheweiquhao) {
		this.cheweiquhao = cheweiquhao;
	}
	
	/**
	 * 获取：车位区号
	 */
	public String getCheweiquhao() {
		return cheweiquhao;
	}
				
	
	/**
	 * 设置：车位编号
	 */
	 
	public void setCheweibianhao(String cheweibianhao) {
		this.cheweibianhao = cheweibianhao;
	}
	
	/**
	 * 获取：车位编号
	 */
	public String getCheweibianhao() {
		return cheweibianhao;
	}
				
	
	/**
	 * 设置：车场类型
	 */
	 
	public void setChechangleixing(String chechangleixing) {
		this.chechangleixing = chechangleixing;
	}
	
	/**
	 * 获取：车场类型
	 */
	public String getChechangleixing() {
		return chechangleixing;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
			
}
