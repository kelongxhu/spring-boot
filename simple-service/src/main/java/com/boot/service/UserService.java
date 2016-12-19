package com.boot.service;

/**
 */
public interface UserService {

    /**
     * 新增一个用户
     * @param name
     * @param age
     */
    void create(String name, Integer age);


    /**
     * 获取用户总量
     */
    Integer getAllUsers();


}
