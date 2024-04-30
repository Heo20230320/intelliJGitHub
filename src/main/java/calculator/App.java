package calculator;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = sc.nextInt();
        System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /
        String c = sc.next();


        int result = 0;
        while (true) {
            switch (c) {
                case "+": {
                    result = a + b;
                    System.out.println("결과= " + result);
                    break;
                }
                case "-": {
                    result = a - b;
                    System.out.println("결과 = " + result);

                    break;
                }
                case "*": {
                    result = a * b;
                    System.out.println("결과 = " + result);

                    break;
                }
                case "/": {
                    result = a / b;
                    System.out.println("결과 = " + result);
                    break;
                }


            }
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            Scanner scan = null;
            String quite = scan.nextLine();
            if (quite.equals("exit")) {
                System.out.println("============== 계산기 종료 ==============");
                break;
            }


        }
    }
}