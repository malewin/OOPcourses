package attestWork.calculator;

import attestWork.factory.OperationFactory;
import attestWork.operation.Operation;

public class Calculator {
    public double calculate (double num1, double num2, String operator) {
        Operation operation = OperationFactory.createOperation(operator);
        return operation.operate(num1, num2);
    }
}