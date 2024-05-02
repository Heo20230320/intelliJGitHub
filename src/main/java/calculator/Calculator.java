package calculator;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private static final double PI = 3.14;

    private List<Integer> results;

    private List<Double> circleResults;

    public Calculator(List<Integer> results, List<Double> circleResults) {
        this.results = results;
        this.circleResults = circleResults;
    }

    public int calculate(int num1, int num2, char operator) {
        int result = 0;

        switch (operator) {
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");

                }
                break;
            default:
                throw new UnsupportedOperationException("올바른 선택이 아닙니다.");

        }

        return result;


        }

    /**
     * 원의 넓이를 구하는 메서드
     * @param radius : 원의 반지름
     * @return 원의 넓이
     */

    public double calculateCircleArea(int radius) {

            return PI * radius * radius;
        }

    public List<Integer> getResults() {
        return results;
    }

    public List<Double> getCircleResults() {
        return circleResults;
    }


    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public void setCircleResults(List<Double> circleResults) {
        this.circleResults = circleResults;
    }
    public void removeResult(int index) {
        this.results.remove(index);
    }

    public void inquiryResults() {
        for (Integer result : results) {
            System.out.println("연산결과 = " + result);
        }

   
    }

    public void inquiryCircleResults() {
        for (Double circleResult : circleResults) {
            System.out.println("원의 넓이 = " + circleResult);
        }
    }
}
