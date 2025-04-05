package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {

    @Test
    public void testPush(){
        IntLinkedList list = new IntLinkedList();
        int testValue = 5;
        list.push(testValue);
        int result = list.top();

        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testPop(){
        IntLinkedList list = new IntLinkedList();
        int testValue = 27;
        list.push(testValue);
        int result = list.pop();

        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testIsempty(){
        IntLinkedList list = new IntLinkedList();
        boolean result = list.isEmpty();

        Assert.assertEquals(true, result);

        int testValue = 27;
        list.push(testValue);
        result = list.isEmpty();

        Assert.assertEquals(false, result);
    }

    @Test
    public void testTop(){
        IntLinkedList list = new IntLinkedList();
        final int CAPACITY = 10;
        int testValue = CAPACITY - 1;
        for (int i = 0; i < CAPACITY; ++i){
            list.push(i);
        }
        int result = list.top();

        Assert.assertEquals(testValue, result);
    }
}
