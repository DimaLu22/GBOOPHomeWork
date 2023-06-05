class Plate {

    private int food;

    int getFood() {
        return food;
    }

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int n) {
        food -= n;
    }

    void increaseFood() {
        this.food += 50;
        System.out.println("Add 50 grams");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }

}

