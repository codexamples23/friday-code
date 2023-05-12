public class CoffeeMachine extends AbstractMachine implements DrinkMachine {
    @Override
    public Coffee makeDrink() {
        return new Coffee();
    }

    @Override
    public Drink getDrink() {
        return new Coffee();
    }
}
