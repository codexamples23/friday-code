package employees;

public final class StateRecruiter extends Employee implements Recruiter {
    public StateRecruiter(int salary) {
        super(salary);
    }

    @Override
    public void whoAmI() {
        System.out.println("recruiter");
    }

    @Override
    public Employee hire(String type) {
        if (type == "salesman") {
            return new Salesman(100);
        } else if (type == "security") {
            return new Security(90);
        } else if (type == "manager") {
            return new Manager(110);
        } else if (type == "recruiter") {
            return new StateRecruiter(100);
        } else {
            throw new RuntimeException("Incorrect employee type");
        }
    }
}
