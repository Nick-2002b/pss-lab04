package it.unibo;

public class Omnivore implements Diet {

    @Override
    public boolean isHerbivore() {
        return true;
    }

    @Override
    public boolean isCarnivore() {
        return true;
    }

    @Override
    public boolean isOmnivore() {
        return true;
    }

    
}
