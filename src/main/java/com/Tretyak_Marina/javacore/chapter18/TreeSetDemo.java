// listing from page 588
package main.java.com.Tretyak_Marina.javacore.chapter18;

import java.util.*;

class TreeSetDemo {
    public static void main (String args[]) {
        TreeSet<String> ts = new TreeSet<String>();
        // ввести элементы в древовидное множество типа TreeSet
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println (ts) ;
    }
}