public class VariablesTheme {

    public static void main(String[] args) {
        //Создание переменных и вывод их значений на консоль;
        byte core = 4;
        short hz = 3500;
        int memory = 16000;
        long model = 3570;
        float processor = 4.5f;
        double day = 56.95656566;
        char index = 'k';
        boolean isRealFacts = true;
        System.out.println("\nСоздание переменных и вывод их значений на консоль");
        System.out.println("Количество ядер " + core);
        System.out.println("Частота процессора " + hz);
        System.out.println("Частота процессора в разгоне " + processor);
        System.out.println("Имя процессора " + model + index);
        System.out.println("Объем оперативной памяти " + memory);
        System.out.println("Сколько дней займет обучение на StartJava? " + day);

        //Расчет стоимости товара со скидкой;
        int costGoodsX = 100;
        int costGoodsY = 200;
        int persent = (costGoodsX + costGoodsY) * 11 / 100;
        int discont = (costGoodsX + costGoodsY) - persent;
        System.out.println("\nРасчет стоимости товара со скидкой");
        System.out.println("Сумма скидки " + persent);
        System.out.println("Общая стоимость товаров со скидкой " + discont);

        //Вывод на консоль слова JAVA;
        System.out.println("\nВывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("   J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");    

        //Отображение min и max значений числовых типов данных;
        byte number1 = 127;
        short number2 = 32767;
        int number3 = 2147483647;
        long number4 = 9223372036854775807l;
        System.out.println("\nОтображение min и max значений числовых типов данных");
        System.out.println("byte " + number1);
        System.out.println("Short " + number2);
        System.out.println("int " + number3);
        System.out.println("long " + number4);
        byte numberInkr1 = number1++;
        short numberInkr2 = number2++;
        int numberInkr3 = number3++;
        long numberInkr4 = number4++;
        System.out.println("byteInkr " + numberInkr1);
        System.out.println("ShortInkr " + numberInkr2);
        System.out.println("intInkr " + numberInkr3);
        System.out.println("longInkr " + numberInkr4);
        byte numberDecr1 = number1--;
        short numberDecr2 = number2--;
        int numberDecr3 = number3--;
        long numberDecr4 = number4--;
        System.out.println("byteDecr " + numberDecr1);
        System.out.println("ShortDecr " + numberDecr2);
        System.out.println("intDecr " + numberDecr3);
        System.out.println("longDecr " + numberDecr4);

        //Перестановка значений переменных;
        int num1 = 5;
        int num2 = 10;
        System.out.println("\nПерестановка значений переменных");
        System.out.println("Переменная №1 " + num1);
        System.out.println("Переменная №2 " + num2);
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Переменная №1 " + num1);
        System.out.println("Переменная №2 " + num2);

        //Вывод символов и их кодов;
        char codeChar1 = 35;
        char codeChar2 = 38;
        char codeChar3 = 64;
        char codeChar4 = 94;
        char codeChar5 = 95;
        System.out.println("\nВывод символов и их кодов");
        System.out.println("codeChar1 = " + codeChar1);
        System.out.println("codeChar2 = " + codeChar2);
        System.out.println("codeChar3 = " + codeChar3);
        System.out.println("codeChar4 = " + codeChar4);
        System.out.println("codeChar5 = " + codeChar5);

        //Произведение и сумма цифр числа;
        int srcNum1 = 345;
        int numb2 = srcNum1 / 100;
        int numb3 = srcNum1 / 10 % 10;
        int numb4 = srcNum1 % 10;
        System.out.println("\nПроизведение и сумма цифр числа");
        System.out.println("Произведение цифр числа " + (numb2 * numb3 * srcNum1));
        System.out.println("Сумма цифр числа " + (numb2 + numb3 + numb4));

        //Вывод на консоль ASCII-арт Дюка;
        char slash = '/';
        char backslash = '\\';
        char space =  ' '; 
        char bracketL = '(';
        char bracketR = ')';
        char underscore = '_';
        System.out.println("\nВывод на консоль ASCII-арт Дюка");
        System.out.println("" + space + space + space + space + slash + backslash + space + space + space + space);
        System.out.println("" + space + space + space + slash + space + space + backslash + space + space + space);
        System.out.println("" + space + space + slash + underscore + bracketL + space + bracketR + backslash + space + space);
        System.out.println("" + space + slash + space + space + space + space + space + space + backslash + space);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash);

        //Отображение количества сотен, десятков и единиц числа;
        int srcNum2 = 123;
        int hundred = srcNum2 / 100;
        int tens = srcNum2 % 100 / 10;
        int unit = srcNum2 % 10;
        System.out.println("\nОтображение количества сотен, десятков и единиц числа");
        System.out.println("Количество сотен " + hundred);
        System.out.println("Количество десятков " + tens);
        System.out.println("Количество едениц " + unit); 

        //Преобразование секунд;
        int time = 86399;
        int hours = time / 3600 ;
        int minutes = time / 60 % 60;
        int seconds = time % 60;
        System.out.println("\nПреобразование секунд");
        System.out.println (hours + ":" + minutes + ":" + seconds);        
    }
 } 


