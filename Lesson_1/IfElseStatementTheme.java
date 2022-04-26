public class IfElseStatementTheme {

    public static void main(String[] args) {
        //Перевод псевдокода на язык Java;
        int age = 32; 
        System.out.println("\nПеревод псевдокода на язык Java");     
        if (age > 20) {
            System.out.println("Уже не подросток");
        } else {
            System.out.println("Подросток");
        } 
        char male = 'm';
        if (male == 'm') {
            System.out.println("Мужчина");
        } else {
            System.out.println("Женщина");
        }
        int height = 184;
        if (height < 180) {
            System.out.println("Средний рост");
        } else {
            System.out.println("Высокий рост");  
        } 
        char firstSymbolName = "Евгений".charAt(0);
        if (firstSymbolName == 'М') {
            System.out.println("Вероятнее всего вы Максим");
        } else if (firstSymbolName == 'I') {
            System.out.println("Вероятнее всего вы Игорь");
        } else {
            System.out.println("Вы однозначно не Максим и не Игорь");
        }
        
        //Поиск максимального и минимального числа;
        int num1 = 45;
        int num2 = 97;
        System.out.println("\nПоиск максимального и минимального числа");
        if (num1 > num2) {
            System.out.println("При сравнении чисел 45 и 97 максимальное число: " + num1);
        } else {
            System.out.println("При сравнении чисел 45 и 97 максимальное число: " + num2);
        }
        
        //Работа с числом;   
        int scrNum = -80;
        System.out.println("\nРабота с числом");
        System.out.println(scrNum);
        if (scrNum == 0) {
            System.out.println("Число равно нулю");
        } else if (scrNum % 2 == 0) {
            System.out.println("Число является четным");
        } else {
             System.out.println("Число является нечетным");
        } if (scrNum < 0) {
            System.out.println("Число является отрицательным");
        } else if (scrNum > 0) {
            System.out.println("Число является положительным");
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
        System.out.println("\nПоиск одинаковых цифр в числах");
        if (hundred1 == hundred2) {
            System.out.println("Числа в первом разряде равны друг другу: " + hundred1);
        }
        if (tens1 == tens2) {  
            System.out.println("Числа во втором разряде равны друг другу: " + tens1);
        } 
        if (unit1 == unit2) {
            System.out.println("Числа в третьем разряде равны друг другу: " + unit1);
        }
        
        //Определение буквы, числа или символа по их коду;
        char symbol = '\u005A';
        System.out.println("\nОпределение буквы, числа или символа по их коду");
        System.out.println("Символ = "+ symbol);
        if ((symbol >= 'A') && (symbol <= 'Z')) {
            System.out.println("Это заглавная буква");
        } else if ((symbol >= 'a') && (symbol <= 'z')) {
            System.out.println("Это строчная буква");
        } else if ((symbol >= '0') && (symbol <= '1')) {
            System.out.println("Это цифра");
        } else {
            System.out.println("Это не буква и не число");
        }

        //Определение суммы вклада и начисленных банком %;
        int deposit = 300000;
        double procent =1;
        System.out.println("\nОпределение суммы вклада и начисленных банком %");
        if (deposit < 100000) {
            System.out.println("Сумма вклада = " + deposit + "\nНачисленный процент = " + (procent = deposit * 0.5));
        } else if (deposit < 300000) {
            System.out.println("Сумма вклада = " + deposit + "\nНачисленный процент = " + (procent = deposit * 0.7));
        } else {
            System.out.println("Сумма вклада = " + deposit + "\nНачисленный процент = " + (procent = deposit * 0.1));
        }
        double summ = (deposit + procent);
        System.out.println("Сумма с процентами = " + summ);

        //Определение оценки по предметам;
        int history = 59;
        int progr = 91;
        int grageHystory = 0;
        double gradeProgr = 1;
        System.out.println("\nОпределение оценки по предметам");
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
        double gradeMidle = (gradeProgr + grageHystory) / 2;
        System.out.println("Средний бал по предметам = " + gradeMidle);
        System.out.println("Средний процент по предметам = "+ subjectMidle); 

        //Расчет прибыли;
        int rent = 5000;
        int income = 15000;
        int price = 9000;
        int profitYear = (income - price - rent) * 12;
        System.out.println("\nРасчет прибыли");
        if (profitYear > 0) {
            System.out.println("Прибыль продавца за год = " + "+" + profitYear);
        } else {
            System.out.println("Прибыль продавца за год = " + profitYear);
        }

        //Определение существования треугольника;
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        int legA = 0;
        int legB = 0;
        int hypothesis = 0;
        int sideLegA = sideA < sideB ? sideA : sideB;
        int sideLegB = sideC < sideLegA ? sideC : sideB;
        System.out.println("\nОпределение существования треугольника");
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
        if (sideLegA == sideA && sideLegB == sideB ) {
            System.out.println("Катеты = " + (legA = sideA) + " и " + (legB = sideB) +", а гипотенуза " + (hypothesis = sideC));
        } 
        if (sideLegA == sideB && sideLegB == sideC) {
            System.out.println("Катеты = " + (legA = sideB) + " и " + (legB = sideC) +", а гипотенуза " + (hypothesis = sideA));
        } 
        if (sideLegA == sideC && sideLegB == sideA) {
            System.out.println("Катеты = " + (legA = sideC) + " и " + (legB = sideA) +", а гипотенуза " + (hypothesis = sideB));
        }    
        if (sideLegA == sideA && sideLegB == sideC) {
            System.out.println("Катеты = " + (legA = sideA) + " и " + (legB = sideC) +", а гипотенуза " + (hypothesis = sideB));
        }
        if (sideLegA == sideC && sideLegB == sideB) {
            System.out.println("Катеты = " + (legA = sideC) + " и " + (legB = sideB) +", а гипотенуза " + (hypothesis = sideA));
        }
        if (sideLegA == sideB && sideLegB == sideA) {
            System.out.println("Катеты = " + (legA = sideB) + " и " + (legB = sideA) +", а гипотенуза " + (hypothesis = sideC));
        } 
        int Area = (legA * legB) / 2;
        if (sideC * sideC == sideA * sideA + sideB * sideB) {
            System.out.println("Треугольник прямоугольный и его площадь равна: " + Area);
        }
        System.out.printf("\n%1c%1c%n%1c%2c%n%1c%3c%n%1c%1c%1c%1c%1c\n", '|', '\\', '|', '\\', '|', '\\', '|', '_', '_', '_', '\\');
        
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
        System.out.println("\nПодсчет количества банкнот");
        System.out.println("Количество купюр по 50 = " + maxB50);
        System.out.println("Количество купюр по 10 = " + maxB10);
        System.out.println("Количество купюр по 1 = " + maxB1);
        System.out.println("Исходная сумма = " + sumReverse);
    }
}
 
