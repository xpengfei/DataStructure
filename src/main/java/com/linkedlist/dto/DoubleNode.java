package com.linkedlist.dto;

/**
 * @Author: xpengfei
 * @Date: 2020/6/14 16:01
 * @Description：双向链表结点类
 */
public class DoubleNode {

    /**
     * 节点数据域，用于存储数据
     */
    public Integer data;

    /**
     * 节点的指针域，前驱指针，用于存储上一个节点的位置
     */
    public DoubleNode pre;

    /**
     * 节点的指针域，后继指针，用于存储下一个节点的位置
     */
    public DoubleNode next;


    public DoubleNode(Integer data) {
        this.data = data;
    }

    public DoubleNode(int data, DoubleNode pre, DoubleNode next) {
        this.data = data;
        this.pre = pre;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleNode getPre() {
        return pre;
    }

    public void setPre(DoubleNode pre) {
        this.pre = pre;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }
}
