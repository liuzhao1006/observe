package com.lz;

import com.lz.domain.Message;
import com.lz.observer.Observer;
import com.lz.observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者： 刘朝
 * 时间： 2018/12/19 23:23
 * 描述：
 */
public class TestMessage implements Subject {
    private List<Observer> observers;
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
        notifyObservers();
    }

    public TestMessage(){
        observers = new ArrayList<>() ;
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
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
