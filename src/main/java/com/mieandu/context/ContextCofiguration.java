package com.mieandu.context;

import com.mieandu.pojo.MyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mandu
 * @version 1.0
 * @date 2019/5/30 12:29
 */
@Configuration
public class ContextCofiguration {

    @Bean
    public MyFactoryBean myFactoryBean(){
        return new MyFactoryBean();
    }
}
