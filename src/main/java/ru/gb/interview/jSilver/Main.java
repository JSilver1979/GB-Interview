package ru.gb.interview.jSilver;

import ru.gb.interview.jSilver.lesson2.CustomArrayList;
import ru.gb.interview.jSilver.lesson2.CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<String> myArrayList = new CustomArrayList<>(1);
        myArrayList.add("First");
        myArrayList.add("Second");
        myArrayList.add("Third");
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(2));
        myArrayList.set(0, "Zero");
        myArrayList.remove(2);
        System.out.println(myArrayList);

        System.out.println("------------------");

        CustomLinkedList<String> myLinkedList = new CustomLinkedList<>();
        myLinkedList.add("First");
        myLinkedList.add("Second");
        myLinkedList.add("Third");
        System.out.println(myLinkedList + "- size: " + myLinkedList.size());
        myLinkedList.exclude("Second");
        System.out.println(myLinkedList + "- size: " + myLinkedList.size());
    }
}