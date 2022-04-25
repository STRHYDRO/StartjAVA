public class IfElseStatementTheme {

    public static void main(String[] args) {
        //Перевод псевдокода на язык Java;
        int height = 184;
        System.out.println("Перевод псевдокода на язык Java");
        int age = 32;      
        if (age > 20) {
            System.out.println("Уже не подросток");
        } else {
            System.out.println("Подросток");
        } 

        if (male == 'm') {
            System.out.println("Мужчина");
        } else {
            System.out.println("Женщина");
        }

        if (height < 180) {
            System.out.println("Средний рост");
        } else {
            System.out.println("Высокий рост");  
        } 
        char male = 'm';
        char firstSymbolName = "Евгений".charAt(0);
        if (firstSymbolName == 'М') {
            System.out.println("Вероятнее всего вы Максим");
        } else if (firstSymbolName == 'I') {
            System.out.println("Вероятнее всего вы Игорь");
        } else {
            System.out.println("\nВы однозначно не Максим и не Игорь");
        }
        
        //Поиск максимального и минимального числа;
        int num1 = 45;
        int num2 = 97;
        System.out.println("Поиск максимального и минимального числа");
        if (num1 > num2) {
            System.out.println("При сравнении чисел 45 и 97 максимальное число: " + num1);
        } else {
            System.out.println("\nПри сравнении чисел 45 и 97 максимальное число: " + num2);
        }
        
        //Работа с числом;   
        int scrNum = -745;
        System.out.println("Работа с числом");
        if (scrNum != 0) {
            System.out.println("Число не равно нулю");
        }    
        if (scrNum % 2 == 0) {
            System.out.println("Число является четным");
        } else {
            System.out.println("Число является нечетным");
        } 
        if (scrNum < 0) {
            System.out.println("Число является отрицательным");
        } else if (scrNum > 0) {
            System.out.println("Число является положительным");
        } else {
            System.out.println("\nЧисло равно нулю"); 
        }
         
        //Поиск одинаковых цифр в числах;
        int srcNum1 = 234;
        int srcNum2 = 539;
        int hundred1 = srcNum1 / 100;
        int tens1 = srcNum1 % 100 / 10;
        int unit1 = srcNum1 % 10;
        int hundred2 = srcNum2 / 100;
        int tens2 = srcNum2 % 100 / 10;
        int unit2 = srcNum2 % 10;
        System.out.println("Поиск одинаковых цифр в числах");
        if (hundred1 == hundred2) {
            System.out.println("Числа в первом разряде равны друг другу: " + hundred1);
        }
        if (tens1 == tens2) {  
            System.out.println("Числа во втором разряде равны друг другу: " + tens1);
        } 
        if (unit1 == unit2) {
            System.out.println("\nЧисла в третьем разряде равны друг другу: " + unit1);
        }
        
        //Определение буквы, числа или символа по их коду;
        char symbol = '\u005A';
        System.out.println("Определение буквы, числа или символа по их коду");
        System.out.println(symbol);
        if ((symbol >= 'A') && (symbol <= 'Z')) {
            System.out.println("Это заглавная буква");
        } else if ((symbol >= 'a') && (symbol <= 'z')) {
            System.out.println("Это строчная буква");
        } else if ((symbol >= '0') && (symbol <= '1')) {
            System.out.println("Это цифра");
        } else {
            System.out.println("\nЭто не буква и не число");
        }

        //Определение суммы вклада и начисленных банком %;
        int deposit = 300000;
        System.out.println("Определение суммы вклада и начисленных банком %");
        float procent = 1f;
        if (deposit < 100000) {
            System.out.println("Сумма вклада = " + deposit + " Начисленный процент = " + (procent = 0.05f) + " Сумма с процентами = " + ((deposit )+(procent = 0.05f));
        } else if (deposit < 300000) {
            float sum7 = procent7 + deposit;
            System.out.println("Сумма вклада = " + deposit + " Начисленный процент = " + (procent = 0.07f) + " Сумма с процентами = " + ((deposit )+(procent = 0.07f));
        } else {
            float sum10 = procent10 + deposit; 
            System.out.println("\nСумма вклада = " + deposit + " Начисленный процент = " + (procent = 0.10f) + " Сумма с процентами = " + ((deposit )+(procent = 0.10f));
        }

        //Определение оценки по предметам;
        int history = 59;
        int progr = 91;
        int grageHystory = 0;
        float gradeProgr = 1f;
        System.out.println("Определение оценки по предметам");
        if (history <= 60) {
            System.out.println("Оценка по истории = " + (grageHystory = 2));
        } else if (history < 73) {
            System.out.println("Оценка по истории = " + (grageHystory = 3));
        } else if (history < 91) {
            System.out.println("Оценка по истории = " + (grageHystory = 4));
        } else if (history >= 91) {
            System.out.println("Оценка по истории = " + (grageHystory = 5));
        }
        if (progr <= 60) {
            System.out.println("Оценка по программированию = " + (gradeProgr = 2));
        } else if (progr < 73) {
            System.out.println("Оценка по программированию = " + (gradeProgr = 3));
        } else if (progr < 91) {
            System.out.println("Оценка по программированию = " + (gradeProgr = 4));
        } else if (progr >= 91) { 
            System.out.println("Оценка по программированию = " + (gradeProgr = 5));
        } 
        int subjectMidle = (history + progr) / 2;
        float gradeMidle = (gradeProgr + grageHystory) / 2;
        System.out.println("Средний бал по предметам = " + gradeMidle);
        System.out.println("\nСредний процент по предметам = "+ subjectMidle); 

        //Расчет прибыли;
        int rent = 5000;
        int income = 15000;
        int price = 9000;
        int profitYear = (income - price - rent) * 12;
        System.out.println("Расчет прибыли");
        if (profitYear > 0) {
            System.out.println("Прибыль продавца за год = " + "+" + profitYear);
        } else {
            System.out.println("\nПрибыль продавца за год = " + profitYear);
        }

        //Определение существования треугольника;
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        int sideLegA = sideA < sideB ? sideA : sideB;
        int sideLegB = sideC < sideLegA ? sideC : sideB;
        System.out.println("Определение существования треугольника");
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
        if (sideLegA == sideA && sideLegB == sideB ) {
            System.out.println("Катеты sideA и sideB, а гипотенуза sideC");
        } 
        if (sideLegA == sideA && sideLegB == sideC) {
            System.out.println("Катеты sideA и sideС, а гипотенуза sideB");
        } 
        if (sideLegA == sideB && sideLegB == sideC) {
            System.out.println("Катеты sideB и sideC, а гипотенуза sideA");
        } 
        if (sideC * sideC == sideA * sideA + sideB * sideB) {
            int Area = (sideLegA * sideLegB) / 2;
            System.out.println("Треугольник прямоугольный и его площадь равна: " + Area);
        }
        char slash = '\\';
        char slashForward ='|';
        char space =' ';
        char underscore = '_';

        //Подсчет количества банкнот;
        int sum = 567;
        int banknote50 = 50;
        int banknote10 = 10;
        int banknote1 = 1;
        int maxB50 = sum / banknote50;
        int balanceB50 = sum % banknote50;
        int maxB10 = balanceB50 / banknote10;
        int maxB1 = balanceB50 % banknote10;
        int sumReverse = (maxB50 * banknote50) + (maxB10 * banknote10) + (maxB1 * banknote1);
        System.out.println("Подсчет количества банкнот");
        System.out.println("Количество купюр по 50 = " + maxB50);
        System.out.println("Количество купюр по 10 = " + maxB10);
        System.out.println("Количество купюр по 1 = " + maxB1);
        System.out.println("\nИсходная сумма = " + sumReverse);
    }
}
 
