package org.example;

import org.example.model.Stack;
import org.example.model.SuperList;

public class Main {
    public static void main(String[] args) {
        SuperList s = new SuperList();
        s.append("Timo");
        s.append("2");
        s.append("test");
        s.append("bla");
        s.insert("hahaha");

        s.toLast();
        s.remove();
        System.out.println(s.toString());
    }
}