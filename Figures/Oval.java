package hw_7.Figures;

import hw_7.Shape;

public class Oval extends Shape {
    private String name;

    public Oval() {
        this.name = "Oval";
    }

    @Override
    public String getName() {
        return name;
    }
}
