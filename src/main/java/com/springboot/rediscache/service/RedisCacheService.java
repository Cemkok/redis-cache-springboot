package com.springboot.rediscache.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {
	
	
	int sayac = 0;
	@Cacheable(cacheNames = "mySpecialCache")
	public String longRunningMethod() throws InterruptedException {
		Thread.sleep(5000L);
		return "method çalıştı";	
	}
	
	@CacheEvict(cacheNames= "mySpecialCache" )
	public void clearCache() {
		System.out.println("cache temizledi");
	}

}
