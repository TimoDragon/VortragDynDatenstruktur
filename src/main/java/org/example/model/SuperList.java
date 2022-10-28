package org.example.model;

public class SuperList {
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

        if (current == null) {
            current = first;
        }

        if (current.getNext() != null) {
            current = current.getNext();
            toLast();
        }
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

        current.setInhalt(str);
    }

    public void append(String str) {
        if (str == null) {
            return;
        }

        if (isEmpty()) {
            first = new Node(str);
            return;
        }

        getLast(first).setNext(new Node(str));
    }

    private Node getLast(Node firstNode) {
        if (firstNode.getNext() != null) {
            firstNode = getLast(firstNode.getNext());
        }

        return firstNode;
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

    public void concat(SuperList list) {
        getLast(first).setNext(list.first);
    }

    public void remove() {
        if (isEmpty() || !hasAccess()) {
            return;
        }

        if (first.equals(current)) {
            first = current.getNext();
            return;
        }

        Node beforeCurrent = getNodeBeforeCurrent(first);
        beforeCurrent.setNext(current.getNext());
        current = beforeCurrent.getNext();
    }

    public Node getNodeBeforeCurrent(Node firstNode) {
        if (!firstNode.getNext().equals(current)) {
            firstNode = getNodeBeforeCurrent(firstNode.getNext());
        }

        return firstNode;
    }

    public String toString() {
        String str = "";
        if (first != null) {
            str += toStr(str, first);
        }

        return "[" + str + "]";
    }

    private String toStr(String str, Node node) {
        if (node != null) {
            str += node.getInhalt();

            if (node.getNext() != null) {
                str += ";";

                return toStr(str, node.getNext());
            }
        }

        return str;
    }
}