package com.queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * @Author: xpengfei
 * @Date: 2020/6/26 17:26
 * @Description：数组队列测试类
 */
public class ArrayQueueTest {

    private static final Logger logger = LoggerFactory.getLogger(ArrayQueueTest.class);

    /**
     * 测试数组队列入队
     */
    @Test
    public void enqueue() {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(Integer.class,10);
        arrayQueue.enqueue(29);
        arrayQueue.enqueue(43);
        arrayQueue.enqueue(24);
        arrayQueue.enqueue(54);
        arrayQueue.enqueue(66);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(675);
        arrayQueue.enqueue(15);
        arrayQueue.enqueue(53);
        arrayQueue.enqueue(98);
        arrayQueue.enqueue(65);
        arrayQueue.enqueue(34);
        arrayQueue.enqueue(666);
        arrayQueue.printQueue();

    }

    /**
     * 测试数组队列出队
     */
    @Test
    public void dequeue() {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(Integer.class,10);
        arrayQueue.enqueue(29);
        arrayQueue.enqueue(43);
        arrayQueue.enqueue(24);
        arrayQueue.enqueue(54);
        arrayQueue.enqueue(66);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(675);
        arrayQueue.enqueue(15);
        arrayQueue.enqueue(53);
        arrayQueue.enqueue(98);
        arrayQueue.enqueue(65);
        arrayQueue.enqueue(34);
        arrayQueue.enqueue(666);
        logger.info("----------------------出队操作之前队列----------------------");
        arrayQueue.printQueue();

        logger.info("*********************数组队列出队开始*********************");
        while (!arrayQueue.isEmpty()) {
            System.out.println(arrayQueue.dequeue());;
        }
        logger.info("*********************数组队列出队结束*********************");

        logger.info("-------------------测试队列为空时出队----------------------");
        System.out.println(arrayQueue.dequeue());
    }
}
