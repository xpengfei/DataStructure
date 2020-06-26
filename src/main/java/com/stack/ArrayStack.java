package com.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;

/**
 * @Author: xpengfei
 * @Date: 2020/6/25 9:28
 * @Description：数组实现顺序栈
 */
public class ArrayStack<T> {

    private static final Logger logger = LoggerFactory.getLogger(ArrayStack.class);
    /**
     * 存放栈元素的数组
     */
    private T[] arrayStack;

    /**
     * 栈中元素个数
     */
    private int n = 0;

    /**
     * 无参构造方法，初始化栈数组大小为10
     */
    public ArrayStack(Class<T> type) {
        arrayStack = (T[]) Array.newInstance(type, 10);
        logger.info("栈初始容量为：" + 10);
    }

    /**
     * 构造方法，指定栈数组大小
     *
     * @param size
     */
    public ArrayStack(Class<T> type, int size) {
        this.arrayStack = (T[]) Array.newInstance(type, size);
        logger.info("栈初始容量为：" + size);

    }

    /**
     * 调整栈数组的大小
     *
     * @param maxSize
     */
    private void reSize(Class<T> type, int maxSize) {
        T[] temp = (T[]) Array.newInstance(type, maxSize);
        for (int i = 0; i < arrayStack.length; i++) {
            temp[i] = arrayStack[i];
        }
        arrayStack = temp;
        logger.info("******************栈已扩容为原来的2倍:" + 2 * n + "*******************");
    }

    /**
     * 判断栈是否为空
     *
     * @return true:空  false：非空
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * 入栈：向栈顶插入元素
     *
     * @param item
     */
    public void push(Class<T> type, T item) {
        // 栈满时，自动扩容为运来的两倍
        if (n == arrayStack.length) {
            reSize(type, n * 2);
        }
        arrayStack[n] = item;
        //栈元素总数+1
        n++;
    }

    /**
     * 出栈：从栈顶移除元素并将元素返回
     *
     * @return
     */
    public T pop() {
        // 栈空则返回null
        if (isEmpty()) {
            return null;
        }
        T temp = arrayStack[n - 1];
        arrayStack[n - 1] = null;
        // 栈元素个数减一
        n--;
        return temp;
    }


    /**
     * 返回栈大小
     *
     * @return
     */
    public int size() {
        return n;
    }

    /**
     * 输出栈元素
     */
    public void printStack() {
        logger.info("---------------栈元素输出开始----------------");
        if (size() == 0) {
            logger.info("栈空！");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(arrayStack[i] + "\t");
            }
            logger.info("");
        }
        logger.info("---------------栈元素输出结束----------------");
    }
}
