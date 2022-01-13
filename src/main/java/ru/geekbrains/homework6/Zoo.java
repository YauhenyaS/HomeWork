package ru.geekbrains.homework6;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animalsArray={
                new Animal("Horse",150,300),
                new Animal("Fox",200,100),
                new Animal("Bear",150,150),
        };
        for(int i=0;i< animalsArray.length;i++){
            animalsArray[i].run(150);
            animalsArray[i].swim(200);
        }
        System.out.println("Всего в Zoo "+animalsArray.length+" Animal");
        Cat[] catsArray={
                new Cat("Kit",100,100),
                new Cat("Bug",80,150),
                new Cat("Mel",90,100),};
        for(int i=0;i< catsArray.length;i++){
            catsArray[i].run(50);
            catsArray[i].swim(150);
        }
        System.out.println("Всего в Zoo "+catsArray.length+" Cat");
        Dog[] dogsArray= {
                new Dog("Rick",200,200),
                new Dog("Shell",250,250),
        };
       for(int i=0;i< dogsArray.length;i++){
            dogsArray[i].run(200);
            dogsArray[i].swim(100);
        }
        System.out.println("Всего в Zoo "+dogsArray.length+" Dog");

    }
}
