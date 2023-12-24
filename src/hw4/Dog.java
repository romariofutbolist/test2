package hw4;

public class Dog extends Animal {
    private String barking;

    public Dog(String food, String location, String barking) {
        super(food, location);
        this.barking = barking;
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
