package lesson11;

public class Cat extends Animal {
    private String name;
    private boolean wellfed = false;
    private int hungry;
    public static int it;

    public Cat(String name, int hungry) {
        this.name = name;
        this.hungry = hungry;
    }

    @Override
    public void run(int run) {
        //super.run(run);
        if (run <= 200 && run >= 0) {
            System.out.println(" Кот " + name + " бежит " + run + " метров");
        } else {
            System.out.println(" Кот " + name + " не может столько метров пробежать " + run);
        }
    }

    @Override
    public void swim(int swim) {
        // super.swim(swim);
        System.out.println("Кот " + name + " не умеет плавать");
    }

    public void itInfo() {
        if (it >= 0 && it >= hungry) {
            it = it - hungry;
            wellfed = true;
            System.out.println("В миске осталось еды " + it + " Кот " + name + " сыт " + wellfed);

        } else {
            System.out.println("В миске мало еды " + it + " Кот " + name + " голоден " + wellfed);
        }
    }

    public static void itCats(int itcats) {
        it = it + itcats;
        System.out.println("Еды в миске у котов стало " + it);
    }
}
