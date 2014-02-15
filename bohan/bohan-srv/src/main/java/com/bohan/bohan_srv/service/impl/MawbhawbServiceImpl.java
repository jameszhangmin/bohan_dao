package com.bohan.bohan_srv.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.bohan.bohan_dao.dao.MawbhawbDaoR;
import com.bohan.bohan_dao.domain.Mawbhawb;
import com.bohan.bohan_dao.util.MybatisUtil;
import com.bohan.bohan_srv.service.MawbhawbService;

public class MawbhawbServiceImpl implements MawbhawbService {
	
	private static Logger logger = Logger.getLogger(MawbhawbServiceImpl.class);
	private static final SqlSessionFactory sqlSessionFactory_bohan_R = MybatisUtil.getSqlSessionFactory_BOHAN_ERP_R();
	
	@Autowired
	@Qualifier("mawbhawbDaoR")
	private MawbhawbDaoR mawbhawbDaoR;
	
	public Mawbhawb getMawbhawbByHawb(String hawb) {
		SqlSession sqlSession = sqlSessionFactory_bohan_R.openSession();
		return mawbhawbDaoR.getMawbhawbByHawb(sqlSession, hawb);
	}

	public List<Mawbhawb> getMawbhawbByQuery(List<String> keywordList) {
		SqlSession sqlSession = sqlSessionFactory_bohan_R.openSession();
		return mawbhawbDaoR.getMawbhawbByQuery(sqlSession, keywordList);
	}

}
