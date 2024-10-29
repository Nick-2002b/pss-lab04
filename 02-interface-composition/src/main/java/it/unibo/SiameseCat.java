package it.unibo;

public class SiameseCat implements Animal {

    public double averageWeight() {
        return 4.8;
    }

    @Override
    public boolean canEatVegetable() {
        return false;
    }

    @Override
    public boolean canEat(Animal a) {
        return this.averageWeight() > a.averageWeight();
    }
    
}
