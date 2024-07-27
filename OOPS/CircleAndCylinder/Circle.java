package CircleAndCylinder;

public class Circle {
    private double radius;
    private String color;

    //Constructor

    Circle(double radius , String color)
    {
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
