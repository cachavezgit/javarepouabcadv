package mx.uabc.cursojava.oop.geometria;

import java.util.Comparator;

public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica> {
    private String color="";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
