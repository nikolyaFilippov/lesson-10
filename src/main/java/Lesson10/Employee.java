package Lesson10;

public class Employee {
   private  String initials;
    private String jobTitle;
    private String email;
    private int telephone;
    private int salary;
    private int age;


    public Employee(String initials,String jobTitle,String email,int telephone, int salary, int age){
        this.initials = initials;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println(initials+"\n"+jobTitle+"\n"+email+"\n"+telephone+"\n"+salary+"\n"+age);
    }



}
