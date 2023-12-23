package com.gu.controller.board;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gu.domain.BoardVO;
import com.gu.service.board.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	// DI 의존성 주입 생성자 메서드 주입방식(bean으로 등록 되어 있기 때문에 가능한 방법)
	private BoardService boardService;
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}

	@GetMapping("/boardList")
	public String getBoardList(Model model) {
		
		List<BoardVO> boardList = boardService.getBoardList();
		
		model.addAttribute("boardList", boardList);
		
		return "board/boardList";
	}
}
