package edu.kis.vh.nursery;


import edu.kis.vh.nursery.bridgeDesign.IntArrayStack;
import edu.kis.vh.nursery.bridgeDesign.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer() {
    }

    public HanoiRhymer(IntArrayStack intArrayStack) {
        super(intArrayStack);
    }
    public HanoiRhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
