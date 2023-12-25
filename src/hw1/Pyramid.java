package hw1;

public class Pyramid extends Shape implements HeightMetric, SquareMetric{
    private double square;
    private double height;

    public double getSquare() {
        return square;
    }

    public double getHeight() {
        return height;
    }
}
