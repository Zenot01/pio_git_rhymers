package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

    public DefaultCountingOutRhymer GetStandardRhymer();

    public DefaultCountingOutRhymer GetFalseRhymer();

    public DefaultCountingOutRhymer GetFIFORhymer();

    public DefaultCountingOutRhymer GetHanoiRhymer();

    // TODO: nazwy metod zaczynają się wielką literą – niezgodne z konwencją Javy

}
