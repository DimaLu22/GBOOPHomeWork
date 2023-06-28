public enum TypeOfVacancy {
    Cleaner("Уборщик"),
    Driver("Водитель"),
    Frontend("Frontend-программист"),
    Backend("Backend-программист");

    private String vacancy;
    TypeOfVacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    public String getVacancy() {
        return vacancy;
    }
}
