package com.lz.domain;

import java.util.Arrays;

/**
 * 作者： 刘朝
 * 时间： 2018/12/19 22:37
 * 描述： 数据封装
 */
public class Message {

    private byte[] cmd;
    private String msg;

    public Message(byte[] cmd, String msg) {
        this.cmd = cmd;
        this.msg = msg;
    }

    public byte[] getCmd() {
        return cmd;
    }

    public void setCmd(byte[] cmd) {
        this.cmd = cmd;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Message{" +
                "cmd=" + Arrays.toString(cmd) +
                ", msg='" + msg + '\'' +
                '}';
    }
}
