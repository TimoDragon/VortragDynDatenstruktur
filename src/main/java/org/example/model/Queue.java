package org.example.model;

public class Queue {
    private Node first;

    public boolean isEmpty() {
        return first == null;
    }
    
    public void enqueue(String str) {
        if (first == null) {
            first = new Node(str);
            return;
        }

        Node tmp = first;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        tmp.setNext(new Node(str));
    }

    public String dequeue() {
        Node tmp = first;
        if (tmp != null) {
            first = tmp.getNext();
        }

        return tmp.getInhalt();
    }

    public String front() {
        if (first == null) {
            return null;
        }

        return first.getInhalt();
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