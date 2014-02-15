package com.bohan.bohan_dao.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.bohan.bohan_dao.domain.Mawbhawb;
import com.bohan.bohan_dao.mapper.MawbhawbMapperR;

public class MawbhawbDaoRImpl implements MawbhawbDaoR {

	public Mawbhawb getMawbhawbByHawb(SqlSession sqlSession, String hawb) {
		MawbhawbMapperR mawbhawbMapperR = sqlSession.getMapper(MawbhawbMapperR.class);
		return mawbhawbMapperR.getMawbhawbByHawb(hawb);
	}

	public List<Mawbhawb> getMawbhawbByQuery(SqlSession sqlSession,
			List<String> keywordList) {
		MawbhawbMapperR mawbhawbMapperR = sqlSession.getMapper(MawbhawbMapperR.class);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("keywordList", keywordList);
		return mawbhawbMapperR.getMawbhawbByQuery(map);
	}

}
