import static Test.Lec7.observer.Company.randomSalary;

public class Program {

    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);

        jobAgency.registerObserver(new Master("Ivanov", "Уборщик"));
        jobAgency.registerObserver(new Master("Petrov", "Frontend-программист"));
        jobAgency.registerObserver(new Student("Sidorov", "Frontend-программист"));
        jobAgency.registerObserver(new Student("Parker", "Водитель"));
        jobAgency.registerObserver(new TeamLead("Nikolaev", "Уборщик"));
        jobAgency.registerObserver(new TeamLead("Vasiliev", "Водитель"));

        for (int i = 0; i < 5; i++){
            geekBrains.needEmployee(TypeOfVacancy.Driver, randomSalary(2000, 5000));
            google.needEmployee(TypeOfVacancy.Cleaner, randomSalary(200000, 300000));
            google.needEmployee(TypeOfVacancy.Frontend, randomSalary(100000, 105000));
            yandex.needEmployee(TypeOfVacancy.Cleaner, randomSalary(100000, 150000));
            yandex.needEmployee(TypeOfVacancy.Backend, randomSalary(100000, 110000));
            geekBrains.needEmployee(TypeOfVacancy.Driver, randomSalary(60000, 100000));
            System.out.println("****************************************************");
        }
    }
}