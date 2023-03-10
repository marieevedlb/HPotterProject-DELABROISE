package org.example;
public class Pet {
    public enum Color {
        RED,
        GREEN,
        BLUE
    }

    private String type;
    private Color color;

    public Pet(String type, Color color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void petInfo() {
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
    }
}
