//Використовуючи Intelij IDEA, створити проект, пакет.
//        Створити клас Main, створити список цілих чисел і за допомогою ListIterator пройтись по списку і збільшити значення на 1.

package Ex_4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        ListIterator<Integer> iterator = numbers.listIterator();

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            iterator.set(value + 1);
        }

        System.out.println(numbers);
    }
}
