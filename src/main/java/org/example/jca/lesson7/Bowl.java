package org.example.jca.lesson7;

public class Bowl {

    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
        if (foodAmount < 0) this.foodAmount = 0;
    }

    public void decreaseFood(int amount) {
        int catFull = 1;
        if (this.foodAmount <= 0) {
            System.out.println("Трагедия. Миска пустая. Кот голодный, еды нет.");
            // тут надо наложить еды
            fullBowl();
        }
        if (this.foodAmount < amount) {
            System.out.printf("Кот из миски скушал то, что осталось (%s грамм корма). Он не доволен.\n", this.foodAmount);
            this.foodAmount = 0;
            fullBowl();
            amount = amount - this.foodAmount;
            if (this.foodAmount < amount) {
                System.out.printf("Кот из миски снова скушал то, что осталось (%s грамм корма). Он не доволен и просит ещё.\nЭту лошадь нам не прокормить.\n", this.foodAmount);
                this.foodAmount = 0;
            } else {
                this.foodAmount -= amount;
                System.out.printf("Кот из миски докушал %d грамм корма, теперь там осталось: %d грамм корма\nКотик покушал. Он сытый и довольный\n", amount, this.foodAmount);
                catFull = 0;
            }
        } else if (this.foodAmount == amount) {
            this.foodAmount = 0;
            System.out.printf("Кот из миски скушал %d грамм корма. Корм кончился, но кот сытый и довольный\n", amount);
            catFull = 0;
        } else {
            this.foodAmount -= amount;
            System.out.printf("Кот из миски скушал %d грамм корма, теперь там осталось: %d грамм корма\nКотик покушал. Он сытый и довольный\n", amount, this.foodAmount);
            catFull = 0;
        }
        Cat.setFullness(catFull);
    }

    public void fullBowl() {
        this.foodAmount += 100;
        System.out.printf("Насыпаем в пустую миску ещё %s грамм корма\n", this.foodAmount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "foodAmount=" + foodAmount +
                '}';
    }
}
