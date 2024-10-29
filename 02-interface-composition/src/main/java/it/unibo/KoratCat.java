package it.unibo;

public class KoratCat implements Animal {

    @Override
    public double averageWeight() {
        return 4.5;
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
