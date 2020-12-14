package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author sunyunbo
 * @email 15720606503@atguigu.com
 * @date 2020-12-14 18:54:50
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
