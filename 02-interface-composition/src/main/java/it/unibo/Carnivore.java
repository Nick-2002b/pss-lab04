package it.unibo;

public class Carnivore implements Diet {

    @Override
    public boolean isHerbivore() {
        return false;
    }

    @Override
    public boolean isCarnivore() {
        return true;
    }

    @Override
    public boolean isOmnibore() {
        return false;
    }
}
