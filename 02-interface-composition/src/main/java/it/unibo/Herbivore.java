package it.unibo;

public class Herbivore implements Diet {

    @Override
    public boolean isHerbivore() {
        return true;
    }

    @Override
    public boolean isCarnivore() {
        return false;
    }

    @Override
    public boolean isOmnibore() {
        return false;
    }

    
}
