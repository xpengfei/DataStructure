package com.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * @Author: xpengfei
 * @Date: 2020/6/25 21:18
 * @Description：链式栈测试类
 */
public class LinkedListStackTest {

    private static final Logger logger = LoggerFactory.getLogger(LinkedListStackTest.class);

    /**
     * 测试入栈
     */
    @Test
    public void push(){
        LinkedListStack<Integer> linkedListStack = new LinkedListStack();
        linkedListStack.push(8);
        linkedListStack.push(6);
        linkedListStack.push(34);
        linkedListStack.push(23);
        linkedListStack.push(64);
        linkedListStack.push(18);
        linkedListStack.push(19);

        linkedListStack.printLinkedListStack();
    }

    /**
     * 测试出栈
     */
    @Test
    public void pop(){
        LinkedListStack<Integer> linkedListStack = new LinkedListStack();
        linkedListStack.push(8);
        linkedListStack.push(6);
        linkedListStack.push(34);
        linkedListStack.push(23);
        linkedListStack.push(64);
        linkedListStack.push(18);
        linkedListStack.push(19);
        logger.info("------------------------出栈之前元素------------------");
        linkedListStack.printLinkedListStack();
        logger.info("************************出栈开始***********************");
        while (!linkedListStack.isEmpty()) {
            logger.info(""+linkedListStack.pop());
        }
        logger.info("************************出栈结束***********************");
    }
}
