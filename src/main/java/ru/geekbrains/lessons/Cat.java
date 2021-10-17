package ru.geekbrains.lessons;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFed;

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
        isFed = false;
    }

    public boolean getIsFed()
    {
        return isFed;
    }

    public void eat(Plate p)
    {
        isFed = p.decreaseFood(appetite);
        System.out.println(name + (isFed ? " сыт (съел " + appetite + " еды)"
                : " голоден, он хочет " + appetite + " еды. Добавьте ещё!"));
        p.info();
    }
}
