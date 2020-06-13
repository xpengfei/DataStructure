package com.linkedlist;

import com.linkedlist.dto.Node;

/**
 * @Author: xpengfei
 * @Date: 2020/6/6 22:20
 * @Description：单链表
 */
public class SingleLinkedList {

    /**
     * 头结点
     */
    protected Node head = null;

    /**
     * 添加节点，链尾插入节点
     *
     * @param addData 要添加的节点数据
     */
    public Node tailAddNode(int addData) {
        // 要添加的节点
        Node node = new Node(addData);
        if (head == null) {
            head = node;
        } else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            // 将要添加的节点，添加到链表尾部
            tempNode.next = node;
        }
        return node;
    }

    /**
     * 添加节点，头部插入节点
     *
     * @param addData 要添加的节点数据
     */
    public Node headAddNode(int addData) {
        Node node = new Node(addData);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            node.next = temp;
            head = node;
        }
        return node;
    }

    /**
     * 获取链表长度
     *
     * @return
     */
    public int getLinkedListLen() {
        if (head == null) {
            return 0;
        }
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    /**
     * 删除链表中第index个节点
     *
     * @param index 要删除的节点序号
     */
    public void deleteNodeByIndex(int index) {
        if (head == null || index <= 0 || index > this.getLinkedListLen()) {
            return;
        } else {
            if (index == 1) {
                head = head.next;
                return;
            }
            Node temp = head;
            while (temp != null) {
                index--;
                if (index == 1) {
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }
    }


    /**
     * 降序排序
     * 冒泡排序
     */
    public void sortByDesc() {
        // 小于等于1个节点时无需排序
        if (this.getLinkedListLen() <= 1) {
            return;
        }
        Node currentNode;
        Node nextNode;
        for (currentNode = head; currentNode.next != null; currentNode = currentNode.next) {
            for (nextNode = head; nextNode.next != null; nextNode = nextNode.next) {
                if (nextNode.next.data > nextNode.data) {
                    int tempData = nextNode.next.data;
                    nextNode.next.data = nextNode.data;
                    nextNode.data = tempData;
                }
            }
        }
    }

    /**
     * 升序排序
     * 冒泡排序
     */
    public void sortByAsc() {
        // 小于等于1个节点时无需排序
        if (this.getLinkedListLen() <= 1) {
            return;
        }
        Node currentNode;
        Node nextNode;
        for (currentNode = head; currentNode.next != null; currentNode = currentNode.next) {
            for (nextNode = head; nextNode.next != null; nextNode = nextNode.next) {
                if (nextNode.data > nextNode.next.data) {
                    int tempData = nextNode.data;
                    nextNode.data = nextNode.next.data;
                    nextNode.next.data = tempData;
                }
            }
        }
    }

    /**
     * 查找数据在链表中第一次出现的位置
     *
     * @param nodeHead 链表的头结点
     * @param data     待查找数据
     * @return 返回数据在链表中的位置，-1表示链表中不存在待查找数据
     */
    public int findNodeIndex(Node nodeHead, int data) {
        int index = 0;
        while (nodeHead != null) {
            ++index;
            if (nodeHead.data == data) {
                return index;
            }
            nodeHead = nodeHead.next;
        }
        return -1;
    }


    /**
     * 将数据data插入到链表中的第index个位置
     *
     * @param data  待插入数据
     * @param index 待插入的位置
     */
    public void insertDataToLinkedListByIndex(int data, int index) {
        if (index < 0) {
            return;
        }
        if (head == null) {
            head = new Node(data);
            return;
        }
        // index 大于链表长度，插到链表尾部
        if (index > this.getLinkedListLen()) {
            Node node = new Node(data);
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
            node.next = null;
            return;
        }
        //index位于链表中
        if (index == 0) {
            this.headAddNode(data);
            return;
        }
        // 插入到最后一位

        //插入到链表中间


    }

    /**
     * 反转链表
     *
     * @return 反转后的链表的头结点
     */
    public Node reverseLinkedList() {
        Node currentNode = head;
        Node preNode = null;
        while (currentNode != null) {
            Node next = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = next;
        }
        return preNode;
    }

    /**
     * 打印出链表中的所有节点
     */
    public void printLinkList() {
        System.out.println("--------------------链表输出开始----------------------");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("--------------------链表输出结束----------------------");
    }
}



