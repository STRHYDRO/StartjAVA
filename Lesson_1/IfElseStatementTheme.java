public class IfElseStatementTheme {

    public static void main(String[] args) {
        //Перевод псевдокода на язык Java;
        int height = 184;
        System.out.println("\nПеревод псевдокода на язык Java");
        int age = 32;
        char male = 'm';
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
        int scrNum = -745;
        System.out.println("\nРабота с числом");
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
            System.out.println("Число равно нулю"); 
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
        System.out.println(symbol);
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
        System.out.println("\nОпределение суммы вклада и начисленных банком %");
        if (deposit < 100000) {
            float procent5 = deposit * 0.05f;
            float sum5 = procent5 + deposit;
            System.out.println("Сумма вклада = " + deposit + " Начисленный процент = " + procent5 + " Сумма с процентами = " + sum5);
        } else if (deposit < 300000) {
            float procent7 = deposit * 0.07f;
            float sum7 = procent7 + deposit;
            System.out.println("Сумма вклада = " + deposit + " Начисленный процент = " + procent7 + " Сумма с процентами = " + sum7);
        } else {
            float procent10 = deposit * 0.01f;
            float sum10 = procent10 + deposit; 
            System.out.println("Сумма вклада = " + deposit + " Начисленный процент = " + procent10 + " Сумма с процентами = " + sum10);
        }

        //Определение оценки по предметам;
        int history = 59;
        int progr = 91;
        int grageHystory = 0;
        float gradeProgr = 0f;
        int subjectMidle = (history + progr) / 2;
        System.out.println("\nОпределение оценки по предметам");
        if (history <= 60) {
            System.out.println("Оценка по истории = 2");
            grageHystory = 2;
        } else if (history < 73) {
            System.out.println("Оценка по истории = 3");
            grageHystory = 3;
        } else if (history < 91) {
            System.out.println("Оценка по истории = 4");
            grageHystory = 4;
        } else if (history >= 91) {
            System.out.println("Оценка по истории = 5");
            grageHystory = 5;
        }
        if (progr <= 60) {
            System.out.println("Оценка по програмированию = 2");
            gradeProgr = 2;
        } else if (progr < 73) {
            System.out.println("Оценка по програмированию = 3");
             gradeProgr = 3;
        } else if (progr < 91) {
            System.out.println("Оценка по програмированию = 4");
             gradeProgr = 4;
        } else if (progr >= 91) { 
            System.out.println("Оценка по програмированию = 5");
             gradeProgr = 5;
        } 
        float gradeMidle = (gradeProgr + grageHystory) / 2;
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
            System.out.println("Прибыль продавца за год = " + "-" + profitYear);
        }

        //Определение существования треугольника;
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        int sideLegA = sideA < sideB ? sideA : sideB;
        int sideLegB = sideC < sideLegA ? sideC : sideB;
        char slash = '\\';
        char slashForward ='|';
        char space =' ';
        char underscore = '_';
        //char result1 = s.charAt();
        System.out.println("\nОпределение существования треугольника");
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
        String under = new String(new char[sideLegB]).replace('\0', underscore);
            System.out.println("" + slashForward + slash);
            System.out.println(slashForward + under + slash);
            //System.out.println();

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
 
