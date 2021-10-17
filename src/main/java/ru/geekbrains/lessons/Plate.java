package ru.geekbrains.lessons;

public class Plate {
    private int food;

    public Plate(int food)
    {
        this.food = food;
        info();
    }

    public boolean decreaseFood(int n)
    {
        if (n > food)
            return false;

        food -= n;
        return true;
    }

    public void increaseFood(int n)
    {
        food += n;
        System.out.println("В тарелке: " + food + " еды (добавили " + n + ")");
        System.out.println();
    }

    public void info(){
        System.out.println("В тарелке: " + food + " еды");
        System.out.println();
    }
}
