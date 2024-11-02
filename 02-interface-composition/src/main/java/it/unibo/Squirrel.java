package it.unibo;

public class Squirrel implements Animal {

    private Diet dieta;

    Squirrel(){
        this.dieta = new Herbivore();
    }

    @Override
    public double averageWeight() {
        return 0.681;
    }

    @Override
    public boolean canEatVegetables() {
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
