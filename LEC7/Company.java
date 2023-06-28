import java.util.Random;

public class Company {

    private static  Random random = new Random();
    private String companyName;

    private Publisher jobAgency;

    static double randomSalary(double min, double max){
        Random random = new Random();
        return random.nextDouble(min, max);
    }

    public Company(String companyName, Publisher jobAgency) {
        this.companyName = companyName;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(TypeOfVacancy nameVacancy, double maxSalary){
        Vacancy vacancy = new Vacancy(nameVacancy, maxSalary);
        jobAgency.sendOffer(companyName, vacancy);
    }

}