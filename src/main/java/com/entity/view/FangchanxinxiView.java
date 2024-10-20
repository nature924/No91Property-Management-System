package com.entity.view;

import com.entity.FangchanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 房产信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
@TableName("fangchanxinxi")
public class FangchanxinxiView  extends FangchanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangchanxinxiView(){
	}
 
 	public FangchanxinxiView(FangchanxinxiEntity fangchanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, fangchanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
