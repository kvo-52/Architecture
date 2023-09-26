package ru.gb.Fabric;

import ru.gb.Interface.iGameItem;
import ru.gb.Product.PotionReward;

public class PotionGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new PotionReward();
    }
}
