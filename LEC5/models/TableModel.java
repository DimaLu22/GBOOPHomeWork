import Test.Lec5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * Метод получения всех столиков
     * @return
     */

    public Collection<Table> loadTables(){
        if (tables == null)
        {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());

        }
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     */
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table: tables){
            if(table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservation().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }
    public int changeReservationTable(int oldReservation, Date orderDate, int tableNo, String name) {
        for (Table table : tables) {
            for (Reservation reservation : table.getReservation()) {
                if (reservation.getId() == oldReservation) {
                    table.getReservation().remove(reservation);
                    return reservationTable(orderDate, tableNo, name);
                }
            }
        }
        throw new RuntimeException("Некорректный номер брони столика.");
    }

}
