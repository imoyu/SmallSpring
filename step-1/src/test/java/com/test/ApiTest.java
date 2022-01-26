package com.test;

import com.springframework.BeanDefinition;
import com.springframework.BeanFactory;
import com.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory() {

        // 初始化
        BeanFactory beanFactory = new BeanFactory();

        // 注册
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
