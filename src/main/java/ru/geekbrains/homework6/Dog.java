package ru.geekbrains.homework6;

public class Dog extends Animal{
    public Dog(String name,int maxRun,int maxSwim){
        super(name,maxRun,maxSwim);
    }
    @Override
    public void run(int a){
        if (a >= getMaxRun()) {
            System.out.printf("Собака %s пробежал %d метров\n", name, a);
        } else {
            System.out.printf("%s can't run this distance\n", name);
        }
    }
    @Override
    public void swim(int b){
        if (b >= getMaxSwim()) {
            System.out.printf("Собака %s проплыло %d метров\n", name, b);
        } else {
            System.out.printf("%s can't swim this distance\n", name);
        }
    }
}
