package com.gu.service.user;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gu.domain.UserVO;
import com.gu.mapper.user.UserMapper;

import lombok.RequiredArgsConstructor;


@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

	private final UserMapper userMapper;
	
	public List<UserVO> getUserList() throws Exception {
		List<UserVO> userList = userMapper.getUserList();
		
		return userList;
	}
	
	public UserVO login(UserVO vo) throws Exception {
		
		UserVO login = userMapper.login(vo);
		
		return login;
	}
}
