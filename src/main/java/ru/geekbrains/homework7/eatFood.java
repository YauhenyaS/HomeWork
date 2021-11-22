package ru.geekbrains.homework7;

public class eatFood {
    public static void main(String[] args) {
        Cat[] cats={
                new Cat("Tint",20,false),
                new Cat("Bon",15, false),
                new Cat("Mic",20, false),
        };

        var bowl=new Bowl();
        bowl.putFood(50);

        for(Cat cat:cats){
            cat.eat(bowl);
            System.out.println(cat.isFull(bowl));
        }
    }


}
