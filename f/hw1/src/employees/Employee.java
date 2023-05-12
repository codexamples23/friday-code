package employees;

public abstract class Employee {
    protected int salary;
    protected long id;

    public Employee(int salary) {
        this.salary = salary;
    }

    public abstract void whoAmI();
}
