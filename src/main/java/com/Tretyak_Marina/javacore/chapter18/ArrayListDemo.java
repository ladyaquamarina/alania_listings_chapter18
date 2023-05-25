// listing from page 581
package main.java.com.Tretyak_Marina.javacore.chapter18;

import java.util.*;

class ArrayListDemo {
    public static void main (String args[]) {
        //создать списочный массив
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Начальный размер списочного массива a1: " + al.size());

        //ввести элементы в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Размер списочного массива a1 после ввода элементов: " + al.size());

        //вывести списочный массив
        System.out.println("Содержимое списочного массива a1: " + al);

        //удалить элементы из списочного массива
        al.remove("F");
        al.remove(2);
        System.out.println("Размер списочного массива a1 после удаления элементов: " + al.size());

        System.out.println("Содержимое списочного массива a1: " + al);
    }
}