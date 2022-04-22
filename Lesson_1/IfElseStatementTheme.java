import java.util.Scanner;
public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java;
        int growth = 184;
        System.out.println("Перевод псевдокода на язык Java");
        System.out.println("Введите возраст от 1 года до 120 лет: ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age > 20) {
            System.out.println("Уже не подросток");
        } else {
            System.out.println("Подросток");
        } if (!Male) {
            System.out.println("Женщина");
        } if (growth < 180) {
            System.out.println("Средний рост");
        } else {
            System.out.println("Высокий рост");
        firstSymbolName = "Евгений".charAt (0);  
        } if (firstSymbolName == 'М') {
                System.out.ptintln("Вероятнее всего вы Максим");
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
        int compNum = -745;
        System.out.println("Работа с числом");
        if (compNum % 2 == 0) {
            System.out.println("Число является четным");
        } else {
            System.out.println("Число является нечетным");
        } if (compNum < 0) {
            System.out.println("Число является отрицательным");
        } else if (compNum > 0) {
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
            System.out.println("Числа в первом разраде равны друг другу: " + hundred1);
        } if (tens1 == tens2) {  
            System.out.println("Числа во втором разраде равны друг другу: " + tens1);
        } if (unit1 == unit2) {
            System.out.println("\nЧисла в третьем разраде равны друг другу: " + unit1);
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

        //Определение суммы вклада и начисленных банком %;
        int deposit = 300000;
        System.out.println("Определение суммы вклада и начисленных банком %");
        if (deposit < 100000) {
            System.out.println("Сумма вклада = " + deposit + " Начисленный процент = " + (deposit * 0.05) + " Сумма с процентами = " + ((deposit) + (deposit * 0.05)));
        } else if (deposit < 300000) {
            System.out.println("Сумма вклада = " + deposit + " Начисленный процент = " + (deposit * 0.07) + " Сумма с процентами = " + ((deposit) + (deposit * 0.07)));
        } else { 
            System.out.println("\nСумма вклада = " + deposit + " Начисленный процент = " + (deposit * 0.1) + " Сумма с процентами = " + ((deposit) + (deposit * 0.1)));
        }

        //Определение оценки по предметам;
        // int gradeHistory = 59;
        // //int gradeProgr = 91;
        // System.out.println("Определение оценки по предметам");
        // if (gradeHistory <= 60) {
        //     int gradeHistory1 = 2;
        // } else if (gradeHistory > 60) {
        //     int gradeHistory1 = 3;
        // } else if (gradeHistory > 73) {
        //     int gradeHistory1 = 4;
        // } else if (gradeHistory > 91) {
        //     int gradeHistory1 = 5;
        //     System.out.println("\nОценка = " + gradeHistory1);
        // }

        //Расчет прибыли;
        int rent = 5000;
        int income = 15000;
        int price = 9000;
        int profitYear = (income - price - rent) * 12;
        System.out.println("Расчет прибыли");
        if (profitYear > 0) {
            System.out.println("Прибыль продавца за год = " + "+" + profitYear);
        } else {
            System.out.println("\nПрибыль продавца за год = " + "-" + profitYear);
        }

        //Определение существования треугольника;
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        int sideLegA = sideA < sideB ? sideA : sideB;
        int sideLegB = sideC < sideLegA ? sideC : sideB;
        char slash = '/';
        char slashForward ='|';
        char space =' ';
        char underscore = '_';
        System.out.println("Определение существования треугольника");
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        } if (sideLegA == sideA && sideLegB == sideB ) {
            System.out.println("Катеты sideA и sideB, а гипотенуза sideC");
        } if (sideLegA == sideA && sideLegB == sideC) {
            System.out.println("Катеты sideA и sideС, а гипотенуза sideB");
        } if (sideLegA == sideB && sideLegB == sideC) {
            System.out.println("Катеты sideB и sideC, а гипотенуза sideA");
        } if (sideC * sideC == sideA * sideA + sideB * sideB) {
            int Area = (sideLegA * sideLegB) / 2;
            System.out.println("\nТреугольник прямоугольный и его площадь равна: " + Area);
        }   //System.out.println(""underscore * sideC);

        // Подсчет количества банкнот;
        // int sum = 567 == ((maxB1 * amountB1) + (maxB10 * amountB10) + (maxB50 * amountB50));
        // //B1, B10 и B50 от banknote
        // int maxB1 = sum / 1;
        // int maxB10 = sum / 10;
        // int max50 = sum / 50;
        // System.out.println("Подсчет количества банкнот");
        // if ()
    }
}
 
  