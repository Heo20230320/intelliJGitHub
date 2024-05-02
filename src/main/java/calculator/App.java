package calculator;

import java.util.*;

public class App {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] results  = new int[10]; // 0, 1, 2, ... 9
        int index = 0;


    do {
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.println("사칙연산 기호를 입력하세요: "); // +, -, *, /
        char operator = sc.next().charAt(0);

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
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return;
                }
                break;
            default:
                System.out.println("올바른 선택이 아닙니다.");
                break;

        }
        System.out.println("결과 : " + result);
        results[index] = result;
        index++;
        System.out.println("Arrays.toString(results) = " + Arrays.toString(results));

        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        } while (!sc.next().equals("exit"));
    }
}