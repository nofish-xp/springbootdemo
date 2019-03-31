package cn.linc.springbootdemo.demo1;

import org.springframework.context.annotation.Bean;

/**
 * 描述:
 * configuration
 *
 * @author xiechenglin
 * @create 2019-03-30 21:33
 */
public class ConfigurationDemo {

    @Bean
    public SpringBoot getSpringBoot(){
        return new SpringBoot();
    }

}
