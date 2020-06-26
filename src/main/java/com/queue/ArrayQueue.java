package com.queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;

/**
 * @Author: xpengfei
 * @Date: 2020/6/26 16:46
 * @Description：数组实现队列
 */
public class ArrayQueue<T> {

    private static final Logger logger = LoggerFactory.getLogger(ArrayQueue.class);

    /**
     * 数组队列
     */
    private T[] queue;

    /**
     * 数组大小
     */
    private int size;

    /**
     * 数组中最后一个元素的下标,-1:队列为空
     */
    private int rearIndex = -1;

    /**
     * 构造函数初始化数组
     *
     * @param type
     * @param size
     */
    public ArrayQueue(Class<T> type, int size) {
        if (size <= 0) {
            logger.error("数组大小不能小于0！");
            return;
        }
        this.size = size;
        queue = (T[]) Array.newInstance(type, size);
    }


    /**
     * 判断队列是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return rearIndex == -1;
    }

    /**
     * 判断队列是否已满
     *
     * @return
     */
    public boolean isFull() {
        return rearIndex == size - 1;
    }

    /**
     * 入队
     *
     * @param data
     * @return
     */
    public boolean enqueue(T data) {
        if (isFull()) {
            logger.warn("队列已满！" + data + "入队失败");
            return false;
        }
        queue[++rearIndex] = data;
        return true;
    }

    /**
     * 出队
     *
     * @return
     */
    public T dequeue() {
        // 队空
        if (isEmpty()) {
            logger.error("队空！");
            return null;
        } else {
            // 待出队数据
            T temp = queue[0];
            //将数组中数据向前移动一位
            for (int i = 0; i <= rearIndex - 1; i++) {
                queue[i] = queue[i + 1];
            }
            rearIndex--;
            return temp;
        }
    }

    /**
     * 输出数组队列
     */
    public void printQueue() {
        if (isEmpty()) {
            logger.info("队列为空！");
            return;
        }
        logger.info("---------------------数组队列输出开始--------------------");
        for (int i = 0; i <= rearIndex; i++) {
            System.out.print(queue[i] + "\t");
        }
        System.out.println();
        logger.info("---------------------数组队列输出结束--------------------");
    }

}
