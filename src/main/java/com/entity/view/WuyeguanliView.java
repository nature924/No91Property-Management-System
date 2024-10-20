package com.entity.view;

import com.entity.WuyeguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物业管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
@TableName("wuyeguanli")
public class WuyeguanliView  extends WuyeguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuyeguanliView(){
	}
 
 	public WuyeguanliView(WuyeguanliEntity wuyeguanliEntity){
 	try {
			BeanUtils.copyProperties(this, wuyeguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
