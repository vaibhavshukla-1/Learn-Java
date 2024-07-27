package CircleAndCylinder;

public class Test5 {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"Red");
        System.out.println("Circle Info:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(5,"Green",10);
        System.out.println("Cylinder Info:");
        System.out.println("Base Radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
