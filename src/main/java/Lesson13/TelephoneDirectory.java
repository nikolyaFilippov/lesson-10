package Lesson13;



public class TelephoneDirectory {
    private String surname;
    private int phoneNumber;
    public static String temp;

    public TelephoneDirectory(String surname, int phoneNumber){
        this.phoneNumber = phoneNumber;
        this.surname = surname;
    }


    public String toString1() {
        return surname ;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return  "Фамилия = " + surname +
                ", номер телефона = " + phoneNumber;
    }
    public static String get(String str){
        return temp = str;
    }

}
