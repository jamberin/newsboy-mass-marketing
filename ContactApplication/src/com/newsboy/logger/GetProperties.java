package com.newsboy.logger;

import java.util.Properties;
import java.io.IOException;

public class GetProperties {
	
	private static Properties getDefaultProperties() {
		Properties props = new Properties();
		try {
			props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			//TODO add logger to exception to catch 
			e.printStackTrace();
		}
		return props;
	}
	
	public static String getDefaultFilePathRoot() {
		String root = "";
		Properties props = getDefaultProperties();
		root = props.getProperty("path.root");
		return root;
	}
	
	public static String getDefaultLoggerPath() {
		String path = getDefaultFilePathRoot() + "/AppLogs/default.log";
		return path;
	}
}
