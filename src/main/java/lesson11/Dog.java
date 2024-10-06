package lesson11;

public class Dog extends Animal{
    private String name;


    public Dog(String name){
        this.name = name;
    }
    @Override
    public void run(int run) {
        //super.run(run);
        if (run<=500&&run>=0){
            System.out.println(" Собака "+ name+" бежит "+run+" метров");
        }else {
            System.out.println(" Собака "+name+" не может столько метров пробежать "+run);
        }
    }
    @Override
    public void swim(int swim) {
        // super.swim(swim);
        if (swim <= 10 && swim >= 0) {
            System.out.println(" Собака " + name + " плывет " + swim + " метров");
        } else {
            System.out.println(" Собака " + name + " не может столько метров проплыть " + swim);
        }
    }
}
