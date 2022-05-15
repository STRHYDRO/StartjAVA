public class IfElseStatementTheme {

    public static void main(String[] args) {
        //Перевод псевдокода на язык Java;
        System.out.println("\nПеревод псевдокода на язык Java"); 
        int age = 32;     
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
        System.out.println("\nПоиск максимального и минимального числа");
        int num1 = 45;
        int num2 = 97;
        if (num1 > num2) {
            System.out.println("При сравнении чисел" + num1 + " и " + num2 + "максимальное число: " + num1);
        } else {
            System.out.println("При сравнении чисел" + num1 + " и " + num2 + "максимальное число: " + num2);
        }
        
        //Работа с числом;   
        System.out.println("\nРабота с числом");
        int scrNum = -80;
        System.out.println(scrNum);
        if (scrNum == 0) {
            System.out.println("Число равно нулю");
        } else { 
            if (scrNum % 2 == 0) {
                System.out.println("Число является четным");
            } else {
                System.out.println("Число является нечетным");
            }
            if (scrNum < 0) {
                System.out.println("Число является отрицательным");
            } else if (scrNum > 0) {
                System.out.println("Число является положительным");
            }
        }

        //Поиск одинаковых цифр в числах;
        System.out.println("\nПоиск одинаковых цифр в числах");
        int srcNum1 = 234;
        int srcNum2 = 539;
        int hundred1 = srcNum1 / 100;
        int tens1 = srcNum1 % 100 / 10;
        int unit1 = srcNum1 % 10;
        int hundred2 = srcNum2 / 100;
        int tens2 = srcNum2 % 100 / 10;
        int unit2 = srcNum2 % 10;
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
        System.out.println("\nОпределение буквы, числа или символа по их коду");
        char symbol = '\u005A';
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
        System.out.println("\nОпределение суммы вклада и начисленных банком %");
        int deposit = 300000;
        double percent = 0;
        if (deposit < 100000) {
            percent = 0.05;
        } else if (deposit < 300000) {
            percent = 0.07;
        } else {
            percent = 0.1;
        }
        double addPercent = deposit * percent;
        System.out.println("Сумма вклада = " + deposit + "\nНачисленный процент = " + addPercent);
        double sum = (deposit + addPercent);
        System.out.println("Сумма с процентами = " + sum);

        //Определение оценки по предметам;
        System.out.println("\nОпределение оценки по предметам");
        int historyRating = 59;
        int progrRating = 91;
        int grageHystory = 0;
        double gradeProgr = 0;
        if (historyRating <= 60) {
            grageHystory = 2;
        } else if (historyRating < 73) {
            grageHystory = 3;
        } else if (historyRating < 91) {
            grageHystory = 4;
        } else if (historyRating >= 91) {
            grageHystory = 5;
        }
        if (progrRating <= 60) {
            gradeProgr = 2;
        } else if (progrRating < 73) {
            gradeProgr = 3;
        } else if (progrRating < 91) {
            gradeProgr = 4;
        } else if (progrRating >= 91) {
            gradeProgr = 5;    
        }
        System.out.println("Оценка по истории = " + grageHystory);
        System.out.println("Оценка по программированию = " + gradeProgr); 
        int subjectMidle = (historyRating + progrRating) / 2;
        double gradeMidle = (gradeProgr + grageHystory) / 2;
        System.out.println("Средний бал по предметам = " + gradeMidle);
        System.out.println("Средний процент по предметам = "+ subjectMidle); 

        //Расчет прибыли;
        System.out.println("\nРасчет прибыли");
        int rent = 5000;
        int income = 15000;
        int price = 9000;
        int profitYear = (income - price - rent) * 12;
        if (profitYear > 0) {
            System.out.println("Прибыль продавца за год = +" + profitYear);
        } else {
            System.out.println("Прибыль продавца за год = " + profitYear);
        }

        //Определение существования треугольника;
        System.out.println("\nОпределение существования треугольника");
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            System.out.println("Треугольник существует.");
            if (!(sideC * sideC == sideA * sideA + sideB * sideB)) {
            System.out.println("Треугольник не прямоугольный, и его площадь нужно считать не через теорему Пифагора");    
        } else {
            int sideLegA = sideA < sideB ? sideA : sideB;
            int sideLegB = sideC < sideLegA ? sideC : sideB;
            int area = (sideLegA * sideLegB) / 2;
            //Значит угол, противолежащий стороне c, является прямым.
            System.out.println("Гипотенуза = " + sideC + " а катеты = " + sideA + " и " + sideB);
            System.out.println("Треугольник прямоугольный и его площадь равна: " + area);
        }    
        System.out.println("|\\");
        System.out.println("| \\");
        System.out.println("|  \\");
        System.out.println("|___\\");
        } else {
            System.out.println("Треугольник не существует.");
        }
        
        //Подсчет количества банкнот;
        System.out.println("\nПодсчет количества банкнот");
        int sum1 = 567;
        int banknote50 = 50;
        int banknote10 = 10;
        int banknote1 = 1;
        int maxB50 = sum1 / banknote50;
        int balanceB50 = sum1 % banknote50;
        int maxB10 = balanceB50 / banknote10;
        int maxB1 = balanceB50 % banknote10;
        int sumReverse = (maxB50 * banknote50) + (maxB10 * banknote10) + (maxB1 * banknote1);
        System.out.println("Количество купюр по 50 = " + maxB50);
        System.out.println("Количество купюр по 10 = " + maxB10);
        System.out.println("Количество купюр по 1 = " + maxB1);
        System.out.println("Исходная сумма = " + sumReverse);
    }
}
 
