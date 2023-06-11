public abstract class Employee implements Comparable<Employee>{

    protected String name;
    protected String surname;

    protected String status;
    protected double salary;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String surname, String status, double salary) {
        this.name = name;
        this.surname = surname;
        this.status = status;
        this.salary = salary;
    }
    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int res = status.compareTo(o.status);
        if (res == 0) {
            return Double.compare(calculateSalary(), o.calculateSalary());
        }
        return res;
    }
}
