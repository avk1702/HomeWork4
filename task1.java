package Java.HomeWork4;

import java.util.Collections;
import java.util.LinkedList;

public class task1 {
     public static LinkedList<Object> fillList(){
        LinkedList<Object> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("один");
        list.add("четыре");
        list.add("пять");
        list.add(6);
        list.add(7);
        return list;
    }
    public static void printList(LinkedList<Object> list){
        for(Object el: list){
            System.out.printf(el + " ");
        }
    }
    public static void replaceList(LinkedList<Object> list){
        int n = list.size()/2;
        int m = list.size();
        for(int i = 0; i < n; i++){
            Object temp = list.get(i);
            list.set(i, list.get(m-i-1));
            list.set(m-i-1, temp);
        }
    }
    public static void main(String[] args) {
        LinkedList<Object> listFirst = fillList();
        printList(listFirst);
        replaceList(listFirst);
        System.out.println();
        printList(listFirst);
    }
}
