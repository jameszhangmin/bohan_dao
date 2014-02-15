package com.bohan.bohan_srv.service;

import java.util.List;

import com.bohan.bohan_dao.domain.Mawbhawb;


public interface MawbhawbService {

	public Mawbhawb getMawbhawbByHawb(String hawb);
	
	public List<Mawbhawb> getMawbhawbByQuery(List<String> keywordList);
	
}
