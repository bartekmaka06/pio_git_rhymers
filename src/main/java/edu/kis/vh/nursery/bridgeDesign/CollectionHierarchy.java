package edu.kis.vh.nursery.bridgeDesign;

public interface CollectionHierarchy {
    public static final int ERR = 0;
    public void push(int in);
    public boolean isFull();
    public boolean isEmpty();
    public int top();
    public int pop();
}
