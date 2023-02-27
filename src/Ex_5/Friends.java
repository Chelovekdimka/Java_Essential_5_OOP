//Використовуючи Intelij IDEA, створити клас Friends.
//        За допомогою методів ArrayList додати масив імена друзів.
//        Вивести список друзів, після вивести список друзів, відсортувавши в алфавітному порядку.

package Ex_5;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        String[] names = {"Anna", "Dmytro", "Olga", "Vasil", "Olga", "Stas"};
        Collections.addAll(friends, names);
        System.out.println(friends);
        Collections.sort (friends);
        System.out.println(friends);
    }
}
