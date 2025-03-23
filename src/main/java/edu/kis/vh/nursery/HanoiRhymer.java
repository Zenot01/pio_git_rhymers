package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int TOTAL_REJECTED = 0;

    public int reportRejected() {
        return TOTAL_REJECTED;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            TOTAL_REJECTED++;
        else
            super.countIn(in);
    }
}
