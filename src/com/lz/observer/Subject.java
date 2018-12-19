package com.lz.observer;

/**
 * 作者： 刘朝
 * 时间： 2018年12月19日22:33:02
 * 描述： 这是主题接口，对象使用此接口注册为观察者，
 *       或者把自己从观察者中删除
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
