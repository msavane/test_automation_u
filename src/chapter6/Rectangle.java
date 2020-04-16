package chapter6;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;//can be set this way
        setWidth(width);// or can be set this way - both correct
    }

    double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter() {
        double cp = ((2 * length) + (2 * width));
        return cp;
    }

    public double calculateAra() {
        double ca = (length * width);
        return ca;
    }

}
