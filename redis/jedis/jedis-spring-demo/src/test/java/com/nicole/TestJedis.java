package com.nicole;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

@SpringBootTest
public class TestJedis {
    private Jedis jedis;

    @Before
    public void setJedis() {
        jedis = new Jedis("127.0.0.1", 6379);
    }

    @Test
    public void testString() {
        jedis.set("name", "nicole");
        System.out.println(jedis.get("name"));
        jedis.append("name", " Li");
        System.out.println(jedis.get("name"));

        jedis.set("age", "22");
        System.out.println(jedis.get("age"));
        //del key
        jedis.del("age");
        System.out.println(jedis.get("age"));

        //set mul key
        jedis.mset("name", "Tom", "age", "20", "email", "222222@qq.com");
        System.out.println(jedis.get("name") + " " + jedis.get("age") + " " + jedis.get("email"));
    }
}
