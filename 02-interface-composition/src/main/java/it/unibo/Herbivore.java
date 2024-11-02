package it.unibo;

public class Herbivore implements Diet {

    @Override
    public boolean canEatVegetables() {
        return true;
    }

    @Override
    public boolean canEatMeat() {
        return false;
    }
    
}
