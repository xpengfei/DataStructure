package com.linkedlist.dto;

/**
 * @Author: xpengfei
 * @Date: 2020/6/15 21:37
 * @Description：循环链表结点类
 */
public class CircleNode {

    /**
     * 数据域，存储数据
     */
    protected int data;

    /**
     * 指针域，存储下一个结点位置
     */
    protected CircleNode next;

    public CircleNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CircleNode getNext() {
        return next;
    }

    public void setNext(CircleNode next) {
        this.next = next;
    }
}
