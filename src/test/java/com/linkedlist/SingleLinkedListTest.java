package com.linkedlist;

import com.linkedlist.dto.Node;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Author: xpengfei
 * @Date: 2020/6/7 14:35
 * @Description：
 */
public class SingleLinkedListTest {

    /**
     * 链表添加节点
     * 测试尾插法
     */
    @Test(priority = 1)
    public void tailAddNode() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.tailAddNode(1);
        singleLinkedList.tailAddNode(2);
        singleLinkedList.tailAddNode(3);
        singleLinkedList.tailAddNode(4);
        singleLinkedList.tailAddNode(5);
        singleLinkedList.tailAddNode(6);
        singleLinkedList.printLinkList();
        Assert.assertTrue(true);
    }

    /**
     * 链表添加节点
     * 测试头插法
     */
    @Test(priority = 2)
    public void headAddNode() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.headAddNode(1);
        singleLinkedList.headAddNode(2);
        singleLinkedList.headAddNode(3);
        singleLinkedList.headAddNode(4);
        singleLinkedList.headAddNode(5);
        singleLinkedList.headAddNode(6);
        singleLinkedList.printLinkList();
        Assert.assertTrue(true);
    }

    /**
     * 测试获取链表长度
     */
    @Test(priority = 3)
    public void getLinkedListLen() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.headAddNode(1);
        singleLinkedList.headAddNode(2);
        singleLinkedList.headAddNode(3);
        singleLinkedList.headAddNode(4);
        singleLinkedList.headAddNode(5);
        singleLinkedList.headAddNode(6);
        Assert.assertEquals(singleLinkedList.getLinkedListLen(), 6);
    }

    /**
     * 测试删除节点
     * 删除的index小于链表长度
     */
    @Test(priority = 4)
    public void deleteNodeByIndex() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.headAddNode(1);
        singleLinkedList.headAddNode(2);
        singleLinkedList.headAddNode(3);
        singleLinkedList.headAddNode(4);
        singleLinkedList.headAddNode(5);
        singleLinkedList.headAddNode(6);
        singleLinkedList.deleteNodeByIndex(0);
        Assert.assertEquals(singleLinkedList.getLinkedListLen(), 6);
    }

    /**
     * 测试删除节点
     * 删除第1个
     */
    @Test(priority = 5)
    public void deleteNodeByIndex0() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.headAddNode(1);
        singleLinkedList.headAddNode(2);
        singleLinkedList.headAddNode(3);
        singleLinkedList.headAddNode(4);
        singleLinkedList.headAddNode(5);
        singleLinkedList.headAddNode(6);
        singleLinkedList.deleteNodeByIndex(1);
        Assert.assertEquals(singleLinkedList.getLinkedListLen(), 5);
    }

    /**
     * 测试删除节点
     * 删除第3个
     */
    @Test(priority = 6)
    public void deleteNodeByIndex1() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.headAddNode(1);
        singleLinkedList.headAddNode(2);
        singleLinkedList.headAddNode(3);
        singleLinkedList.headAddNode(4);
        singleLinkedList.headAddNode(5);
        singleLinkedList.headAddNode(6);
        singleLinkedList.deleteNodeByIndex(3);
        Assert.assertEquals(singleLinkedList.getLinkedListLen(), 5);
    }

    /**
     * 测试删除节点
     * 删除最后一个
     */
    @Test(priority = 7)
    public void deleteNodeByIndex2() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.headAddNode(1);
        singleLinkedList.headAddNode(2);
        singleLinkedList.headAddNode(3);
        singleLinkedList.headAddNode(4);
        singleLinkedList.headAddNode(5);
        singleLinkedList.headAddNode(6);
        singleLinkedList.deleteNodeByIndex(6);
        Assert.assertEquals(singleLinkedList.getLinkedListLen(), 5);
    }

    /**
     * 测试删除节点
     * 删除的index大于链表长度
     */
    @Test(priority = 8)
    public void deleteNodeByIndex3() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.headAddNode(1);
        singleLinkedList.headAddNode(2);
        singleLinkedList.headAddNode(3);
        singleLinkedList.headAddNode(4);
        singleLinkedList.headAddNode(5);
        singleLinkedList.headAddNode(6);
        singleLinkedList.deleteNodeByIndex(1000);
        Assert.assertEquals(singleLinkedList.getLinkedListLen(), 6);
    }

    /**
     * 测试降序排序
     * 冒泡
     */
    @Test(priority = 9)
    public void sortByDesc() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.tailAddNode(1);
        singleLinkedList.tailAddNode(8);
        singleLinkedList.tailAddNode(3);
        singleLinkedList.tailAddNode(6);
        singleLinkedList.tailAddNode(9);
        singleLinkedList.tailAddNode(2);
        System.out.println("*****************排序之前******************");
        singleLinkedList.printLinkList();
        System.out.println("*****************排序之后******************");
        singleLinkedList.sortByDesc();
        singleLinkedList.printLinkList();
    }

    /**
     * 升序排序
     * 冒泡
     */
    @Test(priority = 10)
    public void sortByAsc() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.tailAddNode(1);
        singleLinkedList.tailAddNode(8);
        singleLinkedList.tailAddNode(3);
        singleLinkedList.tailAddNode(6);
        singleLinkedList.tailAddNode(9);
        singleLinkedList.tailAddNode(2);
        System.out.println("*****************排序之前******************");
        singleLinkedList.printLinkList();
        System.out.println("*****************排序之后******************");
        singleLinkedList.sortByAsc();
        singleLinkedList.printLinkList();
    }

    /**
     * 链表反转
     */
    @Test(priority = 11)
    public void reverseLinkedList() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.tailAddNode(1);
        singleLinkedList.tailAddNode(8);
        singleLinkedList.tailAddNode(3);
        singleLinkedList.tailAddNode(6);
        singleLinkedList.tailAddNode(9);
        singleLinkedList.tailAddNode(2);
        System.out.println("**************链表反转之前*************");
        singleLinkedList.printLinkList();
        Node reversedHeadNode = singleLinkedList.reverseLinkedList();
        System.out.println("**************链表反转之后********************");
        while (reversedHeadNode != null){
            System.out.print(reversedHeadNode.data+"\t");
            reversedHeadNode = reversedHeadNode.next;
        }
        System.out.println();
    }

    /**
     * 查找数据第一次在链表中出现的位置
     */
    @Test(priority = 12)
    public void findNodeIndex() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.tailAddNode(9);
        singleLinkedList.tailAddNode(2);
        singleLinkedList.tailAddNode(8);
        singleLinkedList.tailAddNode(13);
        singleLinkedList.tailAddNode(10);
        singleLinkedList.tailAddNode(6);
        Assert.assertEquals(singleLinkedList.findNodeIndex(singleLinkedList.head,13),4);
    }
}


