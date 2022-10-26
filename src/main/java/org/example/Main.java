package org.example;

import org.example.model.Liste;

public class Main {
    public static void main(String[] args) {

        Liste l1 = new Liste();

        l1.insert("Hallo Welt");
        l1.insert("Peter Pan");
        l1.insert("Manuel");

        System.out.println(l1);

        System.out.println(l1.dequeue());

        System.out.println(l1);

        Liste l2 = new Liste();
        System.out.println(l2.dequeue());

        System.out.println(l2);




    }
}