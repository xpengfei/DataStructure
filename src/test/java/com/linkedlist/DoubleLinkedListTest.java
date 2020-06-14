package com.linkedlist;

import com.linkedlist.dto.DoubleNode;
import org.testng.annotations.Test;

/**
 * @Author: xpengfei
 * @Date: 2020/6/14 16:48
 * @Description：双向链表测试类
 */
public class DoubleLinkedListTest {

    /**
     * 测试添加结点
     */
    @Test(priority = 1)
    public void add() {
        DoubleNode node = new DoubleNode(66);
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(node);
        node = new DoubleNode(99);
        doubleLinkedList.add(node);
        node = new DoubleNode(233);
        doubleLinkedList.add(node);
        doubleLinkedList.printLinkList();
    }

    /**
     * 测试删除结点
     */
    @Test(priority = 2)
    public void deleteNode(){
        DoubleNode node = new DoubleNode(66);
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(node);

        node = new DoubleNode(99);
        doubleLinkedList.add(node);

        node = new DoubleNode(233);
        doubleLinkedList.add(node);

        node = new DoubleNode(456);
        doubleLinkedList.add(node);

        node = new DoubleNode(789);
        doubleLinkedList.add(node);

        doubleLinkedList.printLinkList();

        System.out.println("***************删除头结点66*******************");
        doubleLinkedList.deleteNode(66);
        doubleLinkedList.printLinkList();

        System.out.println("***************删除尾结点789*******************");
        doubleLinkedList.deleteNode(789);
        doubleLinkedList.printLinkList();

        System.out.println("***************删除中间结点233*******************");
        doubleLinkedList.deleteNode(233);
        doubleLinkedList.printLinkList();
    }
}
