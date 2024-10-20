package com.entity.view;

import com.entity.TingcheweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 停车位
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
@TableName("tingchewei")
public class TingcheweiView  extends TingcheweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TingcheweiView(){
	}
 
 	public TingcheweiView(TingcheweiEntity tingcheweiEntity){
 	try {
			BeanUtils.copyProperties(this, tingcheweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
