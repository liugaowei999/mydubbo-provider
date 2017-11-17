package com.liugw.provider.service;

import java.util.HashMap;
import java.util.Map;

import com.liugw.provider.service.dubbotest.UserService;
import com.liugw.provider.service.pojo.UserInfo;

public class UserServiceImpl implements UserService {

	private static Map<Integer, UserInfo> userInfoMap = new HashMap<Integer, UserInfo>();

	static {
		for (int i = 20; i < 30; i++) {
			UserInfo user = new UserInfo();
			user.setAge(i);
			user.setUserId("ID" + i);
			user.setUserName("DAVID" + i);
			user.setSalary(i * 10000);

			userInfoMap.put(i, user);
		}
	}

	public UserInfo getUserbyId(int userId) {
		UserInfo user = userInfoMap.get(userId);
		System.out.println("Server get the userinfo:" + user.getUserName());
		return user;
	}

	public void addUser(UserInfo user) {
		// TODO Auto-generated method stub
		System.out.println("Server receive the user:" + user.getUserName());
	}

}
