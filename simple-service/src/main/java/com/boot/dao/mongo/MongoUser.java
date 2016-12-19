package com.boot.dao.mongo;

import org.springframework.data.annotation.Id;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/4/27 下午10:04.
 * @blog http://blog.didispace.com
 */
public class MongoUser {

    @Id
    private Long id;

    private String username;
    private Integer age;

    public MongoUser(Long id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}