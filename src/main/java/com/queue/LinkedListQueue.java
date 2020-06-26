package com.queue;

import com.queue.dto.LinkedListQueueDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xpengfei
 * @Date: 2020/6/26 10:25
 * @Description：链式队列
 */
public class LinkedListQueue<T> {

    private static final Logger logger = LoggerFactory.getLogger(LinkedListQueue.class);

    /**
     * 链式队列中结点个数
     */
    private int n = 0;

    /**
     * 链式队列头结点
     */
    private LinkedListQueueDto<T> head;

    /**
     * 链式队列尾结点
     */
    private LinkedListQueueDto<T> rear;


    /**
     * 入队，链表尾部入队
     *
     * @param data 待入队数据
     */
    public void enqueue(T data) {
        LinkedListQueueDto<T> newNode = new LinkedListQueueDto<>(data);
        // 队列为空时，直接在首结点后插入
        if (isEmpty()) {
            head = new LinkedListQueueDto<>(null);
            head.setNext(newNode);
            // 将新节点指向尾结点
            newNode.setNext(rear);
        } else {
            LinkedListQueueDto<T> tempNode = head;
            //找到队列中尾结点前一个节点
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            //新节点插入
            tempNode.setNext(newNode);
            // 将新节点指向尾结点
            newNode.setNext(rear);
        }
        // 队列中节点数+1
        n++;
    }

    /**
     * 出队，链式队列队头出队
     *
     * @return
     */
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        LinkedListQueueDto<T> tempNode = head.getNext();
        head.setNext(head.getNext().getNext());
        n--;
        return tempNode.getData();
    }

    /**
     * 判断队列是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * 获取队列中数据结点个数
     *
     * @return
     */
    public int size() {
        return n;
    }

    /**
     * 输出链式队列
     */
    public void printLinkedListQueue() {
        LinkedListQueueDto<T> tempNode = head.getNext();
        logger.info("--------------------链式队列输出开始---------------------");
        while (tempNode != null) {
            System.out.print(tempNode.getData() + "\t");
            tempNode = tempNode.getNext();
        }
        System.out.println();
        logger.info("--------------------链式队列输出结束---------------------");
    }
}
