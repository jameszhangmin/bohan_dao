package com.bohan.bohan_dao.dao;

import org.apache.ibatis.session.SqlSession;

import com.bohan.bohan_dao.domain.ImWtyw;
import com.bohan.bohan_dao.mapper.ImWtywMapperR;

public class ImWtywDaoRImpl implements ImWtywDaoR {

	public ImWtyw getImWtywByTCID(SqlSession sqlSession, String tcid) {
		ImWtywMapperR mapperR = sqlSession.getMapper(ImWtywMapperR.class);
		return mapperR.getImWtywByTCID(tcid);
	}

}
