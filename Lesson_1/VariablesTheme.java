package Main;
public class VariablesTheme {

    //Создание переменных и вывод их значений на консоль;
    public static void main(String[] args) {
        byte core = 4;
        short hz = 3500;
        int memory = 16000;
        long model = 3570;
        float ivy = 4.5f;
        double day = 56.95656566;
        char index = 'k';
        boolean isRealFacts = true;
            System.out.println("Количество ядер " + core);
            System.out.println("Частота процессора " + hz);
            System.out.println("Частота процессора в разгоне " + ivy);
            System.out.println("Имя процессора " + model + index);
            System.out.println("Объем оперативной памяти " + memory);
            System.out.println("Сколько дней займет обучение на StartJava? " + day);
            System.out.println();

   //Расчет стоимости товара со скидкой;
        int product1 = 100;
        int product2 = 200;
        int persent = (product1 + product2) * 11/100;
        int sale = (product1 + product2) - persent;
            System.out.println("Сумма скидки " + persent);
            System.out.println("Общая стоимость товаров со скидкой " + sale);
            System.out.println();

   //Вывод на консоль слова JAVA;
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  JJ  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println();    

    //Отображение min и max значений числовых типов данных;
        byte number1 = 127;
        short number2 = 32767;
        int number3 = 2147483647;
        long number4 = 9223372036854775807l;
            System.out.println ("byte " + number1);
            System.out.println ("Short " + number2);
            System.out.println ("int " + number3);
            System.out.println ("long " + number4);
        byte numberInkr1 = number1++;
        short numberInkr2 = number2++;
        int numberInkr3 = number3++;
        long numberInkr4 = number4++;
            System.out.println ("byteInkr " + numberInkr1);
            System.out.println ("ShortInkr " + numberInkr2);
            System.out.println ("intInkr " + numberInkr3);
            System.out.println ("longInkr " + numberInkr4);
        byte numberDecr1 = number1--;
        short numberDecr2 = number2--;
        int numberDecr3 = number3--;
        long numberDecr4 = number4--;
            System.out.println ("byteDecr " + numberDecr1);
            System.out.println ("ShortDecr " + numberDecr2);
            System.out.println ("intDecr " + numberDecr3);
            System.out.println ("longDecr " + numberDecr4);
            System.out.println();

    //Перестановка значений переменных;
        int var1 = 5;
        int var2 = 10;
            System.out.println("Переменная №1 " + var1);
            System.out.println("Переменная №2 " + var2);
        int var3 = var1;
        var1 = var2;
        var2 = var3;
            System.out.println("Переменная №1 " + var1);
            System.out.println("Переменная №2 " + var2);
            System.out.println();

    //Вывод символов и их кодов;
        char char1 = 35;
        char char2 = 38;
        char char3 = 64;
        char char4 = 94;
        char char5 = 95;
            System.out.println("Char1 " + char1);
            System.out.println("Char2 " + char2);
            System.out.println("Char3 " + char3);
            System.out.println("Char4 " + char4);
            System.out.println("Char5 " + char5);
            System.out.println();

    //Произведение и сумма цифр числа;
        int num1 = 345;
        int num2 = num1 / 100;
        int num3 = num1 / 10 % 10;
        int num4 = num1 % 100 % 10;
            System.out.println("Произведение цифр числа " + (num2 * num3 * num4));
            System.out.println("Сумма цифр числа " + (num2 + num3 + num4));

    //Вывод на консоль ASCII-арт Дюка;
                char slashL = 47;
        char slashR = 92;
        char space =  95; 
        char bracketL = 40;
        char bracketR = 41;
            System.out.println("    " + slashL + slashR + "    ");
            System.out.println("   " + slashL + "  "+ slashR + "   ");
            System.out.println("  " + slashL + space + bracketL + " "  + bracketR + slashR + "  ");
            System.out.println(" " + slashL + "      " + slashL + " ");
            System.out.println(slashL + "" + space + "" + space + "" + space + space + slashL + slashR + space + space + slashR);
            System.out.println();

    //Отображение количества сотен, десятков и единиц числа;
        int count = 123;
        int hundred = count / 100;
        int tens = count % 100 / 10;
        int unit = count % 100 % 10;
            System.out.println("Деление на 100 отображает сотни, а т.к. int выводит цельночисленные значения, остаток не выводится " + hundred);
            System.out.println("% производит деление с остатком, которое мы делим на десятки " + tens);
            System.out.println("% производит деление с остатком, % вторично оставляет единицы " + unit); 
            System.out.println();

    //Преобразование секунд;
        int time = 86399;
        int hours = time / 3600 ;
        int minutes = time / 60 % 60;
        int seccond = time / 1 % 60;
            System.out.println (hours + ":" + minutes + ":" + seccond);        
    }
 } 


