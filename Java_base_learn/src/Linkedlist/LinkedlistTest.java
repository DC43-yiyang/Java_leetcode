package Linkedlist;

import java.util.LinkedList;
// The underlying implementation is based on a linked list implementation
public class LinkedlistTest {
    public static void main(String[] args) {
        LinkedList<Integer> listNumber = new LinkedList<>();
        LinkedList<String> listString = new LinkedList<>();
        if (listNumber.isEmpty()) {
            System.out.println("listNumber is empty");
        }
        if (listString.isEmpty()) {
            System.out.println("listString is empty");
        }
        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(3);
        System.out.println(listNumber);
        listNumber.removeFirst();
        System.out.println(listNumber);
        listNumber.removeLast();
        System.out.println(listNumber);

        listString.add("hello");
        listString.add("java");
        System.out.println(listString + " " + listString.size());


    }
}
