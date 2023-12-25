package hw4;

public class Cat extends Animal {
    public String ears;

    public Cat(String food, String location, String ears) {
        super(food, location);
        this.ears = ears;
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
