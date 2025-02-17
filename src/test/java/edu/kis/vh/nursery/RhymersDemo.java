package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.LinkedListRhymer;
import edu.kis.vh.nursery.factory.RhymersFactory;
import edu.kis.vh.nursery.factory.StackRhymer;

class RhymersDemo {

    private static final int LOOPFORTO15 = 15;
    private static final int TOPINDEXOFRHYMERS = 3;

    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();

        testRhymers(factory);
        System.out.println("--------------");
        RhymersFactory factory2=new StackRhymer();
        testRhymers(factory2);
        System.out.println("--------------");
        RhymersFactory factory3=new LinkedListRhymer();
        testRhymers(factory3);

    }

    private static void testRhymers(RhymersFactory factory) {
        DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = 1; i < LOOPFORTO15; i++)
            for (int j = 0; j < TOPINDEXOFRHYMERS; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < LOOPFORTO15; i++)
            rhymers[TOPINDEXOFRHYMERS].countIn(rn.nextInt(20));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[TOPINDEXOFRHYMERS]).reportRejected());

    }


}