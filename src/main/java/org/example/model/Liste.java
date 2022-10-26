package org.example.model;

public class Liste {
    private Node first;

    public boolean isEmpty(){
        return first == null;
    }

    public void insert(String pInhalt){
        Node tmp = first;
        if (first == null){
            first = new Node(pInhalt);
        } else {
            while (tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(pInhalt));
        }
    }

    public Node dequeue(){
        Node tmp = first;
        if(!isEmpty()){
            first = first.getNext();
        }
        return tmp;
    }

    public String toString(){
        String ret = "[";
        Node tmp = first;

        while (tmp != null){
            if(tmp.getNext() == null){
                ret = ret + tmp.getInhalt();
            }else {
                ret = ret + tmp.getInhalt() + ";";
            }
            tmp = tmp.getNext();
        }


        ret = ret + "]";
        return ret;
    }


}
