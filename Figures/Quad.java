package hw_7.Figures;

import hw_7.Shape;

public class Quad extends Shape {
    private String name;

    public Quad() {
        this.name = "Quad";
    }

    @Override
    public String getName() {
        return name;
    }
}
