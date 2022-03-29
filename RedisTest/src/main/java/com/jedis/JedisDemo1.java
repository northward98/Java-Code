package com.jedis;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

public class JedisDemo1 {
    public static void main(String[] args) {
        //创建Jedis对象
        Jedis jedis = new Jedis("192.168.72.129", 6379);
        //测试
        String s = jedis.ping();//ping通的话会返回一个值
        System.out.println(s);
    }

    @Test
    public void demo1() {
        Jedis jedis = new Jedis("192.168.72.129", 6379);
        jedis.set("k1", "v1");
        jedis.get("k1");
        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
