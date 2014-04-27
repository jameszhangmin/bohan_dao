package com.bohan.bohan_dao.dao;

import org.apache.ibatis.session.SqlSession;

import com.bohan.bohan_dao.domain.ImWtyw;

public interface ImWtywDaoR {
	/**
	 * get getImWtywByTCID by tcid.
	 * @param sqlSession
	 * @param tcid
	 * @return
	 */
	public ImWtyw getImWtywByTCID(SqlSession sqlSession, String tcid);
}
