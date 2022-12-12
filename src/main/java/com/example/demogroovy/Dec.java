package com.example.demogroovy;

import groovy.lang.GroovyShell;
import groovy.lang.Script;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.HashMap;

/**
 * @author zsl
 * @date 2022/12/12
 * @apiNote
 */
public class Dec {
    public static void main(String[] args) throws Exception{
        //创建GroovyShell
        GroovyShell groovyShell = new GroovyShell();
        // Script script = groovyShell.parse(new File("C:\\Users\\hougu\\IdeaProjects\\demoGroovy\\src\\main\\resources\\HelloWorld.groovy"));
        // Script script = groovyShell.parse(new File("src/main/resources/HelloWorld.groovy")); // 读取的是另一模块的....
        Script script = groovyShell.parse(ResourceUtils.getFile("classpath:HelloWorld.groovy"));
        Script script2 = groovyShell.parse(new ClassPathResource("HelloWorld.groovy").getFile());

        script2.invokeMethod("HelloWorld", null);

        Object[] params = {1, 2};
        int sum = (int) script2.invokeMethod("add", params);
        System.out.println(sum);

        HashMap<String, String> map = new HashMap<>();
        map.put("科目一","语文");
        map.put("科目二","数学");
        Object[] params2 = {map};
        String result = (String) script2.invokeMethod("mapToString", params2);
        System.out.println(result);
    }
}
