package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY_INDEX = -1;
    private static final int FULL_INDEX = 11;
    private int[] NUMBERS = new int[CAPACITY];

    private int total = EMPTY_INDEX;


    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == FULL_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_INDEX;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_INDEX;
        return NUMBERS[total--];
    }

}
