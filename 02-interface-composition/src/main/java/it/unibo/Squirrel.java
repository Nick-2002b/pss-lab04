package it.unibo;

public class Squirrel implements Animal {

    @Override
    public double averageWeight() {
        return 0.681;
    }

    @Override
    public boolean canEatVegetables() {
        return true;
    }

    @Override
    public boolean canEat(Animal a) {
        return this.averageWeight() > a.averageWeight();
    }
    
}
