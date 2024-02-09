package attestWork.operation;


import java.util.logging.Logger;

public class Division implements Operation {
    @Override
    public double operate(double num1, double num2) {
        if (num2 == 0) {
            Logger.getAnonymousLogger().severe("деление на 0");
            throw new IllegalArgumentException("деление на 0");
        }
        double result = Round.round(num1 / num2);
        Logger.getAnonymousLogger().info(num1 + "/" + num2 + "=" + result);
        return result;
    }
}