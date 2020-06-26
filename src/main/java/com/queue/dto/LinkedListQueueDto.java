package com.queue.dto;

/**
 * @Author: xpengfei
 * @Date: 2020/6/26 14:50
 * @Description：链式队列节点类
 */
public class LinkedListQueueDto<T> {

    /**
     * 数据域
     */
    private T data;
    /**
     * 链式队列指针域
     */
    private LinkedListQueueDto<T> next;

    public LinkedListQueueDto(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedListQueueDto<T> getNext() {
        return next;
    }

    public void setNext(LinkedListQueueDto<T> next) {
        this.next = next;
    }
}
