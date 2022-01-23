package edu.kis.vh.nursery;

import edu.kis.vh.nursery.bridgeDesign.IntArrayStack;

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack=new IntArrayStack();
    public DefaultCountingOutRhymer(){}
    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    public void countIn(int in) {
        intArrayStack.push(in);
    }

    public boolean callCheck() {
        return intArrayStack.isEmpty();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int countOut() {
        return intArrayStack.pop();
    }

    public int setTotal(int total) {
        return intArrayStack.setTotal(total);
    }
    public int peekaboo() {
        return  intArrayStack.top();
    }
}
