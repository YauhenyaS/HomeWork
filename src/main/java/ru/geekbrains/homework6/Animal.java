package ru.geekbrains.homework6;

public class Animal {
    protected String name;
    public Animal(){}
    public Animal(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void run(int a){
        System.out.printf(" %s пробежало %d метров\n",name,a);
    }
    public void swim(int b){
        System.out.printf(" %s проплыло %d метров\n",name,b);
    }



}
