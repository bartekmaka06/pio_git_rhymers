package edu.kis.vh.nursery.bridgeDesign;

public class IntArrayStack implements CollectionHierarchy{
    private static final int INITVALUE = -1;
    private static final int MAXARRAY = 12;

    private int[] numbers = new int[MAXARRAY];

    private int total = INITVALUE;

    public int getTotal() {
        return total;
    }


    @Override
    public void push(int in) {
        if (!isFull())
            numbers[setTotal(getTotal() + 1)] = in;
    }

    public boolean isFull() {
        return getTotal() == MAXARRAY-1;
    }

    @Override
    public boolean isEmpty() {
        return getTotal() == INITVALUE;
    }

    @Override
    public int top() {
        if (isEmpty())
            return ERR;
        return numbers[getTotal()];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return ERR;;
        setTotal(getTotal() - 1);
        return numbers[getTotal()+1];
    }

    public int setTotal(int total) {
        this.total = total;
        return total;
    }
}
