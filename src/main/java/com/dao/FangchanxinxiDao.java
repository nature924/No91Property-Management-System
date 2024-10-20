package com.dao;

import com.entity.FangchanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangchanxinxiVO;
import com.entity.view.FangchanxinxiView;


/**
 * 房产信息
 * 
 * @author 
 * @email 
 * @date 2023-02-25 16:19:37
 */
public interface FangchanxinxiDao extends BaseMapper<FangchanxinxiEntity> {
	
	List<FangchanxinxiVO> selectListVO(@Param("ew") Wrapper<FangchanxinxiEntity> wrapper);
	
	FangchanxinxiVO selectVO(@Param("ew") Wrapper<FangchanxinxiEntity> wrapper);
	
	List<FangchanxinxiView> selectListView(@Param("ew") Wrapper<FangchanxinxiEntity> wrapper);

	List<FangchanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FangchanxinxiEntity> wrapper);
	
	FangchanxinxiView selectView(@Param("ew") Wrapper<FangchanxinxiEntity> wrapper);
	

}
