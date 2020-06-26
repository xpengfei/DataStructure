package com.stack;

import com.stack.dto.LinkedListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xpengfei
 * @Date: 2020/6/25 9:28
 * @Description：链表实现链式栈
 */
public class LinkedListStack<T> {

    private static final Logger logger = LoggerFactory.getLogger(LinkedListStack.class);

    /**
     * 头结点
     */
    private LinkedListNode<T> head;
    /**
     * 栈中元素个数
     */
    private int n = 0;

    /**
     * 头插法，入栈
     *
     * @param newData 待插入的数据
     */
    public void push(T newData) {
        // 临时结点指向原链表头结点
        LinkedListNode<T> oldHead = head;
        // 将newData结点赋给头结点head
        head = new LinkedListNode(newData);
        // 将新的头结点指向原头结点
        head.setNext(oldHead);
        // 栈元素+1
        n++;
    }

    /**
     * 栈顶元素出栈
     */
    public T pop() {
        // 栈空，返回null
        if (isEmpty()) {
            return null;
        }
        LinkedListNode<T> tempNode = head;
        // 删除出栈的结点
        head = head.getNext();
        // 栈中元素个数减一
        n--;
        return tempNode == null ? null : tempNode.getData();
    }

    /**
     * 判断栈是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * 返回栈大小（栈中元素个数）
     *
     * @return
     */
    public int size() {
        return n;
    }

    /**
     * 输出链式栈
     */
    public void printLinkedListStack(){
        LinkedListNode<T> tempNode = head;
        logger.info("*****************栈元素输出开始*********************");
        while (tempNode != null) {
            System.out.print(tempNode.getData()+"\t");
            tempNode = tempNode.getNext();
        }
        System.out.println();
        logger.info("*****************栈元素输出结束*********************");
    }
}
