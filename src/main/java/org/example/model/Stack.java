package org.example.model;

public class Stack {
    private Node first;

    public void push(String str) {
        if (str == null) {
            return;
        }

        if (first == null) {
            first = new Node(str);
            return;
        }

        Node tmp = first;
        first = new Node(str);
        first.setNext(tmp);
    }

    public String pop() {
        Node tmp = first;
        if (first.getNext() != null) {
            first = tmp.getNext();
        }

        return tmp.getInhalt();
    }

    public String top() {
        return first.getInhalt();
    }

    public boolean isEmpty() {
        return first == null;
    }

    public String toString() {
        String ret = "[";

        Node tmp = first;
        while (tmp != null) {
            ret += tmp.getInhalt();

            if (tmp.getNext() != null) {
                ret += ";";
            }

            tmp = tmp.getNext();
        }

        ret += "]";

        return ret;
    }
}