package ru.gb.lesson03.Classes;

import ru.gb.lesson03.Enumerators.TypeCar;
import ru.gb.lesson03.Enumerators.TypeFuel;
import ru.gb.lesson03.Enumerators.TypeGearBox;
import ru.gb.lesson03.Interfaces.ICarWash;
import ru.gb.lesson03.Interfaces.IFuelStation;

import java.awt.*;

public class Pickup extends Car implements IFuelStation, ICarWash {

    private int loadCap;

    public Pickup(String make, String model,
                  int numberWheels, TypeFuel fuelType, TypeGearBox gearBoxType,
                  Color bodyColor, int engineCap, int loadCap) {

        super(make, model, TypeCar.PICKUP, numberWheels, fuelType, gearBoxType, bodyColor, engineCap);

        this.loadCap = loadCap;

    }

    @Override
    public void fuel() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }

    @Override
    public void wipMirrors() {

    }

}
