package com.mieandu.pojo;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author mandu
 * @version 1.0
 * @date 2019/5/30 12:27
 */

public class MyFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        System.out.println("初始化一个FactoryBean");
        return new Object();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
    @Override
    public boolean isSingleton() {
        return false;
    }
}
