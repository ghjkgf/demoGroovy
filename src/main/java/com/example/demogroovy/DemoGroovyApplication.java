package com.example.demogroovy;

import groovy.lang.GroovyShell;
import groovy.lang.Script;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/groovy")
@SpringBootApplication
public class DemoGroovyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGroovyApplication.class, args);
    }

    @RequestMapping("/test")
    public String test() throws IOException {
        //创建GroovyShell
        GroovyShell groovyShell = new GroovyShell();
        //装载解析脚本代码
        Script script = groovyShell.parse(new File("C:/Users/hougu/IdeaProjects/demoGroovy/src/main/java/com/example/demogroovy/Gg.groovy"));
        script.invokeMethod("getBean",null);
        return "ok";
    }
}
