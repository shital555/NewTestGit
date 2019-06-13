package com.scp.emp.util;

import org.hibernate.cfg.Configuration;

public class Factoryutil {
	
	public static Configuration getConfiguration(){
		return new Configuration().configure("mysql-hibernate.cfg.xml");
	}
}
