package attestWork.factory;

import attestWork.operation.*;

import java.util.logging.Logger;

public class OperationFactory {
    public static Operation createOperation (String operator) {
        switch (operator) {
            case "+":
                return new Plus();
            case "-":
                return new Minus();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            default:
                Logger.getAnonymousLogger().severe("недопустимый оператор");
                throw new IllegalArgumentException("недопустимый оператор");
        }
    }
}