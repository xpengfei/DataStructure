package com.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * @Author: xpengfei
 * @Date: 2020/6/25 10:15
 * @Description：顺序栈测试类
 */
public class ArrayStackTest {

    private static final Logger logger = LoggerFactory.getLogger(ArrayStackTest.class);

    /**
     * 测试入栈
     */
    @Test
    public void push(){
        ArrayStack<Integer> integerArrayStack = new ArrayStack<Integer>(Integer.class);
        Class mClass = Integer.class;
        integerArrayStack.push(mClass,8);
        integerArrayStack.push(mClass,24);
        integerArrayStack.push(mClass,67);
        integerArrayStack.push(mClass,41);
        integerArrayStack.push(mClass,6);
        integerArrayStack.push(mClass,68);
        integerArrayStack.push(mClass,90);
        integerArrayStack.push(mClass,9);
        integerArrayStack.push(mClass,3);
        integerArrayStack.printStack();
    }

    /**
     * 测试出栈
     */
    @Test
    public void pop() throws InterruptedException {
        ArrayStack<Integer> integerArrayStack = new ArrayStack<>(Integer.class);
        Class mClass = Integer.class;
        integerArrayStack.push(mClass,8);
        integerArrayStack.push(mClass,24);
        integerArrayStack.push(mClass,67);
        integerArrayStack.push(mClass,41);
        integerArrayStack.push(mClass,6);
        integerArrayStack.push(mClass,68);
        integerArrayStack.push(mClass,90);

        logger.info("************************出栈前************************");
        integerArrayStack.printStack();
        logger.info("**********************出栈开始***********************");
        Thread.sleep(1000);
        while (!integerArrayStack.isEmpty()) {
            logger.info(""+integerArrayStack.pop());
            Thread.sleep(500);
        }
        logger.info("**********************出栈结束***********************");
        Thread.sleep(1000);


    }

    /**
     * 测试动态扩容
     */
    @Test
    public void reSize(){
        Class mClass = Integer.class;
        ArrayStack<Integer> integerArrayStack = new ArrayStack<>(mClass);
        integerArrayStack.push(mClass,8);
        integerArrayStack.push(mClass,24);
        integerArrayStack.push(mClass,67);
        integerArrayStack.push(mClass,41);
        integerArrayStack.push(mClass,6);
        integerArrayStack.push(mClass,68);
        integerArrayStack.push(mClass,90);
        integerArrayStack.push(mClass,110);
        integerArrayStack.push(mClass,112);
        integerArrayStack.push(mClass,116);
        integerArrayStack.push(mClass,120);
        integerArrayStack.push(mClass,128);
        integerArrayStack.push(mClass,136);
        integerArrayStack.push(mClass,149);
        integerArrayStack.printStack();
    }

}
