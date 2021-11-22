package ru.geekbrains.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;


    public Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }

    public void eat(Bowl bowl) {
        if (bowl.getFoodAmount() > appetite) {
            System.out.printf("Cat %s has ate %d food. \n", name, appetite);
            bowl.decreaseFood(appetite);
        } else {
            System.out.printf("Cat %s hasn't ate.Not enough food\n", name);

        }
    }

    public boolean isFull(Bowl bowl) {
        if(bowl.getFoodAmount() > appetite) return full=true;
        else return full;
    }
}

