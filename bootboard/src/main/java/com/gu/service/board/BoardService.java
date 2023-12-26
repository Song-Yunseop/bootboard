package com.gu.service.board;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gu.domain.BoardVO;
import com.gu.mapper.board.BoardMapper;

import lombok.RequiredArgsConstructor;


@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {

	private final BoardMapper boardMapper;
	
	public List<BoardVO> getBoardList() throws Exception {
		List<BoardVO> boardList = boardMapper.getBoardList();
		
		return boardList;
	}
}
