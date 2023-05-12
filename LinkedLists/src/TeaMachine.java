public class TeaMachine extends AbstractMachine implements DrinkMachine {
    @Override
    public Tea makeDrink() {
        return new Tea();
    }

    @Override
    public Drink getDrink() {
        return new Tea();
    }
}
