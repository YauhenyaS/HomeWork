package ru.geekbrains.homework6;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void run(int a){
        System.out.printf(" Собака %s пробежал %d метров\n",name,a);
    }
    @Override
    public void swim(int b){
        System.out.printf(" Собака %s проплыла %d метров\n",name,b);
    }
}
