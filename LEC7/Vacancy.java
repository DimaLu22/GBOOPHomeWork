public class Vacancy {

    private TypeOfVacancy vacancyName;

    private double maxSalary;

    private boolean status = true;

    public TypeOfVacancy getVacancyName() {
        return vacancyName;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public boolean isStatus() {
        return status;
    }

    public Vacancy(TypeOfVacancy vacancyName, double maxSalary) {
        this.vacancyName = vacancyName;
        this.maxSalary = maxSalary;
    }
}