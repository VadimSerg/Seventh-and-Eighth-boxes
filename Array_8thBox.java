package com.company;


import java.util.Random;
import java.util.Scanner;

public class Array_8thBox {

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

            case 5:
                act5();
                break;
//            case 6:
//                act6();
//                break;
//            case 7:
//                act7();
//                break;
//            case 8:
//                act8();
//                break;
            default:
                System.out.println("В разработке");
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void act2() {                                                                                   /////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Задача 2. ");
        System.out.println("Данный метод нужен для определения суммы четных чисел из массива данных: ");

        Random random = new Random();
        int [] array = new  int[10];

//        int[] array = new  int[]{1,5,7,9,11,13,15,17};

        int i , summ_even = 0, qual_even = 0;

        for ( i=0; i < array.length; i++)//данный цикл используется для создания случайных элементов массива

        {
            array[i]=random.nextInt(100);
            System.out.printf(array[i]+"\t");
        }
        System.out.println();

        for (i=0; i<array.length; i++)// данный цикл с if нужен для сортировки массива по признаку четности для определе
            // ния суммы четных чисел

        {
            if (array[i]%2==0){

                System.out.printf( array[i]+" \t");
                summ_even +=array[i];
                qual_even++;}
         }

        System.out.println("-> Четные числа");
        System.out.println(" Число четных чисел: "+ qual_even);
        if (qual_even==0) System.out.println(" N0 ");
        System.out.println("Сумма четных чисел равна: "+summ_even);}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     private static void act3(){//для вывода среднеарифметического элементоа массива с нечктным значением           ////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         System.out.println("Задача 3");
         System.out.println("Данный метод выводит среднее арифметическое значение элементов с нечетным значением");

         Random random = new Random();
         int [] array = new  int[10];

//        int[] array = new  int[]{1,5,7,9,11,13,15,17};

         int i , summ_odd = 0, qual_odd = 0;

         for ( i= 0; i < array.length ; i++)//данный цикл используется для создания случайных элементов массива

         {
             array[i]=random.nextInt(100);
             System.out.printf(array[i]+"\t");
         }
         System.out.println();

            for (i=0; i<array.length; i++)// данный цикл с if нужен для сортировки массива по признаку четности для
                // определения средне-арифметического элемента массива с нечетных числом

         {
             if (array[i]%2!=0){

                 System.out.printf( array[i]+" \t");
                 summ_odd +=array[i];
                 qual_odd++;}
         }

         System.out.println("-> Нечетные числа");
         System.out.println(" Число нечетных чисел: "+ qual_odd);
         if (qual_odd==0) System.out.println(" N0 ");
         System.out.println("Сумма нечетных чисел равна: "+summ_odd);
         double arithmetical_mean = (double) summ_odd/qual_odd ;
         System.out.printf("Среднее арифмитическое нечетных чисел массива  равна %.2f  " , arithmetical_mean ) ;}


          private static void  act1(){
              System.out.println("Решение задачи 1 . Выведите на экран номер элемента массива, который равен X.\n" +
                      "Если таких элементов несколько, выведите меньший номер.\n" +
                      "Выводить на экран номер элемента, который считается от 1.\n" +
                      "То есть, начальный элемент массива при выводе на экран считать первым.\n" +
                      "Если такого элемента нет, выведите \"NO\".\n");

              Scanner sc = new Scanner(System.in);//Здесь используется считывание с ввода
              Random random = new Random();
              System.out.println("Введите длину массива:");

              if (sc.hasNextInt()) {//ввел "фильтр" для исключения появляения ошибок при вводе не целого числа
                  int longitude = sc.nextInt();//для написания длины



                  System.out.println();
                  int i = longitude + 1;
                  //int x = 1;                           //переменая для задания последовательностив массиве
                  int aray[] = new int[i];

                  for (i = 1; i < aray.length; i++)
//
//            {///////для заполнения массива в последовательности(арифм.прогрессия)//////////////////
//                x += 3;//                                                                     ////
//                aray[i] = x;                                                     ////////////////
//                System.out.print(aray[i] + " \t");                               ////////////////
//            }


                  {
                      aray[i] =-100+ random.nextInt(200);//используем случ.числа
                      System.out.print(aray[i] + " \t ");
                  }


                  System.out.println();
                  System.out.println();

                  System.out.println("Введите число Х.");

                  int number = sc.nextInt();//число Х

                  System.out.println();
                  System.out.println("номер элемента массива: ");
                  boolean search=false;//"перключатель" для поиска -найден или не найден требуемый элемент-значение Х- по умолчанию
                  //не найден
                  for  (i = 1 ; i < aray.length;i++)
                  {
                      if (aray[i] == number) { search=true; break;}//если какой-то элемент массива содержит нужное значение X при поис
                  }                                         // ке то "переключатель поиска" возвращает значение true ("найдено")
                  // и происходит выход из цикла по условию задачи


                  if (search)  System.out.print(i);//здесь ,пользуясь,результатами поиска, выводится инфа о результате поиска
                  else  System.out.print(" NO, то есть нет ") ;
                  System.out.println();}

              else System.out.println("Введенно не целое число");}




          private static void  act4(){//Нужно заполнить значения элементов массива числами последовательности: 4, 7, 10,
              // 13, 16, ,,,и вывести получившийся массив на экран.Не будет считаться верным решение, в котором элементы
              // последовательности просто выводятся на экран, не попадая в массив.



             System.out.println("Решение задачи 4. Заполнение элементов массива в числовой последовательности ");

              Scanner sc = new Scanner(System.in);//Здесь используется считывание с ввода
              System.out.println("Введите длину массива:");

              int i=sc.nextInt();//для написания длины

              int x=1;                           //массива
              int aray[] = new int[i];           //aray

              for ( i = 0 ; i < aray.length; i++ )

              {    x+=3;aray[i]=x;
                  System.out.print(aray[i]+" \t");
              }

              System.out.println();

          }


          private static void act5(){

 System.out.println("Решение задач 5");
 System.out.println("Развернуть массив в обратную сторону (задом наперед).Последний элемент должен находится на \n" +
         "месте начального и наоборот.Не разрешается использовать дополнительный массив.\n" );
 System.out.println();
 System.out.println("Введите длину массива: ");

              Scanner sc  =  new Scanner(System.in);
              Random rand = new Random();
              if (sc.hasNextInt()) {
              int i = sc.nextInt();
              int aray [] = new int[i];

              for (i=0; i<aray.length ; i++)//здесь заполнятся массив случайными числами в диапозоне -10 до 40
              {
                  aray[i]=-10+rand.nextInt(50);
                  System.out.print(aray[i]+" ");

              }
              System.out.println();

              int temp1,temp2,j=0;//вводятся 3 дополнительных переменных: temp1 , temp2 - как "промежуточная ячейка-переменая" для переноса значений с "крайних" элементов массива для "перестановки значений  на крайних элементах массива
              for (i = 0 ; i<aray.length/2 ; i++) {//в условии цикла используется половина длины массива, т.к если менять порядок чисел на обратный крайние значения массива меняются,посередине массив не изменятся

                  j++;
                  temp1= aray[aray.length-j];//начинаем с последнего индекса(номера) массива-считываем с последнего элемента  массива в temp1
                  temp2= aray[i];// считывем с i-го элемента массива,в данном случае нулевого в temp2 когда в цикле i=0 и следущих индексов до середины массива

                  aray[i]    =     temp1;// "переписываем"  в нулевой элемент массива значение temp1 со значением последнего элемента массива(что было в конце массива ставится в начале)
                  aray [aray.length-j]=temp2;// "переписываем" в последний элемент массива значение temp2 со значением нулевого элемента массива (что было в начале массива ставится в конце)

              }

              System.out.println("После реверса :");
              for (int b : aray )
              {System.out.print(b + " ");}
                System.out.println();}
              else System.out.println("Введенно не целое число");


 }
}







