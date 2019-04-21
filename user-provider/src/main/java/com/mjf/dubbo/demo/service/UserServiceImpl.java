package com.mjf.dubbo.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mjf.dubbo.serivice.UserService;
import entity.User;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Package: com.mjf.dubbo.demo.service
 * @ClassName: UserServiceImpl
 * @Author: majiafei
 * @Description:
 * @Date: 2019/4/21 15:52
 */
@ComponentScan
@Service(retries = 1, interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Override
    public String addUser(User user) {
        return "用户编号" + user.getUserId() + ",用户的名称:" + user.getUserName();
    }
}
