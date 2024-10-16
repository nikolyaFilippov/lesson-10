package lesson11;

import java.util.Arrays;

public class MainAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 10);
        Dog dog = new Dog("Шарик");
        Cat[] arreiCat = new Cat[5];
        arreiCat[0] = cat;
        arreiCat[1] = new Cat("Мурзик", 15);
        arreiCat[2] = new Cat("Кузя", 20);
        arreiCat[3] = new Cat("Коржик", 25);
        arreiCat[4] = new Cat("Том", 30);
        cat.run(250);
        cat.swim(100);
        dog.run(350);
        dog.swim(9);
        Cat.itCats(50);//Добавляем еду котам
        for (int i = 0; i < arreiCat.length; i++) {
            arreiCat[i].itInfo();
        }
        Animal.invo();

    }
}
