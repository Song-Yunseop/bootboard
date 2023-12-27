package com.gu.mapper.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.gu.domain.UserVO;

@Mapper
@Repository
public interface UserMapper {
	
	//게시판 전체목록 조회
	public List<UserVO> getUserList();
}
