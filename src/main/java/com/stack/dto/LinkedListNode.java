package com.stack.dto;

/**
 * @Author: xpengfei
 * @Date: 2020/6/25 17:15
 * @Description：链表结点类
 */
public class LinkedListNode<T> {


    /**
     * 数据域
     */
    private T data;
    /**
     * 指针域
     */
    private LinkedListNode next;

    public LinkedListNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}
