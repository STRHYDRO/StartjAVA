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
            int numAside = (num % 10);
            sum += (num % 10);
            num /= 10;
            System.out.printf("%2d", numAside);   
        }
        System.out.println("\nСумма цифр числа = " + sum);

    //Вывод чисел на консоль в несколько строк;
    System.out.println("Вывод чисел на консоль в несколько строк");
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
    System.out.println("Проверка количества единиц на четность");
        int num = 3141591;
        int sum = 0; 
        while (num > 0) {
            int numAside = (num % 10);
            num /= 10;
            if (numAside == 1) {  
            sum += numAside;
            }
        }
        System.out.print("Количество едениц = " + sum);
         if (sum % 2 != 0) {
            System.out.println("\nКоличество единиц в числе является нечетным");
        } else {
            System.out.println("Количество единиц в числе является четным");
        }

    //Отображение фигур в консоли;
    System.out.println("Отображение фигур в консоли");
    //для прямоугольника только for;
        for (int i = 0; i <= 5; i++){
            for(int j = 0; j <= 10; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    //для прямоугольного треугольника только while;    


    //Вывод таблицы умножения Пифагора;
    System.out.println("   Вывод таблицы умножения Пифагора\n");
    int i = 0;
    int j = 0;
    System.out.printf("    |");
    for(i=2; i<10; i++) {
        System.out.printf("%3d ", i);
        }
    System.out.printf("\n----|----------------");
    System.out.printf("----------------\n");
    for(i=2; i<10; i++) {
        System.out.printf("%3d |", i);
        for(j=2; j<10; j++) {
            System.out.printf("%3d ", i*j);
            } 
            System.out.println();
                
    }           
}


        