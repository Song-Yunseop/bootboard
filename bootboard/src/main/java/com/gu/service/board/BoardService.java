package com.gu.service.board;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gu.domain.BoardVO;
import com.gu.mapper.board.BoardMapper;


@Service
@Transactional
public class BoardService {

	// DI 의존성 주입 생성자 메서드 주입방식
	private BoardMapper boardMapper;
	
	public BoardService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}
	
	public List<BoardVO> getBoardList() {
		List<BoardVO> boardList = boardMapper.getBoardList();
		
		return boardList;
	}
}
