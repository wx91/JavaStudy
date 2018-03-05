package com.wangx.testng;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.Matchers.not;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNotSame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertTest {

	private User tom;

	private User john;

	@BeforeMethod
	public void init() {
		tom = new User();
		tom.setUserId(1);
		tom.setUserName("tom");
		tom.setCredit(100);

		john = new User();
		john.setUserId(2);
		john.setUserName("john");
		john.setCredit(50);
	}

	@Test
	public void testAssert() {
		// 测试user1的访问IP是否等于user2的访问IP
		assertEquals(tom.getLastIp(), john.getLastIp());
		// 测试user1是否不为空
		assertNotNull(tom);
		// 测试user1和user2引用不是同一个对象。
		assertNotSame(tom, john);
	}

	@Test
	public void testAasertThat() {
		// 1. 数值匹配符
		// 测试变量的值是否大于指定值
		assertThat(tom.getCredit(), greaterThan(50));
		// 测试变量的值小于指定值时
		assertThat(tom.getCredit(), lessThan(150));
		// 测试变量的值大于等于指定值
		assertThat(tom.getCredit(), greaterThanOrEqualTo(100));
		// 测试变量的值小于等于指定值
		assertThat(tom.getCredit(), lessThanOrEqualTo(100));
		assertThat(tom.getCredit(), anything());
		// 测试变量的值等于指定值
		assertThat(tom.getCredit(), is(100));
		// 测试和is相反，变量的值不等于指定值
		assertThat(tom.getCredit(), not(50));

		// 2. 集合匹配符
		List<User> users = new ArrayList<User>();
		users.add(tom);
		users.add(john);
		// 测试变量中是否含有指定元素
		assertThat(users, hasItem(tom));
		assertThat(users, hasItem(john));
		// 3. Map匹配符
		Map<String, User> userMap = new HashMap<String, User>();
		userMap.put(tom.getUserName(), tom);
		userMap.put(john.getUserName(), john);
		// 测试Map变量中是否含有指定键值对
		// assertThat(userMap, hasEntry(tom.getUserName(), tom));
		// 测试Map变量中是否含有指定键
		// assertThat(userMap, hasKey(john.getUserName()));
		// 测试Map变量中是否含有指定值
		// assertThat(userMap, hasValue(john));
	}
}
