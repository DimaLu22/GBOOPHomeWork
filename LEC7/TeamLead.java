public class TeamLead extends Applicant {

    public TeamLead(String name, String vacancy) {
        this.name = name;
        this.nameVacancy = vacancy;
        minSalary = random.nextDouble(200000, 300000);
        hasJob = false;
    }

    @Override
    public String toString() {
        return "Руководитель";
    }
}