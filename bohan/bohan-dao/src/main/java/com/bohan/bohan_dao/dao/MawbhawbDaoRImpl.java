package com.bohan.bohan_dao.dao;

import org.apache.ibatis.session.SqlSession;

import com.bohan.bohan_dao.domain.Mawbhawb;
import com.bohan.bohan_dao.mapper.MawbhawbMapperR;

public class MawbhawbDaoRImpl implements MawbhawbDaoR {

	public Mawbhawb getMawbhawbByHawb(SqlSession sqlSession, String hawb) {
		MawbhawbMapperR mawbhawbMapperR = sqlSession.getMapper(MawbhawbMapperR.class);
		return mawbhawbMapperR.getMawbhawbByHawb(hawb);
	}

}
