package com.queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * @Author: xpengfei
 * @Date: 2020/6/26 15:28
 * @Description：链式队列测试类
 */
public class LinkedListQueueTest {

    private static final Logger logger = LoggerFactory.getLogger(LinkedListQueueTest.class);

    /**
     * 测试入队
     */
    @Test
    public void enqueue() {
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        linkedListQueue.enqueue(8);
        linkedListQueue.enqueue(30);
        linkedListQueue.enqueue(29);
        linkedListQueue.enqueue(75);
        linkedListQueue.enqueue(6);
        linkedListQueue.enqueue(17);

        linkedListQueue.printLinkedListQueue();

    }

    /**
     * 测试出队
     */
    @Test
    public void dequeue() {
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        linkedListQueue.enqueue(8);
        linkedListQueue.enqueue(30);
        linkedListQueue.enqueue(29);
        linkedListQueue.enqueue(75);
        linkedListQueue.enqueue(6);
        linkedListQueue.enqueue(17);
        logger.info("-------------------出队之前----------------------");
        linkedListQueue.printLinkedListQueue();
        logger.info("********************出队开始**********************");
        while (!linkedListQueue.isEmpty()) {
            logger.info("出队元素："+linkedListQueue.dequeue());
        }
        logger.info("********************出队结束**********************");
    }
}
