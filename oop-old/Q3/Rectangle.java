
import inheritance.subInh.Shape;

public class Rectangle extends Shape {

    private double length;
    private double width;


    public Rectangle(String color, boolean isFilled, double length, double width) {
        super(color, isFilled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                 super.toString() +
                '}';
    }
}
