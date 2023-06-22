package Test.Lec6.srp2;

public class Program {
    public static void main(String[] args) {

            System.out.println("Введите заказ:");
            Order orderFromConsole = new Order("", "", 0, 0);
            Order orderFromJson = new Order("", "", 0, 0);

        /** Заказ вводится с консоли и
        * записывается в файл order.json
        **/
            new IO().inputFromConsole(orderFromConsole);
            new IO().saveToJson("order.json", orderFromConsole);

    }
}
