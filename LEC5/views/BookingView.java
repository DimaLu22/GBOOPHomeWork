import Test.Lec5.models.Table;
import Test.Lec5.presenters.View;
import Test.Lec5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    public void setObserver(ViewObserver observer){
        this.observer = observer;
    }

    @Override
    public void printReservationTableResult(int reservationNo) {
        System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
    }

    @Override
    public void printReservationTableError(String errorMessage) {
        System.out.printf("Невозможно забронировать столик. \n%s\n", errorMessage);
    }

    @Override
    public void printChangeReservationTableResult(int reservationNo) {
        System.out.printf("Бронь умпешно изменена. Номер новой брони: #%d\n", reservationNo);
    }

    @Override
    public void printChangeReservationTableError(String errorMessage) {
        System.out.printf("Невозможно изменить бронь. \n%s\n", errorMessage);
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    public void reservationTable(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    /**
     * TODO: реализовать функционал изменения бронирования столика самостоятельно в рамках домашнего задания
     * Действие клиента (пользователь нажал на кнопку изменения бронирования столика)
     * @param oldReservation идентификатор бронирования (старый)
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
            reservationTable(reservationDate, tableNo, name);
    }

}