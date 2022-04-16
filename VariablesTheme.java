package Main;
public class VariablesTheme {

    //Создание переменных и вывод их значений на консоль;
    public static void main(String[] args) {
     byte core = 4;
     short Hz = 3500;
     int DDR = 16000;
     long model = 3570;
     float Ivy = 4.5f;
     double d = 56.95656566;
     char index = 'k';
     boolean isRealFacts = true;

  	     System.out.println("Количество ядер " + core);
         System.out.println("Частота процессора " + Hz);
         System.out.println("Частота процессора в разгоне " + Ivy);
         System.out.println("Имя процессора " + model + index);
         System.out.println("Объем оперативной памяти " +DDR);
         System.out.println("Сколько дней займет обучение на StartJava? " + d);
   }

   //Расчет стоимости товара со скидкой;
    public class Tovar {
       int x = 100;
       int y = 200;
       int z = (x + y) * 11/100;
       int z1= (x+ y) - z;
        System.out.println("Сумма скидки " + z);
        System.out.println("Общая стоимость товаров со скидкой " + z1);
   }
 } 