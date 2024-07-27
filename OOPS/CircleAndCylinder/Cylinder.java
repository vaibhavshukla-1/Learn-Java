package CircleAndCylinder;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(double radius, String color, double height) {
        this.base = new Circle(radius,color);
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }
}
