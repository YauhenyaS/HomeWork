package ru.geekbrains.homework6;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public void run(int a){
        System.out.printf(" Кот %s пробежал %d метров\n",name,a);
    }
    @Override
    public void swim(int b){
        System.out.printf(" Кот %s не умеет плавать\n",name);
    }

}
