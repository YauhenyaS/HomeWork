package ru.geekbrains.homework7;

public class Bowl {
    private int foodAmount;

    public int getFoodAmount() {
        return foodAmount;
    }

    public void putFood(int amount){
        this.foodAmount+=amount;
        System.out.printf("Food increased by %d, there is now %d\n",amount,foodAmount);
    }
    public void decreaseFood(int amount){
        if(foodAmount>amount){
            this.foodAmount-=amount;
            System.out.printf("Food decreased by %d, there is now %d\n",amount,foodAmount);
        }
    }
}
