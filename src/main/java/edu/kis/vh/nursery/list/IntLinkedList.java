package edu.kis.vh.nursery.list;

/**
 * Klasa tworzy listę opartą na węzłach (stos).
 */
public class IntLinkedList {

    public static int RETURN = -1;
    private Node last;
    int i;
    // TODO: zmienna 'i' nieużywana – usunąć, jeśli nie jest potrzebna

    /**
     * Dodaje nowy element na koniec listy (na wierzch stosu).
     *
     * @param i wartość do dodania
     */
    public void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    /**
     * Sprawdza, czy lista jest pusta.
     *
     * @return true jeśli lista jest pusta
     */
    public boolean isEmpty() {
        return getLast() == null;
    }

    /**
     * Zawsze zwraca false, bo lista nie ma ograniczenia rozmiaru.
     *
     * @return false
     */
    public boolean isFull() {
        return false;
        // TODO: metoda zawsze zwraca false – do przemyślenia, czy w ogóle jest potrzebna
    }

    /**
     * Zwraca ostatnią wartość z listy (bez usuwania).
     *
     * @return wartość z końca listy lub RETURN, jeśli lista jest pusta
     */
    public int top() {
        if (isEmpty())
            return RETURN;
        return getLast().getValue();
    }

    /**
     * Usuwa i zwraca ostatni element z listy.
     *
     * @return wartość usuniętego elementu lub RETURN, jeśli lista jest pusta
     */
    public int pop() {
        if (isEmpty())
            return RETURN;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    /**
     * Zwraca ostatni węzeł listy.
     *
     * @return ostatni węzeł
     */
    public Node getLast() {
        return last;
    }

    /**
     * Ustawia ostatni węzeł listy.
     *
     * @param last nowy ostatni węzeł
     */
    public void setLast(Node last) {
        this.last = last;
    }

    /**
     * Klasa reprezentuje jeden węzeł listy (element).
     */
    private static class Node {

        private final int value;
        private Node prev;
        private Node next;

        /**
         * Tworzy nowy węzeł z podaną wartością.
         *
         * @param i wartość węzła
         */
        public Node(int i) {
            value = i;
        }

        /**
         * Zwraca wartość węzła.
         *
         * @return wartość
         */
        public int getValue() {
            return value;
        }

        /**
         * Zwraca poprzedni węzeł.
         *
         * @return poprzedni węzeł
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Ustawia poprzedni węzeł.
         *
         * @param prev poprzedni węzeł
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Zwraca następny węzeł.
         *
         * @return następny węzeł
         */
        public Node getNext() {
            return next;
        }

        /**
         * Ustawia następny węzeł.
         *
         * @param next następny węzeł
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
