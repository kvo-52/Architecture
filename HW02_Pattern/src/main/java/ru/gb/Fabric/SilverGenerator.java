package ru.gb.Fabric;

import ru.gb.Interface.iGameItem;
import ru.gb.Product.SilverReward;

public class SilverGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new SilverReward();
    }
}
