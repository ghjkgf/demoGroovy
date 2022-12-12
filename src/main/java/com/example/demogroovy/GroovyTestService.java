package com.example.demogroovy;

import org.springframework.stereotype.Service;

/**
 * @author zsl
 * @date 2022/12/12
 * @apiNote
 */
@Service
public class GroovyTestService {
    public void test(){
        System.out.println("我是SpringBoot框架的成员类，但该方法由Groovy脚本调用");
    }
}
