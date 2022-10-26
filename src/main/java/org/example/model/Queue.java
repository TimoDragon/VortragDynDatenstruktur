package org.example.model;

public class Queue {
    private Node first;

    /**
     * Checks if the list is empty
     * @return true or false
     */
    public boolean isEmpty(){
        return first == null;
    }

    /**
     * Returns String representation of List
     * @return
     */
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
