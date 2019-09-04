package com.mieandu.service.impl;

import com.mieandu.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author mandu
 * @version 1.0
 * @date 2019/7/15 14:31
 */
@Service
public class OrderServiceImpl implements OrderService {
    private static Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void createOrder() {
        logger.info("创建一个订单");
    }
}
