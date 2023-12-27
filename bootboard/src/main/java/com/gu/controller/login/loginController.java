package com.gu.controller.login;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gu.domain.UserVO;
import com.gu.service.user.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/login")
@RequiredArgsConstructor
public class loginController {

	private final UserService userService;
	
	@GetMapping("/userList")
	public String getUserList(Model model)  throws Exception {
		
		List<UserVO> userList = userService.getUserList();
		
		model.addAttribute("userList", userList);
		
		return "/login/userList";
	}
}
