package com.atguigu.server;

import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.bean.T_MALL_USER_ACCOUNT;
import com.atguigu.service.UserService;

public class UserServerImp implements UserServer {

	@Autowired
	private UserService userService;

	@Override
	public T_MALL_USER_ACCOUNT login(T_MALL_USER_ACCOUNT user) {
		T_MALL_USER_ACCOUNT login = userService.login(user);
		return login;
	}

}
