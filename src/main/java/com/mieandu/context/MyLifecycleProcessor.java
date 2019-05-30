package com.mieandu.context;

import org.springframework.context.support.DefaultLifecycleProcessor;

/**
 * @author mandu
 * @version 1.0
 * @date 2019/5/29 10:10
 */
public class MyLifecycleProcessor extends DefaultLifecycleProcessor {

    /**
     * Notification of context refresh, e.g. for auto-starting components.
     */
    @Override
    public void onRefresh() {
        System.out.println("Context生命周期监听：刷新上下文");
    }

    @Override
    public void onClose() {
        super.onClose();
        System.out.println("Context生命周期监听： close");
    }

    @Override
    public void stop() {
        System.out.println(" Context生命周期监听：停止");
        super.stop();

    }
}
