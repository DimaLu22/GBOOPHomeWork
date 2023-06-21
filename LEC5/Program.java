import Test.Lec5.models.Reservation;
import Test.Lec5.models.Table;
import Test.Lec5.models.TableModel;
import Test.Lec5.presenters.BookingPresenter;
import Test.Lec5.presenters.Model;
import Test.Lec5.presenters.View;
import Test.Lec5.views.BookingView;

import java.util.Date;

    public class Program {

        /**
         * TODO: Домашняя работа: Метод changeReservationTable ДОЛЖЕН ЗАРАБОТАТЬ!
         * @param args
         */
        public static void main(String[] args) {
            Model tableModel = new TableModel();
            BookingView bookingView = new BookingView();
            BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
            bookingPresenter.showTables();

            bookingView.reservationTable(new Date(), 1103, "Станислав");
            bookingView.reservationTable(new Date(), 102, "Станислав");

            System.out.println("\n Перенос брони \n");
            bookingView.changeReservationTable(1001, new Date(), 1103, "Станислав");
            bookingView.changeReservationTable(1001, new Date(), 103, "Станислав");
        }

    }
