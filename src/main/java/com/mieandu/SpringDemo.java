package com.mieandu;

import com.mieandu.context.ContextCofiguration;
import com.mieandu.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mandu
 * @version 1.0
 * @date 2019/5/15 9:43
 */
public class SpringDemo {
    private static final Logger logger = LoggerFactory.getLogger(SpringDemo.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
        UserService userService = context.getBean("userService", UserService.class);
        logger.info(userService.getAccount());
        ContextCofiguration contextCofiguration = (ContextCofiguration) context.getBean("contextCofiguration");
        System.out.println("还真的是："+contextCofiguration.applicationContext);
        FactoryBean myFactoryBean = (FactoryBean) context.getBean("&myFactoryBean");

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor("a",true);
        stringTrimmerEditor.setAsText("asdfaff");
        System.out.println(stringTrimmerEditor.getAsText());
    }
}
