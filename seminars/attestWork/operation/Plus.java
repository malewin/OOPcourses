package attestWork.operation;

import java.util.logging.Logger;

public class Plus implements Operation {
    @Override
    public double operate(double num1, double num2) {
        double result = Round.round(num1 + num2);
        Logger.getAnonymousLogger().info(num1 + "+" + num2 + "=" + result);
        return result;
    }
}
