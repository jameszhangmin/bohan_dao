package com.bohan.bohan_srv.test;


import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bohan.bohan_dao.domain.Mawbhawb;
import com.bohan.bohan_srv.service.MawbhawbService;


public class MawbhawbServiceTest {
	
	private static ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:spring/serviceSpringInterface.xml");
	private MawbhawbService mawbhawbService = null;

	@Before
	public void setUp() throws Exception {
		mawbhawbService = (MawbhawbService)ac.getBean("mawbhawbService");
	}
	
	@Test
	public void test() {
		String hawb = "00005655";
		Mawbhawb mawbhawb = mawbhawbService.getMawbhawbByHawb(hawb);
		Assert.assertFalse(mawbhawb.equals(null));
	}

}
