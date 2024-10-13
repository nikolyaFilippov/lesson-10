public class Main {
    public static void main(String[] args) {
        System.out.println("Привет");
        Employee[] persArei = new Employee[5];
        Employee em1 = new Employee("И.В.Н.","сотрудник","com@com",293452,200,25);
        persArei[0] = em1;
        persArei[1] = new Employee("Д.В.Иванов.","сотрудник","com@com",293451,250,27);
        persArei[2] = new Employee("Е.В.Петров.","сотрудник","com@com",293453,300,32);
        persArei[3] = new Employee("И.Н.Сидоров.","сотрудник","com@com",293455,200,23);
        persArei[4] = new Employee("Н.М.Никифоров.","руководитель","com@com",293463,700,45);
        persArei[3].printInfo();
        Park park = new Park("Колокольчик");
        park.printInfoPark();


    }


}
