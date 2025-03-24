package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static int CAPACITY = 12;
    public static int EMPTY_INDEX = -1;
    public static int RETURN_VALUE = -1;
    private static int FULL_INDEX = CAPACITY-1;
    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY_INDEX;


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == FULL_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total--];
    }

}
