package it.unibo;

public class SiameseCat implements Animal {

    private Diet dieta;
    SiameseCat(){
        this.dieta = new Carnivore();
    }
    public double averageWeight() {
        return 4.8;
    }

    @Override
    public boolean canEatVegetables() {
        return dieta.isOmnivore();
    }

    @Override
    public boolean canEat(Animal a) {
        if(this.dieta.isCarnivore() && this.averageWeight() > a.averageWeight()) {
            return true;
        }
        return false;
    }
    
}
