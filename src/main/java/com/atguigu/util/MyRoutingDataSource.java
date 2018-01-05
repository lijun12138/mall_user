package com.atguigu.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyRoutingDataSource extends AbstractRoutingDataSource {
	
	private static ThreadLocal<String> key_local = new ThreadLocal<>();

	public static void setKey(String key) {
		key_local.set(key);
	}
	public static String getKey() {
		String key = key_local.get();
		return key;
	}
	
	public static void clearKey() {
		key_local.remove();
	}
	
	@Override
	protected Object determineCurrentLookupKey() {
		return getKey();
	}

}
