public class Main {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        TeaMachine teaMachine = new TeaMachine();

        Coffee drink1 = coffeeMachine.makeDrink();
        Drink drink2 = teaMachine.makeDrink();

        serveDrink(coffeeMachine.makeDrink());
        serveDrink(teaMachine.makeDrink());

        // гадание
        Askable askable1 = coffeeMachine.makeDrink();
        Askable askable2 = new Tarot();

        System.out.println(askable1.ask());
        System.out.println(askable2.ask());
    }

    public static void serveDrink(Drink drink) {
        System.out.println("drink is being served");
    }



















    private static DrinkMachine drinkMachine = new TeaMachine();

    public static void doSomething() {
        serveDrink(drinkMachine.getDrink());
    }


}

// функциональный интерфейс










