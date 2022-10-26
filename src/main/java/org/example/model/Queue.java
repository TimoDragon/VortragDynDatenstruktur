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
     * Das Objekt pObject wird an die Schlange angehängt. Falls
     * pObject gleich null ist, bleibt die Schlange unverändert.
     * @param pInhalt
     */
    public void enqueue(String pInhalt){
        //ToDo implement
    }

    /**
     * Das erste Objekt wird aus der Schlange entfernt. Falls die
     * Schlange leer ist, wird sie nicht verändert.
     * @return
     */
    public String dequeue(){
            Node tmp = first;
            if(!isEmpty()){
                first = first.getNext();
            }
            return tmp.toString();
    }

    /**
     * Die Anfrage liefert das erste Objekt der Schlange. Die
     * Schlange bleibt unverändert. Falls die Schlange leer ist, wird
     * null zurückgegeben.
     * @return
     */
    public String front(){
        //ToDo implement
        return null;
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
