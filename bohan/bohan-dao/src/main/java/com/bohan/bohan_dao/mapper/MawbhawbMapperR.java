package com.bohan.bohan_dao.mapper;

import java.util.List;
import java.util.Map;

import com.bohan.bohan_dao.domain.Mawbhawb;

public interface MawbhawbMapperR {
	/**
	 * get Mawbhawb by hawb.
	 * @param hawb
	 * @return
	 */
	public Mawbhawb getMawbhawbByHawb(String hawb);
	
	/**
	 * get Mawbhawb by query.
	 * @param keyword list
	 * @return
	 */
	public List<Mawbhawb> getMawbhawbByQuery(Map map);
	
}
