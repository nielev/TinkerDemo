package com.neo.tinkerdemo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/**
 * Created by Neo on 2016/11/15.
 */

public interface IApplication {
    /**
     * 服务id, 配置config
     */
    public static final int SERVICE_CONFIG_MANAGER = 0;

    /**
     * 服务id, TipManager
     */
    public static final int SERVICE_OPENTIP_MANAGER = 1;

    /**
     * 获取serviceId标识的管理器
     * @param serviceId service
     * @return 管理器
     */
    public abstract Object getManager(int serviceId);

    /**
     * 获取与主线程关联的Handler
     * @return handler
     */
    public abstract Handler getMainHandler();

    /**
     * 获取与背景线程关联的Handler
     * @return handler
     */
    public abstract Handler getBgHandler();

    /**
     * 获取背景线程的Looper
     * @return looper
     */
    public abstract Looper getBgLooper();

    /**
     * 获取上下文对象
     * @return context
     */
    public abstract Context getContext();
}
