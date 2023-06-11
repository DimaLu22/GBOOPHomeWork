public class Freelancer extends Employee {

    private String status = "Фриансер";
    public Freelancer(String name, String surname, String status, double salary) {
        super(name, surname, status, salary);
    }

    @Override
    public double calculateSalary() {
        return salary*8*20;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s; Среднемесячная зарплата (фикс месячная оплата): %.2f (руб.)", surname, name, status, calculateSalary());
    }
}
