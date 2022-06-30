package com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        //Подсчет суммы четных и нечетных чисел;
        System.out.println("Подсчет суммы четных и нечетных чисел");
        int numStart = -10;
        int sumOdd = 0;
        int sumEven = 0;
        do {
            if (numStart % 2 == 0) {
                sumOdd += numStart;
            } else {
                 sumEven += numStart;
            }
            numStart++;
        } while (numStart <= 21);
        System.out.println("Сумма четных чисел = " + sumOdd);
        System.out.println("Сумма нечетных чисел = " + sumEven);

        //Вывод чисел между max и min;
        System.out.println("\nВывод чисел между max и min");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int numMin = num1 < num2 ? num1 : num2;
        numMin = num3 < numMin ? num3 : numMin;
        int numMax = num1 > num2 ? num1 : num2;
        numMax = num3 > numMax ? num3 : numMax;
        for (int i = numMax; i >= numMin; i--) {
            if (i == num1 || i == num2 || i == num3) {
                System.out.println(i);
            } 
        }             
        System.out.println("Максимальное число = " + numMax); 
        System.out.println("Минимальное число = " + numMin);  

        //Вывод реверсивного числа и суммы его цифр;
        System.out.println("\nВывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sumDigits = 0;
        int digit = 0;
        System.out.println("Число = " + srcNum);
        System.out.printf("Цифры числа в обратном порядке = ");
        while (srcNum > 0) {
            digit = (srcNum % 10);
            sumDigits += (srcNum % 10);
            srcNum /= 10;
            System.out.print(digit);   
        }
        System.out.println("\nСумма цифр числа = " + sumDigits);

        //Вывод чисел на консоль в несколько строк;
        System.out.println("\nВывод чисел на консоль в несколько строк");
        int counter = 0;
        for (int i = 1; i < 24; i += 2) {
            counter++;
            System.out.printf("%4d", i);
            if (counter == 5) {
            System.out.print("\n"); 
            counter = 0;
            }
        }
        for (int j = counter; j < 5; j++) {
            System.out.printf("%4d", 0);
        }
        System.out.print("\n");

        //Проверка количества единиц на четность;
        System.out.println("\nПроверка количества единиц на четность");
        srcNum = 3141591;
        int countOnes = 0;
        digit = 0; 
        while (srcNum > 0) {
            digit = (srcNum % 10);
            srcNum /= 10;
        if (digit == 1) {  
            countOnes++;
            }
        }
        System.out.print("Количество единиц = " + countOnes);
        if (countOnes % 2 != 0) {
            System.out.println("\nКоличество единиц в числе является нечетным");
        } else {
            System.out.println("Количество единиц в числе является четным");
        }

        //Отображение фигур в консоли;
        System.out.println("\nОтображение фигур в консоли");
        //Прямоугольник через цикл for;
        System.out.println("Прямоугольник через цикл for");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");  
            }
            System.out.print("\n");
        }
        //Прямоугольный треугольник через цикл while;
        System.out.println("\nПрямоугольный треугольник через цикл while");
        int i = 5; 
        int j = 0; 
        while (i > 0) { 
            j = 0; 
            while (j < i) { 
                System.out.print ('#');  
                j++; 
            } 
            System.out.print("\n"); 
            i--; 
        }
        //Для второго треугольника только do-while;
        System.out.println("\nДля второго треугольника только do-while");
        int leg1 = 1;
        do {
            int legA = 0;
            do {
                System.out.print('$');
                legA++;
            } while (legA < leg1);
            leg1++;
            System.out.println();
        } while (leg1 <= 2);
        int leg2 = 1;
        do {
            int legB = 4;
            do {
                legB--;
                System.out.print('$');
            } while (legB > leg2);
            leg2++;
            System.out.print("\n");
        } while (leg2 <= 3);
    
        //Проверка, является ли число палиндромом;
        System.out.println("\nПроверка, является ли число палиндромом");
        srcNum = 1234321; 
        int computation = srcNum;
        digit = 0;
        int palindrome = 0;
        while (computation != 0) {
            digit = computation % 10;
            palindrome = (palindrome * 10) + digit;
            computation /= 10;   
        }
        System.out.println("Начальное число = " + srcNum);
        System.out.println("Перевернутое число = " + palindrome);
        if (srcNum == palindrome) {
            System.out.println("Число является палиндромом");
        } else {
            System.out.println("Число не является палиндромом");   
        }
    
        //Отображение ASCII-символов;
        System.out.println("\nОтображение ASCII-символов");
        char symbol = ' ';
        System.out.println("Символы, идущие до цифр и имеющие нечетные коды");
        System.out.println("Dec  Char");
        for (i = 33; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%03d %3c%n", i, symbol = (char) i);
            }
        }
        System.out.println("\nМаленькие английские буквы, имеющие четные коды");
        System.out.println("Dec  Char");
        for (i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%03d %3c%n", i, symbol = (char) i);
            }
        }
    
        System.out.println("\nОпределение, является ли число счастливым");
        srcNum = 435568;
        digit = 0;
        int sumNumLeft = 0;
        int sumNumRight = 0;
        int compilation = 0;
        System.out.println("Заданное число = " + srcNum);
        while (srcNum > 0) {
            compilation = srcNum % 10;
            srcNum /= 10;
            digit++;
            if (digit > 3) {
            sumNumLeft += compilation;
            } if (digit < 3) {
                sumNumRight += compilation;   
            }
        }
        System.out.println ("Сумма первых трех чисел = " + sumNumLeft);
        System.out.println ("Сумма вторых трех чисел = " + sumNumRight);
        if (sumNumLeft != sumNumRight) {
            System.out.println("Число не является счастливым");
        } else {
            System.out.println("Число является счастливым");
        }

        //Вывод таблицы умножения Пифагора;
        System.out.println("\n   Вывод таблицы умножения Пифагора\n");
        i = 0;
        j = 0;
        System.out.printf("    |");
        for (i=2; i<10; i++) {
            System.out.printf("%3d ", i);
        }
        System.out.printf("\n----|----------------");
        System.out.printf("----------------\n");
        for (i=2; i<10; i++) {
            System.out.printf("%3d |", i);
            for (j=2; j<10; j++) {
                System.out.printf("%3d ", i*j);
            } 
            System.out.print("\n");
        }   
    }
}


        