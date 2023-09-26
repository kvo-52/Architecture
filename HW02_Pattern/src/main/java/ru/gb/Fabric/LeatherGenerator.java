package ru.gb.Fabric;

import ru.gb.Interface.iGameItem;
import ru.gb.Product.LeatherReward;

public class LeatherGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new LeatherReward();
    }
}
