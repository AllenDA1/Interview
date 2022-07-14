package com.interview.cache;

import lombok.extern.slf4j.Slf4j;
import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;

@Slf4j
public class EhCacheDemo01 {


    public static void main(String[] args) {

        // 创建缓存管理器
        CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder().build();

        // 初始化EhCache
        cacheManager.init();

        // 设置缓存
        Cache<String, String> mycache = cacheManager.createCache("MYCACHE", CacheConfigurationBuilder.newCacheConfigurationBuilder(
                String.class, String.class,
                ResourcePoolsBuilder.heap(10)  // 设置缓存的最大容量
        ));

        // 设置缓存
        mycache.put("zhangsan", "19");

        // 读取缓存
        String value = mycache.get("zhangsan");
        log.error("value : {}", value);

        log.debug(value);
        System.out.println(value);

        // 关闭缓存
        cacheManager.close();
    }

}
