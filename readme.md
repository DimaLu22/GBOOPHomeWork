## Практические задания к семинарам по теме ООП

Урок 1 (LEC1)

Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад и калории) и включить в список продуктов в вендинг машину.
Продемонстрировать работу класса по продаже товаров (как мы это делали на уроке).


Урок 2 (LEC2)

1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
3. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
4. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

Урок 3 (LEC3)

Доработать приложение, которое мы разрабатывали на уроке. Мы доллжны поработать с сортировкой объектов, освоить работу с интерфейсами Comparator, Comparable.

Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
Переработать метод generateEmployee, метод должен создавать случайного сотрудника (Worker, Freelancer или любого другого). Метод должен быть один!
Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту? Тогда добавьте соответствующее состояние на уровне ваших классов).
Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.

Урок 4 (LEC4)

- Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
- Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
- Для хранения фруктов внутри коробки можно использовать ArrayList;
- Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
- Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
- Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
- Не забываем про метод добавления фрукта в коробку.

Урок 5 (LEC5)

Доработать систему бронирования столиков. Метод changeReservationTable должен ЗАРАБОТАТЬ!

Урок 6 (LEC6)

Доработать приложение (семинар, пакет srp2) в рамках понимания работы принципов SOLID:

Урок 7 (LEC7)

Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,

* добавить новый тип соискателя.
* Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
* Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum), 
  учитывать тип вакансии при отправке предложения соискателю.


https://github.com/DimaLu22/GBOOPHomeWork.git