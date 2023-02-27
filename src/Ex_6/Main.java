//        Створити class Main, у ньому створити список, додати вчителів,
//        яких ви зможете згадати зі школи. І отримати індекс найкращого вчителя та самого не дуже. Вивести список у консоль.

package Ex_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Anna Vasilivna");
        teachers.add("Benedict Cucumber");
        teachers.add("Vasil Rjopecky");
        teachers.add("Volodimir Zelensky");
        int bestTeacherIndex = teachers.size() - 1;
        String bestTeacher = teachers.get(bestTeacherIndex);
        int worstTeacherIndex = 1;
        String worstTeacher = teachers.get(worstTeacherIndex);
        System.out.println("Найкращий вчитель: " + bestTeacher + " (індекс " + (bestTeacherIndex+1) + ")");
        System.out.println("Не дуже добрий вчитель: " + worstTeacher + " (індекс " + (worstTeacherIndex+1) + ")");

    }
}
