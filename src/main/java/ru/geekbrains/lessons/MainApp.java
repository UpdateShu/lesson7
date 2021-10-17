package ru.geekbrains.lessons;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cats = new Cat[6];
        cats[0] = new Cat("Барсик", 30);
        cats[1] = new Cat("Сёма", 25);
        cats[2] = new Cat("Васька", 20);
        cats[3] = new Cat("Мурзик", 20);
        cats[4] = new Cat("Пушок", 10);
        cats[5] = new Cat("Людвиг", 40);

        Plate plate = new Plate(100);
        for (Cat cat : cats)
        {
            cat.eat(plate);
            if (!cat.getIsFed())
            {
                plate.increaseFood(50);
                cat.eat(plate);
            }
        }
    }
}
