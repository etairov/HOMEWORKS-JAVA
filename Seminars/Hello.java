
//Настроить проект, вывести в консоль “Hello world!”.
//Вывести в консоль системные дату и время.

package Seminars;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*; //Импорт всех посказок класса сразу

public class Hello {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        LocalDateTime now = LocalDateTime.now ();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYY hh-mm-ss");
        System.out.println(formatter.format(now));
    }
}
