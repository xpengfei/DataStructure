package com.linkedlist;

import com.linkedlist.dto.DoubleNode;

/**
 * @Author: xpengfei
 * @Date: 2020/6/6 22:25
 * @Description：双向链表
 */
public class DoubleLinkedList {

    /**
     * 双向链表头结点
     */
    protected DoubleNode head;


    /**
     * 将结点添加到双向链表中
     *
     * @param newNode 待添加结点
     */
    public void add(DoubleNode newNode) {
        if (head == null) {
            head = new DoubleNode(null);
            head.next = newNode;
            newNode.pre = head;
            return;
        }
        DoubleNode doubleNode = head;
        //找到链表中最后一个结点
        while (doubleNode.next != null) {
            doubleNode = doubleNode.next;
        }
        // 将原链表中最后一个结点的后继指针指向要添加的结点
        doubleNode.next = newNode;
        // 将待添加的结点的前驱指针指向原链表中的最后一个结点
        newNode.pre = doubleNode;
    }


    /**
     * 删除双向链表中值为delData的结点
     *
     * @param delData
     */
    public void deleteNode(int delData) {
        DoubleNode doubleNode = head.next;
        if (doubleNode == null) {
            return;
        }
        while (doubleNode != null) {
            // 找到待删除的结点
            if (doubleNode.data == delData) {
                doubleNode.pre.next = doubleNode.next;
                // 尾结点的next指向null，不需要执行以下语句
                if (doubleNode.next != null) {
                    doubleNode.next.pre = doubleNode.pre;
                }
            }
            doubleNode = doubleNode.next;
        }
    }

    /**
     * 打印出链表中的所有节点
     */
    public void printLinkList() {
        System.out.println("--------------------链表输出开始----------------------");
        DoubleNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("--------------------链表输出结束----------------------");
    }

}
