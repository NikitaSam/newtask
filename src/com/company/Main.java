package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*System.out.println("Введите Ваше имя:"); // Задание 1
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Привет " + name);
        scanner.close();*/

       /* for( int i = args.length - 1 ; i >= 0 ; i--) //Задание 2
            System.out.println("Reverse : " + args[i]);*/


        /*int[] a = {1, 2, 3, 4, 5}; //Задание 3
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
            System.out.print(a[i]);
        }*/


        /*Scanner scanner = new Scanner(System.in); // Задание 4
        System.out.print("Введите пароль: ");
        String pass1 = scanner.next();
        String pass2 = "tester1";
        if (pass1.equals(pass2))
            System.out.println("Пароль верный");
        else System.out.println("Пароли не совпадают");*/

        /*int sum = 0; // Задание 5
        int com = 1;
        for(int i = 0; i < args.length; i++)
        {
            int temp = Integer.parseInt(args[i]);
            sum = sum + temp;
            com = com * temp;
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + com);*/

        /*System.out.print("Введите количество целых чисел которые вы собираетесь ввести? "); //Задание 6
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] number = new int[size];
        System.out.print("Введите целые числа через пробел и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            number[i] = scanner.nextInt();
        }*/

        /*for (int i = 0; i < size; i++) {
            if (number[i] % 2 == 0)
                System.out.println("Четное:" + number[i]);
            else if (number[i] % 2 != 0)
                System.out.println("Нечетное:" + number[i]);
        }*/

        /*int min = number[0]; // Наименьшее число
        for (int i = 0; i < size; i++) {
            if (min >= number[i]) {
                min = number[i];
            }
        }
        System.out.println("Наименьшее число:" + min);

        int max = number[0]; // Наибольшее число
        for (int i = 0; i < size; i++) {
            if (max <= number[i]) {
                max = number[i];
            }
        }
        System.out.println("Наибольшее число:" + max);*/

        /*for (int i = 0; i < size; i++) // Числа делятся на 3 или на 9
            if ((number[i] % 3 == 0) || (number[i] % 9 == 0))
                System.out.println("Число, которое делится на 3 или 9: " + number[i]);*/

        /*for (int i = 0; i < size; i++) // Числа делятся на 5 и на 7
            if ((number[i] % 5 == 0) && (number[i] % 7 == 0))
                System.out.println("Число, которое делится на 5 и 7: " + number[i]);*/

        /*int a = 0; // Задание 6.5
        int b = 0;
        int c = 0;
        for (int i = 0; i < size; i++) {
            a = number[i] / 10 / 10;
            b = number[i] / 10 % 10;
            c = number[i] % 100 % 10;
            if (a != b && a != c && b != c)
                System.out.println("Число в котором нет одинаковых цифр: " + number[i]);
        }*/

        /* int luckyTicket = 0; // Задание 6.6
        for (int ticketNumber = 1; ticketNumber < 1_000_000; ticketNumber++) {
            if (ticketNumber / 100000 + (ticketNumber / 10000) % 10 + (ticketNumber / 1000) % 10 == (ticketNumber / 100) % 10 + (ticketNumber / 10) % 10 + ticketNumber % 10) {
                luckyTicket++;
            }
        }
        System.out.println("Количество счастливых билетов" + " — " + luckyTicket);*/

    }
}