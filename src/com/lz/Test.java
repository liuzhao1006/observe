package com.lz;

import com.lz.domain.Message;
import com.lz.observer.DisplayElement;
import com.lz.observer.Observer;
import com.lz.observer.Subject;

/**
 * 作者： 刘朝
 * 时间： 2018/12/19 22:57
 * 描述： 测试观察者
 */
public class Test implements Observer , DisplayElement {
    private Subject testData;
    private Message message;
    public Test(Subject testData) {
        this.testData = testData;
        testData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println(message.toString());
    }

    @Override
    public void update(Message msg) {
        this.message = msg;
        display();
    }

    public static void main(String[] args) {
        TestData data = new TestData();
        Test test = new Test(data);
        TestMessage testMessage = new TestMessage();
        Test test1 = new Test(testMessage);
        testMessage.setMessage(new Message(new byte[]{1,2,3,4},"TestMessage:刘朝"));
        data.setMessage(new Message(new byte[]{1, 2, 3, 4},"TestData:刘朝"));
    }
}
