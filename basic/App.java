package com.fastjson;

import com.alibaba.fastjson.JSON;

public class App {

    public static void main(String[] args) {
        Group group = new Group();
        group.setId(0L);
        group.setName("Maxwit");

        User u1 = new User();
        u1.setId(0L);
        u1.setName("Nicole");

        User u2 = new User();
        u2.setId(2L);
        u2.setName("Tom");

        group.addUser(u1);
        group.addUser(u2);

        String jsonString = JSON.toJSONString(group);

        System.out.println(jsonString);

        Group group2 = JSON.parseObject(jsonString, Group.class);

        System.out.println(group2);
        System.out.println(group2.getName());
        System.out.println(group2.getUsers().get(0));

    }
}

maven{url"https://mvnrepository.com"}
