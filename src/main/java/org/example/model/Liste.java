package org.example.model;

public class Liste {
    private Node first;

    /**
     * Checks if the list is empty
     * @return true or false
     */
    public boolean isEmpty(){
        return first == null;
    }

    /**
     * Adds String to the list
     * @param pInhalt
     */
    public void
    insert(String pInhalt){
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

    /**
     * Removes first object
     * @return removed object
     */
    public Node dequeue(){
        Node tmp = first;
        if(!isEmpty()){
            first = first.getNext();
        }
        return tmp;
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
