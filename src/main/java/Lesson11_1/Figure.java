package Lesson11_1;

public class Figure {
    private String color;
    private String colorBorder;


    public Figure(String color,String colorBorder){
        this.color = color;
        this.colorBorder = colorBorder;
        //System.out.println(" Работает конструктор Фигуры");
    }
    public void printColor(){
        System.out.println("Фигура цветом "+color+" границы фигуры цветом "+colorBorder);
    }
}
