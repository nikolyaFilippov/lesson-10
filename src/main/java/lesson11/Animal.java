package lesson11;

public class Animal {
    //String species;
    public static int counter = 0;


    public Animal() {
        //this.species = species;
        counter = counter + 1;
    }


    public void run(int run) {
        int run1 = run;
        System.out.println("Животное бежит" + run1);
    }

    public void swim(int swim) {
        int swim1 = swim;
        System.out.println("животное плывет" + swim1);
    }

    public static void invo() {
        System.out.println("Животеых создано " + counter);
    }
}
