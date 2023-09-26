package ru.gb.Fabric;

import ru.gb.Interface.iGameItem;
import ru.gb.Product.GemReward;

public class GemGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new GemReward();
    }
}
