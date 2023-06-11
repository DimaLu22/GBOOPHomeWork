import java.util.Comparator;

public class SalaryComporator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return //o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
                Double.compare(o1.calculateSalary(), o2.calculateSalary());
    }
}
