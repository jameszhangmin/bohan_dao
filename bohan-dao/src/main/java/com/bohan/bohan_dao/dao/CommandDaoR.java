package com.bohan.bohan_dao.dao;

import org.apache.ibatis.session.SqlSession;
import com.mobage.shaoshujue_dao.domain.Command;

public interface CommandDaoR {
	/**
	 * get command by id.
	 * @param sqlSession
	 * @param id
	 * @return
	 */
	Command getCommandById(SqlSession sqlSession, Long id);
	
	
	/**
	 * get command by  alias
	 * @param sqlSession
	 * @param appIdList
	 * @param commandText
	 * @return
	 */
	Command getCommandByAlias1OrAlias2(SqlSession sqlSession, String commandText);
	
}
