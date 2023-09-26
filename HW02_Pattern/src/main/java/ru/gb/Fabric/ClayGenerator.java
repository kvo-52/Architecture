package ru.gb.Fabric;

import ru.gb.Interface.iGameItem;
import ru.gb.Product.ClayReward;

public class ClayGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new ClayReward();
    }
}
