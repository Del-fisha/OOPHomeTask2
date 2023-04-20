package org.example;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate smth) {
        if(this.appetite < smth.getFood()) {
            smth.setFood(smth.getFood() - this.appetite);
            this.satiety = true;
            System.out.println(this.name + " поел " + this.appetite + " еды. Осталось "
                                + smth.getFood() + ". Сытость кота:" + this.satiety);
        }
        else{
            System.out.println(this.name + " Не поел!! В тарелке недостаточно еды! Срочно принеси извинения и положи!");
        }
    }
}
