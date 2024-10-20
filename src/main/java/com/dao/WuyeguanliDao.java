package com.dao;

import com.entity.WuyeguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuyeguanliVO;
import com.entity.view.WuyeguanliView;


/**
 * 物业管理
 * 
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
public interface WuyeguanliDao extends BaseMapper<WuyeguanliEntity> {
	
	List<WuyeguanliVO> selectListVO(@Param("ew") Wrapper<WuyeguanliEntity> wrapper);
	
	WuyeguanliVO selectVO(@Param("ew") Wrapper<WuyeguanliEntity> wrapper);
	
	List<WuyeguanliView> selectListView(@Param("ew") Wrapper<WuyeguanliEntity> wrapper);

	List<WuyeguanliView> selectListView(Pagination page,@Param("ew") Wrapper<WuyeguanliEntity> wrapper);
	
	WuyeguanliView selectView(@Param("ew") Wrapper<WuyeguanliEntity> wrapper);
	

}
