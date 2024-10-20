package com.entity.view;

import com.entity.TousuchuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投诉处理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
@TableName("tousuchuli")
public class TousuchuliView  extends TousuchuliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TousuchuliView(){
	}
 
 	public TousuchuliView(TousuchuliEntity tousuchuliEntity){
 	try {
			BeanUtils.copyProperties(this, tousuchuliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
