package ru.gb.Fabric;

import ru.gb.Interface.iGameItem;
import ru.gb.Product.GoldReward;

public class GoldGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
}
