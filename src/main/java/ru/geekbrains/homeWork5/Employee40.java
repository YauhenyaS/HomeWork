package ru.geekbrains.homeWork5;

public class Employee40 {
    public static void main(String[] args) {
        Employee[] employee= new Employee[5];
        employee[0] = new Employee("Иванов Сергей Иванович", "Босс", "ISI@mail.ru", "291234567", 2000, 40);
        employee[1] = new Employee("Скробко Михаил Николаевич", "Гл. инженер", "SKR@mail.ru", "291425367", 1800, 60);
        employee[2] = new Employee("Дрень Сергей Владимирович", "Вед. инженер", "DR@mail.ru", "291968574", 1500, 30);
        employee[3] = new Employee("Стасюн Евгения Игоревна", "Инженер связи", "ST@mail.ru", "291236547", 1300, 26);
        employee[4] = new Employee("Павлов Константин Николаевич ", "Инженер связи", "PAV@mail.ru", "291239874", 1300, 25);

        for(int i=0;i<5;i++){
            if(employee[i].getAge()>40) employee[i].info();
        }
    }
}
