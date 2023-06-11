public class Worker extends Employee{

    private static String status = "Рабочий";
    public Worker(String name, String surname, String status, double salary) {
        super(name, surname, status, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s; Среднемесячная зарплата (фикс месячная оплата): %.2f (руб.)", surname, name, status, calculateSalary());
    }
}
