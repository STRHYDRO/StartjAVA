public class CyclesTheme {

    public static void main(String[] args) {
        //Подсчет суммы четных и нечетных чисел;
        System.out.println("\nПодсчет суммы четных и нечетных чисел");
        int numStart = -10;
        int sumPositive = 0;
        int sumNegative = 0;
        do {
            if (numStart % 2 == 0) {
                sumPositive = sumPositive + numStart;
            } else {
                sumNegative = sumNegative + numStart;
            }
            numStart++;
        } while (numStart <= 21);
            System.out.println("Сумма четных чисел = " + sumPositive);
            System.out.println("Сумма нечетных чисел = " + sumNegative);
    
        //Вывод чисел между max и min;
        System.out.println("\nВывод чисел между max и min");
        int value1 = 10;
        int value2 = 5;
        int value3 = -1;
        int valueMin = value1 < value2 ? value1 : value2;
        valueMin = value3 < valueMin ? value3 : valueMin;
        int valueMax = value1 > value2 ? value1 : value2;
        valueMax = value3 > valueMax ? value3 : valueMax;
        for (int i = valueMax; i >= valueMin; i--) {
            if (i == value1 || i == value2 || i == value3) {
                System.out.println(i);
            } 
        }             
        System.out.println("Максимальное число = " + valueMax); 
        System.out.println("Минимальное число = " + valueMin);  

        //Вывод реверсивного числа и суммы его цифр;
        System.out.println("\nВывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        System.out.println("Число = " + num);
        System.out.printf("Цифры числа в обратном порядке = ");
        while (num > 0) {
            int numAside = num % 10;
            num /= 10;
            sum += numAside;
            System.out.printf("%2d", numAside);   
        }
        System.out.println("\nСумма цифр числа = " + sum);
    
        //Вывод чисел на консоль в несколько строк;
        System.out.println("\nВывод чисел на консоль в несколько строк");
        int numFive = 0;
        for(int i = 1; i < 24; i += 2) {
            numFive++;
            System.out.printf("%4d", i);
            if (numFive == 5) {
                System.out.println(); 
                numFive = 0;
            }
        }
        for (int j = numFive; j < 5; j++) {
            System.out.printf("%4d", 0);
        }
        System.out.println();
    
        //Проверка количества единиц на четность;
        System.out.println("\nПроверка количества единиц на четность");
        int numEven = 3141591;
        int sumEven = 0; 
        while (numEven > 0) {
            int numAside = (numEven % 10);
            numEven /= 10;
                if (numAside == 1) {  
                sumEven += numAside;
            }
        }
        System.out.print("Количество едениц = " + sum);
        if (sum % 2 != 0) {
            System.out.println("\nКоличество единиц в числе является нечетным");
        } else {
            System.out.println("\nКоличество единиц в числе является четным");
        }
    
        //Отображение фигур в консоли;
        System.out.println("\nОтображение фигур в консоли");
        //Прямоугольник через цикл for;
        System.out.println("Прямоугольник через цикл for");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");  
            }
                System.out.println();
        }
        //Прямугольный треугольник через цикл while;
        System.out.println("\nПрямугольный треугольник через цикл while");
        int i = 5; 
        int j = 0; 
        while (i > 0) { 
            j = 0; 
            while (j < i) { 
                System.out.print ('#');  
                j++; 
            } 
            System.out.println (); 
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
            System.out.println();
        } while (leg2 <= 3);
    
        //Проверка, является ли число палиндромом;
        System.out.println("\nПроверка, является ли число палиндромом");
        int numRandom = 1234321; 
        int numCalc = numRandom;
        int numAside = 0;
        int palindrome = 0;
        while( numCalc != 0 ) {
            numAside = numCalc % 10;
            palindrome = (palindrome * 10) + numAside;
            numCalc /= 10;   
        }
        System.out.println("Начальное число = " + numRandom);
        System.out.println("Перевернутое число = " + palindrome);
        if (numRandom == palindrome) {
             System.out.println("Число является палиндромом");
            } else {
             System.out.println("Число не является палиндромом");   
        }
    
        //Отображение ASCII-символов;
        System.out.println("\nОтображение ASCII-символов");
        char symbol = ' ';
        System.out.println("Cимволы, идущие до цифр и имеющие нечетные коды");
        System.out.println("Dec  Char");
        for (int x = 33; x < 48; x++) {
            if (x % 2 != 0) {
                symbol = (char) x;
                System.out.printf("%03d %3c%n", x, symbol);
            }
        }
        System.out.println("\nМаленькие английские буквы, имеющие четные коды");
        System.out.println("Dec  Char");
        for (int y = 97; y < 123; y++) {
            if (y % 2 == 0) {
                symbol = (char) y;
                System.out.printf("%03d %3c%n", y, symbol);
            }
        }
    
        //Определение, является ли число счастливым;
        System.out.println("\nОпределение, является ли число счастливым");
        int numLucky = 435568;
        int numScorer = 0;
        int sumAsideA = 0;
        int sumAsideB = 0;
        System.out.println("Заданное число = " + numLucky);
        while(numLucky > 0) {
            int numApart = numLucky % 10;
            numLucky /= 10;
            numScorer++;
                if (numScorer > 3) {
                sumAsideA += numAside;
                    } if (numScorer < 3) {
                    sumAsideB += numApart;   
                    }
        }
        System.out.println ("Сумма первых трех чисел = " + sumAsideA);
        System.out.println ("Сумма вторых трех чисел = " + sumAsideB);
        if (sumAsideA != sumAsideB) {
            System.out.println("Число не является счастливым");
            } else {
            System.out.println("Число является счастливым");
        }
    
        //Вывод таблицы умножения Пифагора;
        System.out.println("\n  Вывод таблицы умножения Пифагора\n");
        int a = 0;
        int b = 0;
        System.out.printf("    |");
        for(a = 2; a < 10; a++) {
            System.out.printf("%3d ", a);
        }
        System.out.printf("\n----|----------------");
        System.out.printf("----------------\n");
        for(a = 2; a < 10; a++) {
            System.out.printf("%3d |", a);
            for(b = 2; b < 10; b++) {
                System.out.printf("%3d ", a * b);
            } 
            System.out.println();
        }

    }
}

 
    

        