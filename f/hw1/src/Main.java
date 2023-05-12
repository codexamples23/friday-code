import employees.Employee;
import employees.Recruiter;

public class Main {
    public static void main(String[] args) {

        Recruiter recruiter2 = new OutsourceRecruiter();
        Recruiter recruiter1 = (Recruiter) recruiter2.hire("recruiter");

        Employee salesman = recruiter1.hire("salesman");
        Employee manager = recruiter2.hire("manager");

        salesman.whoAmI();
        manager.whoAmI();

        // ClassCastException!!!!!
        // Recruiter recruiter3 = (Recruiter) recruiter1.hire("salesman");



    }
}