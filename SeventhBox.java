package com.company;

import java.util.*;
//import java.util.Locale;


    public class SeventhBox {

        public static void main(String[] args) {

            System.out.println("Выберите задачу,нажав на соответсвующую цифру, ");
            System.out.println();
            Scanner chsel = new Scanner(System.in);//выбор задачи из 4 блока
            int choice = chsel.nextInt();

            switch (choice) {

                    case 1:
                    act1();
                    break;
                            case 2:
                            act2();
                            break;

                    case 3:
                    act3();
                    break;

            case 4:
            act4();
            break;

//            case 5:
//                act5();
//                break;
//            case 6:
//                act6();
//                break;
            case 7:
            act7();
            break;
//            case 8:
//                act8();
//                break;
                default:
                    System.out.println("В разработке");
            }
        }

        private static void act2() {//метод для вывода на экран таблицы умножения.2 задача

            System.out.println("Решение 2 задачи из 7 блока");
            System.out.println("Таблица умножения:");
            System.out.println();

            for (int x = 1; x < 10; x++) {
                for (int y = 1; y < 10; y++) {
                    System.out.print(y + "*" + x + "=" + (x * y) + " " + " \t ");

                }
                System.out.println();

            }
        }

        private static void act3() {// Метод для расчета суммы денег,которую необходимо единовременно просить студенту у родителей,чтобы можно было прожить 10 мес.на эти деньги и стипендию
            System.out.println("Решение 3 задачи:");
            System.out.println("Введите сумму стипендии студента: ");
            Scanner scInp = new Scanner(System.in);
            double n = scInp.nextDouble();//сумма стипендии
            System.out.println("Введите сумму расходов на проживание в месяц");
            //инфляция в месяц составляет 3 %
            double m = scInp.nextDouble();// сумма расходов в месяц
            for (int i = 1; i <= 10; i++) {

                m = 1.03 * m;
                System.out.printf("На %d месяц нужно просить %.2f рубл.", i, (m - n));

                System.out.println();


            }
        }


        private static void act1() {// Метод для вывода решеня 1 задач,где нужно вызваь случайные чсла,определь процент положительных отрицательных чисел,четных и нечетных чисел
            System.out.println("Данный меод вызван для решеня 1 задачи.");
            Random rand = new Random();
            int x_p = 0;// Положительное число
            int x_n = 0;// Отрицательное

            int even = 0;// Четное число
            int odd = 0;// Нечетное число
            int num = 0;// числа введенные в случайном порядке 100 должно быть

            for (int i = 0; i < 100; i++) {
                int x = -100 + rand.nextInt(200);
                System.out.print(x + " ");
                num++;

                if (x >= 0) {
                    x_p++;
                } else {
                    x_n++;
                }

                if (x % 2 == 0) even++;
                else odd++;
            }
            System.out.println("Всего чисел: " + num);
            System.out.println();
            System.out.println("Положительных чисел: " + x_p * 100 / num + " %");
            System.out.println("Отрицаельных чисел: " + x_n * 100 / num + " %");
            System.out.println();
            System.out.println("Четнных чисел: " + even * 100 / num + " %");
            System.out.println("Нечетных чисел: " + odd * 100 / num + " %");
        }
    private static void act4() {//Для отображения четырехугольника полностью "закрашеного" и "пустой рамки"

        System.out.println("Укажите размеры введя два значения(длина и ширина)");
        Scanner scInp = new Scanner(System.in);

        int m = scInp.nextInt();//длина
        int n = scInp.nextInt();//ширина

//////////для заполненного прямоугольника/////////////////////
        for (int i = 1; i <=n ; i++) {//ширины
            for (int j = 1; j <= m ; j++) {//заполнение длины
                System.out.print("*");}

            System.out.print("\n");}

        System.out.println();
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i ==1&&j <= m || i == n&&j <= m || j==1&&i <= n || j==m&&i<=n ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); }}

    private static  void act7(){// метод -решение -является ли число палиндромом

            System.out.println("7 задача -является ли введенное число палидромом");
            System.out.println("Введите число!");
            String def_1 ="Данное число палиндром!";
            String def_2 = "Данное число не палиндром!";
            Scanner scInp = new Scanner(System.in);
            int a = scInp.nextInt();// переменная для ввода числа и для работы цикла
            int b = a;// переменная b присваится значение а, чтобы ее не потерять и использовать для определения числа -палиндром он или нет
            int reverse =0,temp ; //переменная для поворота числа на 180 град

                         while (a >0){//цикл для определения палиндрома

                             temp = a%10;// временная переменая
                             reverse = temp  + reverse*10;
                             a = a /10;}

                    System.out.println(reverse==b?def_1:def_2); }
    }