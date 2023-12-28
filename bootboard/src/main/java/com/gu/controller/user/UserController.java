package com.gu.controller.user;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gu.domain.UserVO;
import com.gu.service.user.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;
	
	@GetMapping("/userList")
	public String getUserList(Model model)  throws Exception {
		
		List<UserVO> userList = userService.getUserList();
		
		model.addAttribute("userList", userList);
		
		return "/user/userList";
	}
	
	@GetMapping("/login")
	public void getLogin() throws Exception {
		System.out.println("123");
	}
	
	@PostMapping("/login")
	public String login(UserVO vo, HttpServletRequest req) throws Exception {
		
		System.out.println("456");
		
		HttpSession session = req.getSession();
		
		UserVO login = userService.login(vo);
		
		if(login == null) {
			session.setAttribute("user", null);
		} else {
			session.setAttribute("user", login);
		}
		
		return "/user/userList";
	}
}
