package ru.gb.Fabric;

import ru.gb.Interface.iGameItem;
import ru.gb.Product.HerbReward;

public class HerbGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new HerbReward();
    }
}
