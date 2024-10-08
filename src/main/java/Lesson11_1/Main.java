package Lesson11_1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("красный","черный",7,10);
        rectangle.infoRectangle();
        Circle circle = new Circle("синий","черный",10);
        circle.infoCircle();
        Triangle triangle = new Triangle("желтый","красный", 10,15,17);
        triangle.triangleInfo();
    }
}
