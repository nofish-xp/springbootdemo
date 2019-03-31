package cn.linc.springbootdemo.demo1;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 描述:
 * springboot配置类
 *
 * @author xiechenglin
 * @create 2019-03-30 21:34
 */
public class SpringBoot {

    @Autowired
    private  Person person;

    public SpringBoot(){
        System.out.println("springboot");
    }

    public String getHelloWorld(){
        return person.toString();
    }

}
