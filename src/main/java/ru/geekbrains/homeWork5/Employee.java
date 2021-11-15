package ru.geekbrains.homeWork5;

public class Employee {
    private String fullName;
    private String jobPosition;
    private String email;
    private String phone;
    private int wage;
    private int age;

    public Employee(String fullName, String jobPosition, String email, String phone, int wage, int age) {
        this.fullName = fullName;
        this.jobPosition = jobPosition;
        this.email = email;
        this.phone = phone;
        this.wage = wage;
        this.age = age;
    }

    public void info() {
        System.out.printf("Name:%s,  position:%s,  email:%s,  phone:%s,  wage:%d,  age:%d \n", fullName, jobPosition,
                email, phone, wage, age);
    }
    public int getAge(){
        return this.age;
    }


}
