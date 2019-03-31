package cn.linc.springbootdemo.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 * helloworld
 *
 * @author xiechenglin
 * @create 2019-03-30 21:23
 */

@RestController
public class HelloWorld {

    @Autowired
    private SpringBoot springBoot;

    @RequestMapping("/helloworld")
    public String helloWorld(){
        return springBoot.getHelloWorld();
    }


}
