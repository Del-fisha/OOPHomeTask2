package org.example;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        if(this.getFood() > 0)System.out.println("Сейчас в тарелке " + food + " еды.");
        else System.out.println("В тарелке нет еды! Срочно извинись и положи!");
    }

    /**
     * Положить еду
     * @param smth Количество еды
     */
    public void putEat(int smth){
        this.food = this.food + smth;
        System.out.println("Вы положили " + smth + " еды! Теперь в тарелке " + this.food + "еды! ");
    }
}
