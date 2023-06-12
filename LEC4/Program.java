public class Program {
    public static void main(String[] args) {

        Box<Apple> box1 = new Box<>();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        Box<Orange> box2 = new Box<>();
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());

        /**Сравнение коробок
         * true if ==,  false !=
         **/
        System.out.println(box1.compare(box2));

        /**Создаем еще коробку
         *и пересыпаем в нее box1
         */
        Box<Apple> box3 = new Box<>();
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        System.out.println(box3.getWeight());
        box1.pour(box3);
        System.out.printf("В исходной коробке осталось %.1f, в коробке куда пересыпали стало %.1f",box1.getWeight(), box3.getWeight());
    }
}
