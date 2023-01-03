package org.example.model;

import org.example.model.Node;

public class MyList {
    private Node first;
    private Node current;

    public boolean isEmpty() {
        return first == null;
    }

    public boolean hasAccess() {
        return current != null;
    }

    public void next() {
        if (isEmpty()) {
            return;
        }

        if (!hasAccess()) {
            current = first;
            return;
        }

        if (current.getNext() != null) {
            current = current.getNext();
        }
    }

    public void toFirst() {
        if (isEmpty()) {
            return;
        }

        current = first;
    }

    public void toLast() {
        if (isEmpty()) {
            return;
        }

        Node tmp = first;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }

        current = tmp;
    }

    public String getObject() {
        if (isEmpty()) {
            return null;
        }

        return current.getInhalt();
    }

    public void setObject(String str) {
        if (str == null || isEmpty() || !hasAccess()) {
            return;
        }

        if (first.equals(current)) {
            Node tmp = first;

            first = new Node(str);
            first.setNext(tmp.getNext());
            current = first;
            return;
        }

        Node tmp = first;
        while (tmp.getNext() != null) {
            if (tmp.getNext().equals(current)) {
                Node newNode = new Node(str);
                newNode.setNext(tmp.getNext().getNext());
                tmp.setNext(newNode);
                break;
            }
            tmp = tmp.getNext();
        }
    }

    public void append(String str) {
        if (str == null) {
            return;
        }

        if (isEmpty()) {
            first = new Node(str);
            return;
        }

        Node tmp = first;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }

        tmp.setNext(new Node(str));
    }

    public void insert(String str) {
        if (str == null) {
            return;
        }

        if (isEmpty()) {
            first = new Node(str);
            return;
        }

        Node tmp = first;
        first = new Node(str);
        first.setNext(tmp);
    }

    public void concat(MyList list) {
        if (list == null || list.isEmpty()) {
            return;
        }

        if (isEmpty()) {
            first = list.first;
            return;
        }

        Node tmp = first;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        tmp.setNext(list.first);
    }

    public void remove() {
        if (isEmpty() || !hasAccess()) {
            return;
        }

        if (first.equals(current)) {
            first = current.getNext();
            return;
        }

        Node tmp = first;
        while (tmp.getNext() != null) {
            if (tmp.equals(current)) {
                if (current.getNext() != null) {
                    tmp.setNext(current.getNext());
                }
                else {
                    tmp.setNext(null);
                }
                return;
            }
            tmp = tmp.getNext();
        }
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
