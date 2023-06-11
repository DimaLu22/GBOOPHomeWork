import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();
    static Random flag = new Random();

    static Employee generateEmployee() {
        String[] names = new String[]{"Антолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Дмитрий", "Панкратий", "Рубен"};
        String[] surnames = new String[]{"Иванов", "Петров", "Сидоров", "Григорьев", "Фокин", "Лазарев", "Шестаков", "Шубин", "Бирюков"};
        int salary;
        if (flag.nextInt(2) == 0) {
            salary = random.nextInt(20000, 80000);
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], "рабочий", salary);
        } else {
            salary = random.nextInt(400, 600);
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], "фрилансер", salary);
        }
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = generateEmployee();
        }
//        Arrays.sort(employees, new SalaryComporator());
            Arrays.sort(employees);
        for (Employee employee: employees){
            System.out.println(employee);
        }

     }
}
