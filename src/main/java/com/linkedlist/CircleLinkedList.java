package com.linkedlist;

import com.linkedlist.dto.CircleNode;
import com.linkedlist.dto.DoubleNode;

/**
 * @Author: xpengfei
 * @Date: 2020/6/15 21:38
 * @Description：循环链表
 */
public class CircleLinkedList {
    /**
     * 头结点
     */
    private CircleNode head;

    /**
     * 尾结点
     */
    private CircleNode tail;

    /**
     * 添加结点
     *
     * @param newNode 待添加结点
     */
    public void addNode(CircleNode newNode) {
        if (head == null) {
            head = new CircleNode(null);
            tail = new CircleNode(null);
            head.setNext(newNode);
            newNode.setNext(tail);
            tail.setNext(head);
        }
        CircleNode circleNode = head;
        // 链表中无数据，只有首尾结点时
        if (circleNode.getNext().getNext() == head) {
            circleNode.setNext(newNode);
            newNode.setNext(tail);
            return;
        }
        //找到尾结点前的一个节点
        while (circleNode.getNext().getNext() != head) {
            circleNode = circleNode.getNext();
        }
        circleNode.setNext(newNode);
        newNode.setNext(tail);
    }

    /**
     * 删除循环链表中值为delData的结点
     *
     * @param delData
     */
    public void deleteNode(int delData) {
        CircleNode circleNode = head;

        // head结点的下一个结点指向head，链表为空
        if (circleNode.getNext() == head) {
            return;
        }

        // 结点指针域指向head结点，则链表遍历结束
        while (circleNode.getNext().getNext() != head) {
            // 找到待删除数据的上一个结点
            if (circleNode.getNext().getData() == delData) {
                circleNode.setNext(circleNode.getNext().getNext());
                return;
            }
            circleNode = circleNode.getNext();
        }
    }


    public void printCircleLinkedList() {
        System.out.println("****************循环链表输出开始***************");

        CircleNode tempNode = head.getNext();

        while (tempNode.getNext() != head) {
            System.out.print(tempNode.getData() + "\t");
            tempNode = tempNode.getNext();
        }
        System.out.println();
        System.out.println("****************循环链表输出结束***************");
    }

}
