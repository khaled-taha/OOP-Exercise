package inheritance.subInh;

public abstract class Shape {
    private String color;
    private boolean isFilled;

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }




}
