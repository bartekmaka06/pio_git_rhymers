package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

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
        intArrayStack.countIn(in);
    }

    public boolean callCheck() {
        return intArrayStack.callCheck();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }

    public int setTotal(int total) {
        return intArrayStack.setTotal(total);
    }
    public int peekaboo() {
        return  intArrayStack.peekaboo();
    }
}
