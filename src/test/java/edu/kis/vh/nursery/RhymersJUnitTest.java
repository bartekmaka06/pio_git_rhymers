package edu.kis.vh.nursery;

import edu.kis.vh.nursery.bridgeDesign.IntArrayStack;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {
    @Test
    public void testFIFORhymerCountOut() {
        FIFORhymer rhymer = new FIFORhymer();
        final int EMPTY_STACK_VALUE = 0;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);
        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }
    @Test
    public void testHanoiRhymerReportRejected() {
        HanoiRhymer rhymer = new HanoiRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);
        rhymer.countIn(testValue+1);
        int result=rhymer.reportRejected();
        int resultValue=1;
        Assert.assertEquals(resultValue, result);
    }
    @Test
    public void testHanoiRhymerCountIn() {
        HanoiRhymer rhymer = new HanoiRhymer();
        final int EMPTY_STACK_VALUE = 0;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);
        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }
    @Test
    public void testGetTotal() {
        IntArrayStack rhymer = new IntArrayStack();
        int testValue = 4;
        rhymer.setTotal(testValue);
        int result= rhymer.getTotal();
        Assert.assertEquals(testValue, result);
    }
    @Test
    public void testSetTotal() {
        IntArrayStack rhymer = new IntArrayStack();
        int testValue = 4;
        int result =rhymer.setTotal(testValue);
        Assert.assertEquals(testValue, result);
    }
    @Test
    public void testCountIn() {
        IntArrayStack rhymer = new IntArrayStack();
        int testValue = 4;
        rhymer.push(testValue);

        int result = rhymer.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        IntArrayStack rhymer = new IntArrayStack();
        boolean result = rhymer.isEmpty();
        Assert.assertEquals(true, result);

        rhymer.push(888);

        result = rhymer.isEmpty();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        IntArrayStack rhymer = new IntArrayStack();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.push(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        IntArrayStack rhymer = new IntArrayStack();
        final int EMPTY_STACK_VALUE = 0;

        int result = rhymer.top();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.push(testValue);

        result = rhymer.top();
        Assert.assertEquals(testValue, result);
        result = rhymer.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        IntArrayStack rhymer = new IntArrayStack();
        final int EMPTY_STACK_VALUE = 0;

        int result = rhymer.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.push(testValue);

        result = rhymer.pop();
        Assert.assertEquals(testValue, result);
        result = rhymer.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
