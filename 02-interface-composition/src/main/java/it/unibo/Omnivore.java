package it.unibo;

public class Omnivore implements Diet {

    @Override
    public boolean canEatVegetables() {
        return true;
    }

    @Override
    public boolean canEatMeat() {
        return true;
    }
    
}
