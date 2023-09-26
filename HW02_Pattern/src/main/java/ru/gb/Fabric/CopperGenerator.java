package ru.gb.Fabric;

import ru.gb.Interface.iGameItem;
import ru.gb.Product.CopperReward;

public class CopperGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new CopperReward();
    }
}
