package ru.gb.task02;

public class Main {
    public static void main(String[] args) {
        Singleton ob1 = Singleton.getInstance();
        System.out.println(ob1.hashCode());
        Singleton ob2 = Singleton.getInstance();
        System.out.println(ob2.hashCode());

    }
}
