package com.woniu.a;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.woniu.domain.User;
import com.woniu.utils.MybatisUtils;

public class Aapptest {
@Test
public void testName() throws Exception {
	SqlSession s = MybatisUtils.openSession();
	User user = new User();
	user.setName("a");
	user.setBirthday(new Date());
	user.setMoney(1234.0);
	
	UserMapper mapper = s.getMapper(UserMapper.class);

	
		/*
		 * List<User> u = mapper.find(); for (User user2 : u) {
		 * System.out.println(user2); }
		 */
	
	mapper.delete(1);
	s.close();
	
}
}
