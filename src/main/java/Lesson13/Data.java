package Lesson13;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static String temp;
    public static List<TelephoneDirectory> objectList = new ArrayList<>();

    static {
        TelephoneDirectory directory = new TelephoneDirectory("Иванов",297544327);
        TelephoneDirectory directory1 = new TelephoneDirectory("Петров",297544328);
        TelephoneDirectory directory2 = new TelephoneDirectory("Сидоров",297544329);
        TelephoneDirectory directory3 = new TelephoneDirectory("Иванов",297544330);
        TelephoneDirectory directory4 = new TelephoneDirectory("Иванов",297544331);
        TelephoneDirectory directory5 = new TelephoneDirectory("Петров",297544332);
        objectList.add(directory);
        objectList.add(directory1);
        objectList.add(directory2);
        objectList.add(directory3);
        objectList.add(directory4);
        objectList.add(directory5);
    }

    public static List<TelephoneDirectory> getObjectList(){
        return objectList;
    }

}
