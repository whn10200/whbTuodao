package com.whb.cache.whbCache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages="com.whb.cache.whbCache.service")
public class WhbCacheApplication {
	public static void main(String[] args) {
		SpringApplication.run(WhbCacheApplication.class, args);
	}
}
