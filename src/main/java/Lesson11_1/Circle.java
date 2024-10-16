package Lesson11_1;

public class Circle extends Figure implements Сalculator {
    private int radius;
    private double perimeter;
    private double area;

    public Circle(String color, String colorBorder, int radius) {
        super(color, colorBorder);
        this.radius = radius;
    }

    @Override
    public void perimeter() {
        perimeter = 2 * 3.14 * radius;
    }

    @Override
    public void area() {
        area = 3.14 * (radius * radius);
    }

    public void infoCircle() {
        perimeter();
        area();
        printColor();
        System.out.println("Периметр круга " + perimeter + " площадь круга " + area);
    }
}
