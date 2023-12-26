package com.gu.mapper.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.gu.domain.BoardVO;

@Mapper
@Repository
public interface BoardMapper {
	
	//게시판 전체목록 조회
	public List<BoardVO> getBoardList();
}
