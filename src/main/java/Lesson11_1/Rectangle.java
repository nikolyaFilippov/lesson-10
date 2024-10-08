package Lesson11_1;

public class Rectangle extends Figure implements Сalculator {
        private int sideLength;
        private int sideWidth;
        private int perimeter;
        private int area;

    public Rectangle(String color, String colorBorder,int side1,int side2) {
        super(color, colorBorder);
        this.sideLength = side1;
        this.sideWidth = side2;
    }

    @Override
    public void perimeter() {
        perimeter = 2*(sideLength+sideWidth);

    }

    @Override
    public void area() {
        area = sideLength*sideWidth;
    }
    public void infoRectangle(){
        perimeter();
        area();
        printColor();
        System.out.println("Периметр прямоугольника " + perimeter + " площадь прямоугольника " + area);
    }
}
