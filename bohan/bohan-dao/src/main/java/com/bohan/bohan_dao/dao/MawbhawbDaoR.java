package com.bohan.bohan_dao.dao;

import java.util.List;
import java.util.Map;

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
	
	/**
	 * get Mawbhawb by query.
	 * @param keyword list
	 * @return
	 */
	public List<Mawbhawb> getMawbhawbByQuery(SqlSession sqlSession,List<String> keywordList);
	
}
