package hw4;

public class Horse extends Animal {
    private int size;
    public Horse(String food, String location, int size) {
        super(food, location);
        this.size = size;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
    }
}
