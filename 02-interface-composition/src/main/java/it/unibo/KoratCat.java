package it.unibo;

public class KoratCat implements Animal {

    private Diet dieta;

    KoratCat(){
        this.dieta = new Carnivore();
    }
    
    @Override
    public double averageWeight() {
        return 4.5;
    }

    @Override
    public boolean canEatVegetable() {
        return dieta.isCarnivore();
        // use diet
    }

    @Override
    public boolean canEat(Animal a) {
        // use diet
        if(this.dieta.isCarnivore() && this.averageWeight() > a.averageWeight()) {
            return true;
        }
        return false;
    }
    
}
