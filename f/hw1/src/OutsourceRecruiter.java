import employees.*;

public class OutsourceRecruiter implements Recruiter {
    @Override
    public Employee hire(String type) {
        if (type == "salesman") {
            return new Salesman(90);
        } else if (type == "security") {
            return new Security(80);
        } else if (type == "manager") {
            return new Manager(100);
        } else if (type == "recruiter") {
            return new StateRecruiter(90);
        } else {
            throw new RuntimeException("Incorrect employee type");
        }
    }
}
