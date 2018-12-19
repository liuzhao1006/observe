package com.lz;

import com.lz.domain.Message;
import com.lz.observer.Observer;
import com.lz.observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者： 刘朝
 * 时间： 2018/12/19 22:45
 * 描述： 被观察者， 当这个类被调用时，通知观察者。
 */
public class TestData implements Subject {

    private List<Observer> observers;
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
        notifyObservers();
    }

    public TestData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0 ){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }


}
