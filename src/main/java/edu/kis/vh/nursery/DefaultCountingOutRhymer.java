package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ERR = -1;
    private static final int INITVALUE = -1;
    private static final int MAXARRAY = 12;


    private int[] numbers = new int[MAXARRAY];

    private int total = INITVALUE;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[setTotal(getTotal() + 1)] = in;
    }

    public boolean callCheck() {
        return getTotal() == INITVALUE;
    }

    public boolean isFull() {
        return getTotal() == MAXARRAY-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERR;
        return numbers[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return ERR;
        return numbers[setTotal(getTotal() - 1)];
    }

    public int setTotal(int total) {
        this.total = total;
        return total;
    }
}
