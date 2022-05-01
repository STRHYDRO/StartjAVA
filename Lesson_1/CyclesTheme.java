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
            for(int j=0; j<5; j++){
                for(int i=1; i<24; i = i + 2){ 
            
                System.out.printf("%2d", i);
    }           
}


        