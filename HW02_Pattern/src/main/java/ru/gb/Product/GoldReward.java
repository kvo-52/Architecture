package ru.gb.Product;

public class GoldReward extends ItemReward {
    @Override
    public void open() {
        System.out.println("\u001B[33m" + "Gold!" + "\u001B[0m");
    }
}
