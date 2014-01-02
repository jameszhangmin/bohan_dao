package com.bohan.bohan_dao.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

public class MybatisUtil  { 
	private static Logger logger = Logger.getLogger(MybatisUtil.class);
    private static SqlSessionFactory sqlSessionFactory_BOHAN_ERP_R = null;
  
    private final static String CONF_BOHAN_ERP_R = "db_bh_erp_r/mybatis-conf.xml";
    
    static {
    	logger.info(">>>>>>>>>>>>>>>>>INIT MybatisUtil BEGIN<<<<<<<<<<<<<<<<<<<<<");
    	Reader rdr;

		
    	try {
			rdr = Resources.getResourceAsReader(CONF_BOHAN_ERP_R);
			sqlSessionFactory_BOHAN_ERP_R = new SqlSessionFactoryBuilder().build(rdr);
			rdr.close();
    	}catch (IOException e) {
			e.printStackTrace();
		}
		logger.info(">>>>>>>>>>>>>>>>>INIT MybatisUtil FINISH<<<<<<<<<<<<<<<<<<<<<");
    }
    
    
    public static SqlSessionFactory getSqlSessionFactory_BOHAN_ERP_R() {
		return sqlSessionFactory_BOHAN_ERP_R;
	}
}