package ru.geekbrains.homework6;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animalsArray={
                new Animal("Horse"),
                new Animal("Fox"),
                new Animal("Bear"),
        };
        for(int i=0;i< animalsArray.length;i++){
            animalsArray[i].run(150);
            animalsArray[i].swim(200);
        }
        System.out.println("Всего в Zoo "+animalsArray.length+" Animal");
        Cat[] catsArray={
                new Cat("Kit"),
                new Cat("Bug"),
                new Cat("Mel"),};
        for(int i=0;i< catsArray.length;i++){
            catsArray[i].run(50);
            catsArray[i].swim(150);
        }
        System.out.println("Всего в Zoo "+catsArray.length+" Cat");
        Dog[] dogsArray= {
                new Dog("Rick"),
                new Dog("Shell"),
        };
       for(int i=0;i< dogsArray.length;i++){
            dogsArray[i].run(200);
            dogsArray[i].swim(100);
        }
        System.out.println("Всего в Zoo "+dogsArray.length+" Dog");

    }
}
