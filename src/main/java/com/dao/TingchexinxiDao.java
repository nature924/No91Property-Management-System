package com.dao;

import com.entity.TingchexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TingchexinxiVO;
import com.entity.view.TingchexinxiView;


/**
 * 停车信息
 * 
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
public interface TingchexinxiDao extends BaseMapper<TingchexinxiEntity> {
	
	List<TingchexinxiVO> selectListVO(@Param("ew") Wrapper<TingchexinxiEntity> wrapper);
	
	TingchexinxiVO selectVO(@Param("ew") Wrapper<TingchexinxiEntity> wrapper);
	
	List<TingchexinxiView> selectListView(@Param("ew") Wrapper<TingchexinxiEntity> wrapper);

	List<TingchexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TingchexinxiEntity> wrapper);
	
	TingchexinxiView selectView(@Param("ew") Wrapper<TingchexinxiEntity> wrapper);
	

}
