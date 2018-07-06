package com.lyr.shoppingmall.utils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;



/**
 * 缓存上下文(单列模式)
 * @author VIC
 *
 */
public class CacheContext {
	
	/**
	 * 私有化构造函数
	 */
	private CacheContext(){}
	
	/** 单列对象 */
	private static CacheContext cacheContext = null;
	
	/** 缓存 */
	private static Map<String, Object> cache = Collections.synchronizedMap(new HashMap<String, Object>());
	
	/**
	 * 获取缓存上下文对象
	 * @return
	 */
	public static synchronized CacheContext getIntance(){
		if(null == cacheContext){
			cacheContext = new CacheContext();
		}
		return cacheContext;
	}
	
	/**
	 * 获取缓存
	 * @param key
	 * @return
	 */
	public Object getCache(String key){
		return cache.get(key);
	}
	
	/**
	 * 设置缓存
	 * @param key
	 * @param value
	 */
	public void setCache(String key, Object value){
		cache.put(key, value);
	}

}
