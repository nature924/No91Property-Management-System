package com.dao;

import com.entity.TousufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TousufenleiVO;
import com.entity.view.TousufenleiView;


/**
 * 投诉分类
 * 
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
public interface TousufenleiDao extends BaseMapper<TousufenleiEntity> {
	
	List<TousufenleiVO> selectListVO(@Param("ew") Wrapper<TousufenleiEntity> wrapper);
	
	TousufenleiVO selectVO(@Param("ew") Wrapper<TousufenleiEntity> wrapper);
	
	List<TousufenleiView> selectListView(@Param("ew") Wrapper<TousufenleiEntity> wrapper);

	List<TousufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<TousufenleiEntity> wrapper);
	
	TousufenleiView selectView(@Param("ew") Wrapper<TousufenleiEntity> wrapper);
	

}
