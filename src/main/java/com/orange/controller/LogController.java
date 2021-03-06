package com.orange.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orange.utils.PropertiesUtils;

@RestController
public class LogController {
	
	private final static Logger logger = LoggerFactory.getLogger(LogController.class);
	
	// region Log methods
	
	/**
	 * 通过requestparam获取请求值
	 * @param id
	 */
	@RequestMapping("/log")
	public void log(){
		System.out.println(PropertiesUtils.getString("elasticsearch.cluster.nodes"));
		logger.info("1111");
		logger.error("2222");
	}
	
	// endregion Log methods

}
