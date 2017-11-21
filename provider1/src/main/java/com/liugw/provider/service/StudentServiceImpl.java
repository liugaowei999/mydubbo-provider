package com.liugw.provider.service;

import java.util.HashMap;
import java.util.Map;

import com.liugw.provider.service.dubbotest.StudentService;
import com.liugw.provider.service.pojo.Student;

public class StudentServiceImpl implements StudentService {
	private static Map<String, Student> userInfoMap = new HashMap<String, Student>();
	static {
		for (int i = 20; i < 30; i++) {
			Student student = new Student();
			student.setAge(i);
			student.setUserId("ID" + i);
			student.setUserName("student_" + i);
			student.setGrade(i / 10 + "Äê¼¶");
			student.setSex("MAN");
			student.setScore(i);

			userInfoMap.put("" + i, student);
		}
	}

	public Student getUserbyId(String userId) {
		return userInfoMap.get(userId);
	}

	public void addUser(Student user) {
		userInfoMap.put(user.getUserId(), user);
	}

	public String getUserNamebyId(String userId) {
		// TODO Auto-generated method stub
		return userInfoMap.get(userId).getUserName();
	}

	public String getScoreByUserId(String userId) {
		// TODO Auto-generated method stub
		return "" + userInfoMap.get(userId).getScore();
	}

	public String getSexByUserId(String userId) {
		// TODO Auto-generated method stub
		return userInfoMap.get(userId).getSex();
	}

}
