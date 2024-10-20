package com.entity.vo;

import com.entity.FangchanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 房产信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
public class FangchanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
