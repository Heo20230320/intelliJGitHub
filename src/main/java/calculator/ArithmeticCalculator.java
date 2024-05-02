package calculator;

import java.util.List;

public class ArithmeticCalculator<T extends Number> extends Calculator{

    public final Class<T> type;

    public ArithmeticCalculator(List<Double> results, Class<T> type) {
        super(results);
        this.type = type;
    }



    public T calculate(T num1, T num2, char operator) {
        return operatorFactory(operator).operate(num1, num2);
    }

    private Operator<T> operatorFactory(char operator) {
        OperatorType operatorType = OperatorType.fromOperator(operator);
        return switch (operatorType) {
            case ADDITION -> new AddOperator(type);
            case SUBSTRACTION -> new SubtractOperator(type);
            case MULTIPLICATION -> new MultiplyOperator(type);
            case DIVISION -> new DivideOperator(type);
            case MODULO -> new ModOperator(type);
        };

    }

    @Override
    public void inquiryResults() {
        for (Double result : super.getResults()) {
            System.out.println("연산결과 = " + result);
        }
    }
}
