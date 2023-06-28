public class Student extends Applicant {
    public Student(String name, String vacancy) {
        this.name = name;
        this.nameVacancy = vacancy;
        minSalary = random.nextDouble(2000, 5000);
        hasJob = false;
    }

    @Override
    public String toString() {
        return "Студент";
    }
}
