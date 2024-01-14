package com.gu.controller.user;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gu.domain.JwtToken;
import com.gu.domain.UserVO;
import com.gu.service.user.UserService;

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
	public ResponseEntity<JwtToken> loginSuccess(@RequestBody Map<String, String> loginForm) {
		JwtToken token = userService.login(loginForm.get("username"), loginForm.get("password"));
		return ResponseEntity.ok(token);
	}

}
