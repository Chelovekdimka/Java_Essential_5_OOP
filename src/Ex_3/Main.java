//Використовуючи Intelij IDEA, створити проект, пакет. Використовуючи клас Zoo Завдання 2,
//        видалити 3, 5, 7 тварин, дізнатися розмір списку і вивести в консоль.


package Ex_3;


import Ex_2.Zoo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Видаляємо з попереднього списку 3 тварин: ");
        Zoo zoo = new Zoo();
        zoo.animals.remove(7);
        zoo.animals.remove(5);
        zoo.animals.remove(3);
        System.out.println("Новий розмір списку тварин у класі Zoo: " + zoo.animals.size());
        System.out.println(zoo.animals);
        System.out.println("Видаляємо з попереднього списку ще 2 тварин: ");
        zoo.animals.remove(0);
        zoo.animals.remove(0);
        System.out.println("Новий розмір списку тварин у класі Zoo: " + zoo.animals.size());
        System.out.println(zoo.animals);
        System.out.println("Видаляємо з попереднього списку ще 2 тварин: ");
        zoo.animals.remove(0);
        zoo.animals.remove(0);
        System.out.println("Новий розмір списку тварин у класі Zoo: " + zoo.animals.size());
        System.out.println(zoo.animals);
    }
}
