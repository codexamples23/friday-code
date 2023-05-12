package employees;

public final class Security extends Employee {

    public Security(int salary) {
        super(salary);
    }

    @Override
    public void whoAmI() {
        System.out.println("security");
    }
}
