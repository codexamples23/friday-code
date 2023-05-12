package employees;

public final class Manager extends Employee {
    public Manager(int salary) {
        super(salary);
    }

    @Override
    public void whoAmI() {
        System.out.println("manager");
    }
}
