public class Park {
    private String namePark;
     Attraction attraction;

    class Attraction{
        String nameattrAction = " ";
        int price = 0;
        String openingHours = " ";

        public Attraction(String nameattrAction, int price, String openingHours){
            this.nameattrAction = nameattrAction;
            this.price = price;
            this.openingHours = openingHours;

        }

        public void  printInfo(){
            System.out.println("Парк: "+ namePark+" в нем атракцион "+nameattrAction+" стоит "+price+"р работает "+openingHours);

        }
    }
    public Park(String namePark){
        this.namePark = namePark;
    }
    public void printInfoPark(){
        Attraction attraction1 = new Attraction("карусель",35,"с 10 до 15");
        attraction1.printInfo();
        System.out.println(namePark+" ");
    }

}
