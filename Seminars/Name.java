//Задача 1
//Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
//Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

//Задача 1+
//В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//"Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59


package Seminars;

import java.nio.charset.MalformedInputException;
import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Name {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner varScanner = new Scanner(System.in, "866");
        System.out.println("Введите имя: ");
        String name = varScanner.nextLine();
        LocalTime myTime = LocalTime.now();
        if (myTime.getHour() >= 5 && myTime.getHour() < 12) {
            System.out.printf("Доброе утро!, %s!", name);

        }
        else if (myTime.getHour() >= 12 && myTime.getHour() < 18) {
            System.out.printf("Добрый день!, %s!", name);

        }
        else if (myTime.getHour() >= 18 && myTime.getHour() < 22) {
            System.out.printf("Добрый вечер!, %s!", name);

        }
        else {
            System.out.printf("Доброй ночи!, %s!", name);

        }

       // System.out.printf("Привет, %s!", name);
        varScanner.close();
    }
}
