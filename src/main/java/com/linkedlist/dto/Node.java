package com.linkedlist.dto;

/**
 * @Author: xpengfei
 * @Date: 2020/6/6 23:35
 * @Description：节点实体类
 */
public class Node {

    /**
     * 节点数据域，用于存储数据
     */
    public int data;
    /**
     * 节点的指针域，用于存储下一个节点的位置
     */
    public Node next;

    /**
     * 初始化node时给数据域赋值
     * @param data
     */
    public Node(int data) {
        this.data = data;
    }

    /**
     * 初始化node时给数据域及指针域赋值
     * @param data
     * @param next
     */
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
