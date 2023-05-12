package employees;

public final class Salesman extends Employee {
    public Salesman(int salary) {
        super(salary);
    }

    @Override
    public void whoAmI() {
        System.out.println("salesman");
    }
}
