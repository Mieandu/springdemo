package com.mieandu.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 *
 * An ApplicationContext automatically detects any beans that are defined in the configuration metadata that implements
 * the BeanPostProcessor interface. The ApplicationContext registers these beans as post-processors so that they can be
 * called later, upon bean creation
 *
 *
 * Use:
 * Using callback interfaces or annotations in conjunction with a custom BeanPostProcessor implementation is a common
 * means of extending the Spring IoC container. An example is Spring’s RequiredAnnotationBeanPostProcessor — 
 * a BeanPostProcessor implementation that ships with the Spring distribution and that ensures that JavaBean properties
 * on beans that are marked with an (arbitrary) annotation are actually (configured to be) dependency-injected with a value
 * @author mandu
 * @version 1.0
 * @date 2019/5/29 10:37
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    private static final Logger logger = LoggerFactory.getLogger(MyLifecycleProcessor.class);
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info(beanName + "：Bean初始化完成，后置处理器执行， 。。。"  + bean);
        return bean;
    }
}
