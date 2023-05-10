//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.
package HomeWork_4;

import java.util.LinkedList;
import java.util.Random;

public class HW_4_2 {
    public static void main(String[] args) {
        LinkedList<Integer> originalList = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < 10
        ; i++) {
            originalList.add(i, rand.nextInt(15));
        }
        System.out.printf("Исходный список: %s \n", originalList);
        System.out.printf("Список с добавлением элемента в конец %s \n", enqueue(originalList, 15));

        System.out.printf("Первый элемент списка %s \n", dequeue(originalList));
        System.out.printf("Исходный список после удаления первого элемента : %s \n", originalList);

        System.out.printf("Первый элемент списка %s \n", first(originalList));
        System.out.printf("Исходный список без удаления первого элемента: %s \n", originalList);
    }

    //        enqueue() - помещает элемент в конец очереди,
    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
        return list;
    }

    //        dequeue() - возвращает первый элемент из очереди и удаляет его,
    public static int dequeue(LinkedList<Integer> list) {
        int num = list.getFirst();
        // System.out.printf("Первый элемент в списке: %s \n", list.getFirst());
        list.removeFirst();
        return num;
    }

    //        first() - возвращает первый элемент из очереди, не удаляя
    public static int first(LinkedList<Integer> list) {
        return list.getFirst();
    }
}
