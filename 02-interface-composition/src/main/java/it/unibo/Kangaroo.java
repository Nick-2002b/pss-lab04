package it.unibo;

public class Kangaroo implements Animal {
    
    public double averageWeight() {
        return 55.0;
    }

    @Override
    public boolean canEatVegetable() {
        return true;
    }

    @Override
    public boolean canEat(Animal a) {
        return this.averageWeight() > a.averageWeight();
    }
    
}
