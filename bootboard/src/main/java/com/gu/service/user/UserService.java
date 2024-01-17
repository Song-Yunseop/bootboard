package com.gu.service.user;

import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gu.domain.JwtToken;
import com.gu.domain.UserVO;
import com.gu.mapper.user.UserMapper;
import com.gu.security.JwtTokenProvider;

import lombok.RequiredArgsConstructor;


@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

	private final BCryptPasswordEncoder encoder;
	private final UserMapper userMapper;
	private final AuthenticationManagerBuilder authenticationManagerBuilder;
	private final JwtTokenProvider jwtTokenProvider;
	
	public List<UserVO> getUserList() throws Exception {
		List<UserVO> userList = userMapper.getUserList();
		
		return userList;
	}
	
	public JwtToken login(String name, String pw) {
		// Authentication 객체 생성
		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(name, pw);
		Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
		
		// 검증된 인증 정보로 JWT 토큰 생성
		JwtToken token = jwtTokenProvider.generateToken(authentication);
		return token;
	}
	
}
