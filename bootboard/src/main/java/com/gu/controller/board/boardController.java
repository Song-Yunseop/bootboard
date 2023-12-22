package com.gu.controller.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/**")
public class boardController {

	@GetMapping("/board")
	public String getboard() {
		return "/board/board";
	}
}
