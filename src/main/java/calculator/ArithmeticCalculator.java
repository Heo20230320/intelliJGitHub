package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator{

    public ArithmeticCalculator(List<Double> results) {
        super(results);
     }

    public double calculate(int num1, int num2, char operator) {
        return operatorFactory(operator).operate(num1, num2);
    }

    private Operator operatorFactory(char operator) {
        OperatorType operatorType = OperatorType.fromOperator(operator);
        return switch (operatorType) {
            case ADDITION -> new AddOperator();
            case SUBSTRACTION -> new SubtractOperator();
            case MULTIPLICATION -> new MultiplyOperator();
            case DIVISION -> new DivideOperator();
            case MODULO -> new ModOperator();
        };

    }

    @Override
    public void inquiryResults() {
        for (Double result : super.getResults()) {
            System.out.println("연산결과 = " + result);
        }
    }
}
