package ru.gb.Fabric;

import ru.gb.Interface.iGameItem;

public abstract class ItemGenerator {
    public abstract iGameItem createItem();

    public void openReward() {
        createItem().open();
    }
}
