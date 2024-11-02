package it.unibo;

public class Carnivore implements Diet {

    @Override
    public boolean canEatVegetables() {
        return false;
    }

    @Override
    public boolean canEatMeat() {
        return true;
    }
    
}
