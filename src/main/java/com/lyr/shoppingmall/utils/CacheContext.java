package com.lyr.shoppingmall.utils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;



/**
 * ����������(����ģʽ)
 * @author VIC
 *
 */
public class CacheContext {
	
	/**
	 * ˽�л����캯��
	 */
	private CacheContext(){}
	
	/** ���ж��� */
	private static CacheContext cacheContext = null;
	
	/** ���� */
	private static Map<String, Object> cache = Collections.synchronizedMap(new HashMap<String, Object>());
	
	/**
	 * ��ȡ���������Ķ���
	 * @return
	 */
	public static synchronized CacheContext getIntance(){
		if(null == cacheContext){
			cacheContext = new CacheContext();
		}
		return cacheContext;
	}
	
	/**
	 * ��ȡ����
	 * @param key
	 * @return
	 */
	public Object getCache(String key){
		return cache.get(key);
	}
	
	/**
	 * ���û���
	 * @param key
	 * @param value
	 */
	public void setCache(String key, Object value){
		cache.put(key, value);
	}

}
