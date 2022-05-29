public class Calculator {
    //Калькулятор;
    private double num1;
    private double num2;
    private char sign;
    double result = 0;

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
    return num2;
    }

    public char getSign() {
    return sign;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void check() {
    switch (sign) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            result = num1 / num2;
            break;
        case '^': 
            result = 1;
            for (double i = 1; i <= num2; i++) {
                result *= num1;
            }
            break;
        case '%': 
            result = num1 % num2;
            break;
        }  
    }  
}