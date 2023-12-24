package hw1;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private double volume;
    private double freeVolume;
    private List<Shape> shapes = new ArrayList<>();

    public Box(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public double getFreeVolume() {
        return freeVolume;
    }

    public boolean add(Shape shape) {
        if(shape.getVolume() > freeVolume) {
            return false;
        }

        shapes.add(shape);
        freeVolume = freeVolume - shape.getVolume();
        return true;
    }
}
