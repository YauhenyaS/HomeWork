package ru.geekbrains.homework6;

public class Animal {
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    public Animal(){}
    public Animal(String name,int maxRun,int maxSwim){
        this.name=name;
        this.maxRun=maxRun;
        this.maxSwim=maxSwim;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }

    public void run(int a){
        if(a>=getMaxRun()){ System.out.printf(" %s пробежало %d метров\n", name, a);}
         else {System.out.printf("%s can't run this distance\n",name);}
    }
    public void swim(int b){
        if(b>=getMaxSwim()){ System.out.printf(" %s проплыло %d метров\n", name, b);}
        else {System.out.printf("%s can't swim this distance\n",name);}
    }



}
