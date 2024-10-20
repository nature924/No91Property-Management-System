package com.dao;

import com.entity.XiaoqugonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoqugonggaoVO;
import com.entity.view.XiaoqugonggaoView;


/**
 * 小区公告
 * 
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
public interface XiaoqugonggaoDao extends BaseMapper<XiaoqugonggaoEntity> {
	
	List<XiaoqugonggaoVO> selectListVO(@Param("ew") Wrapper<XiaoqugonggaoEntity> wrapper);
	
	XiaoqugonggaoVO selectVO(@Param("ew") Wrapper<XiaoqugonggaoEntity> wrapper);
	
	List<XiaoqugonggaoView> selectListView(@Param("ew") Wrapper<XiaoqugonggaoEntity> wrapper);

	List<XiaoqugonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoqugonggaoEntity> wrapper);
	
	XiaoqugonggaoView selectView(@Param("ew") Wrapper<XiaoqugonggaoEntity> wrapper);
	

}
