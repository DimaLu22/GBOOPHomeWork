public class Master extends Applicant {

    public Master(String name, String vacancy) {
        this.name = name;
        this.nameVacancy = vacancy;
        minSalary = random.nextDouble(60000, 100000);
        hasJob = false;
    }

    @Override
    public String toString() {
        return "Мастер";
    }
}