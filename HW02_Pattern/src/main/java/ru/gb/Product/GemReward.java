package ru.gb.Product;

import java.awt.*;
import java.io.Console;

public class GemReward extends ItemReward {
    @Override
    public void open() {
        System.out.println("\u001B[31m" + "Gem!" + "\u001B[0m");
    }
}
