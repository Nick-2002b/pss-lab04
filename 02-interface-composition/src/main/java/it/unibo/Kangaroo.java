package it.unibo;

public class Kangaroo implements Animal {

    private Diet dieta;

    Kangaroo(){
        this.dieta = new Herbivore();
    }

    public double averageWeight() {
        return 55.0;
    }

    @Override
    public boolean canEatVegetable() {
        return dieta.isHerbivore();
    }

    @Override
    public boolean canEat(Animal a) {
        if(this.dieta.isCarnivore() && this.averageWeight() > a.averageWeight()){
            return true;
        }
        return false;
    }
    
}
