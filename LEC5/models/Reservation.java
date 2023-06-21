import java.util.Date;

public class Reservation {


    private static int counter = 1000;
    private final int id;

    private Date data;
    private String name;

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public String getName() {
        return name;
    }

    {
        id = ++counter;
    }

    public Reservation(Date data, String name) {
        this.data = data;
        this.name = name;
    }

}
