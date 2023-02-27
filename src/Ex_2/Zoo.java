//Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Zoo.
//        У класі створити список, який записати 8 тварин через метод add(index, element). Вивести список у консоль.

package Ex_2;

import java.util.ArrayList;

public class Zoo {
        public ArrayList<String> animals;

        public Zoo () {
        animals = new ArrayList<String>();
        animals.add(new String("Кіт"));
        animals.add(new String("Собака"));
        animals.add(new String("Зяць"));
        animals.add(new String("Кінь"));
        animals.add(new String("Лось"));
        animals.add(new String("Слон"));
        animals.add(new String("Капібара"));
        animals.add(new String("Їжак"));
        }
        public void arrayPrint () {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }

        }
}
