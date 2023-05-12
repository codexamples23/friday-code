public class Coffee extends Drink implements Askable {
    @Override
    public void drink() {
        System.out.println("drinking coffee");

    }

    @Override
    public boolean ask() {
        return false;
    }
}
