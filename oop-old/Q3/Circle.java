
public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;

    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + " " +
                 super.toString() +
                '}';
    }
}
