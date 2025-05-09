package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static int CAPACITY = 12;
    private static int EMPTY_INDEX = -1;
    private static int RETURN_VALUE = -1;
    private static int FULL_INDEX = CAPACITY-1;
    private final int[] numbers = new int[CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY_INDEX;


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_INDEX;
        // TODO: nazwa metody callCheck mało intuicyjna
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
