package com.linkedlist;

import com.linkedlist.dto.CircleNode;
import org.testng.annotations.Test;

/**
 * @Author: xpengfei
 * @Date: 2020/6/17 21:33
 * @Description：循环链表测试类
 */
public class CircleLinkedListTest {

    /**
     * 测试循环链表添加结点
     */
    @Test
    public void addNode() throws InterruptedException {
        CircleLinkedList circleLinkedList = new CircleLinkedList();
        CircleNode circleNode = new CircleNode(12);
        circleLinkedList.addNode(circleNode);
        System.out.println("*****************链表添加12后*****************");
        circleLinkedList.printCircleLinkedList();
        Thread.sleep(500);
        circleNode = new CircleNode(78);
        circleLinkedList.addNode(circleNode);
        System.out.println("*****************链表添加78后*****************");
        circleLinkedList.printCircleLinkedList();
        Thread.sleep(500);
        circleNode = new CircleNode(24);
        circleLinkedList.addNode(circleNode);
        System.out.println("*****************链表添加24后*****************");
        circleLinkedList.printCircleLinkedList();
        Thread.sleep(500);
        circleNode = new CircleNode(67);
        circleLinkedList.addNode(circleNode);
        System.out.println("*****************链表添加67后*****************");
        circleLinkedList.printCircleLinkedList();
        Thread.sleep(500);
        circleNode = new CircleNode(51);
        circleLinkedList.addNode(circleNode);
        System.out.println("*****************链表添加51后*****************");
        circleLinkedList.printCircleLinkedList();
        Thread.sleep(500);
        circleNode = new CircleNode(15);
        circleLinkedList.addNode(circleNode);
        System.out.println("*****************链表添加15后*****************");
        circleLinkedList.printCircleLinkedList();
        Thread.sleep(5000);
    }

    /**
     * 测试循环链表删除数据所在结点
     */
    @Test
    public void deleteNode() throws InterruptedException {
        CircleLinkedList circleLinkedList = new CircleLinkedList();
        CircleNode circleNode = new CircleNode(12);
        circleLinkedList.addNode(circleNode);

        circleNode = new CircleNode(78);
        circleLinkedList.addNode(circleNode);

        circleNode = new CircleNode(24);
        circleLinkedList.addNode(circleNode);

        circleNode = new CircleNode(67);
        circleLinkedList.addNode(circleNode);

        circleNode = new CircleNode(51);
        circleLinkedList.addNode(circleNode);

        circleNode = new CircleNode(15);
        circleLinkedList.addNode(circleNode);
        System.out.println("**********循环链表删除结点之前的数据********");
        circleLinkedList.printCircleLinkedList();
        Thread.sleep(500);
        System.out.println("**********循环链表删除12之后的数据********");
        circleLinkedList.deleteNode(12);
        circleLinkedList.printCircleLinkedList();
        Thread.sleep(500);
        System.out.println("**********循环链表删除78之后的数据********");
        circleLinkedList.deleteNode(78);
        circleLinkedList.printCircleLinkedList();
        Thread.sleep(500);
        System.out.println("**********循环链表删除24之后的数据********");
        circleLinkedList.deleteNode(24);
        circleLinkedList.printCircleLinkedList();
        Thread.sleep(500);
        System.out.println("**********循环链表删除67之后的数据********");
        circleLinkedList.deleteNode(67);
        circleLinkedList.printCircleLinkedList();
        Thread.sleep(500);
        System.out.println("**********循环链表删除51之后的数据********");
        circleLinkedList.deleteNode(51);
        circleLinkedList.printCircleLinkedList();
        Thread.sleep(500);
        System.out.println("**********循环链表删除15之后的数据********");
        circleLinkedList.deleteNode(15);
        circleLinkedList.printCircleLinkedList();

        Thread.sleep(5000);

    }
}
