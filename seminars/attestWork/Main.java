package attestWork;


import attestWork.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
        calculator.calculate(-2.2, 3, "+");
        calculator.calculate(2, 3.4, "-");
        calculator.calculate(2, 3, "*");
        calculator.calculate(2, -5, "/");
        }
        catch (Exception e) {
            System.out.println("что-то пошло не так " + e.getMessage());
        }
    }
}
