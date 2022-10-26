package org.example.model;

public class Node {
    private String inhalt;
    private Node next;

    public Node (String pInhalt){
        this.inhalt = pInhalt;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node pNode){
        this.next = pNode;
    }

    public String getInhalt(){
        return inhalt;
    }

    public String toString(){
        return "["+inhalt+"]";
    }
}
