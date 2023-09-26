package ru.gb.Product;

public class PotionReward extends ItemReward {
    @Override
    public void open() {
        System.out.println("Pot!");
    }
}
