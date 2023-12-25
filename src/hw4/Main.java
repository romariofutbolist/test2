package hw4;

public class Main {
    public static void main(String[] args) {

        Animal [] animals = {
                new Dog("meet", "cabin", "gav-gav"),
                new Cat("milk", "house", "triangular ears"),
                new Horse("oats", "stable", 87)
        };

        Veteriarian veteriarian = new Veteriarian();

        for (Animal animalsForVeteriarian: animals) {
            veteriarian.treatAnimal(animalsForVeteriarian);
            animalsForVeteriarian.makeNoise();

        }
    }
}