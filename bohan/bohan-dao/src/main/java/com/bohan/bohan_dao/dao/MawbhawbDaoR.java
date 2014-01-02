package com.bohan.bohan_dao.dao;

import org.apache.ibatis.session.SqlSession;

import com.bohan.bohan_dao.domain.Mawbhawb;

public interface MawbhawbDaoR {
	/**
	 * get Mawbhawb by hawb.
	 * @param sqlSession
	 * @param hawb
	 * @return
	 */
	Mawbhawb getMawbhawbByHawb(SqlSession sqlSession, String hawb);
	
}
