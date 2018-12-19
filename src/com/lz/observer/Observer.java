package com.lz.observer;

import com.lz.domain.Message;

/**
 * 作者： 刘朝
 * 时间： 2018/12/19 22:35
 * 描述： 每个主题可以有许多观察者，
 */
public interface Observer {
    /**
     * 更新
     * @param msg 消息的封装
     */
    void update(Message msg);
}
