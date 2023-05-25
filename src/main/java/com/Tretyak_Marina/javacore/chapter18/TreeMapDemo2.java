// listing from page 618
package main.java.com.Tretyak_Marina.javacore.chapter18;

import java.util.*;

class TComp implements Comparator<String> {
    public int compare (String aStr, String bStr) {
        int i,j,k;

        //найти индекс символа, с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k==0) //Фамилии совпадают, проверять имя и фамилию полностью
            return aStr.compareTo(bStr);
        else return k;
    }
    //переопределять метод equals() не требуется
}

class TreeMapDemo2 {
    public static void main (String args[]) {
        //создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

        //ввести элементы в древовижное отображение
        tm.put("Джон Доу", new Double(3434.34));
        tm.put("Toм Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Toд Халл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        //получить множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //вывести элементы из множества
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        //внести сумму 1000 на счет Джона Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + tm.get("Джон Доу"));
    }
}