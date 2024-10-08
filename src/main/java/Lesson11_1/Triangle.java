package Lesson11_1;

public class Triangle extends Figure implements Сalculator{
    private int side1;
    private int side2;
    private int side3;
    private int perimeter;
    private double area;

    public Triangle(String color, String colorBorder,int side1,int side2, int side3) {
        super(color, colorBorder);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void perimeter() {
        perimeter = side1+side2+side3;
    }

    @Override
    public void area() {
        area = Math.sqrt(perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3));
    }

    public void triangleInfo(){
        perimeter();
        area();
        printColor();
        System.out.println("Периметр треугольника " + perimeter + " площадь треугольника " + area);
    }
}
