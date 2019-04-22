package com.whb.cache.whbCache;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.whb.cache.whbCache.service.IBaseRedisDaoService;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WhbCacheApplication.class)
@WebAppConfiguration
public class AppTest{
	
	
	@Resource
	private IBaseRedisDaoService<String, String> dao;
	
	@Resource(name = "redisTemplate")
    private RedisTemplate<?, ?> redisTemplate;
	
	public void testRedeis() {
		redisTemplate.setKeySerializer(null);
		dao.set("wang", "66");
		System.out.println(dao.get("wang"));
		
	}
}
