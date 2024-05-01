package calculator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);

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
            System.out.println(linkedList.get(1));
            System.out.println(linkedList.get(2));
            System.out.println(linkedList.get(3));
            System.out.println(linkedList.get(4));
            System.out.println(linkedList.get(5));
            System.out.println(linkedList.get(6));
            System.out.println(linkedList.get(7));
            System.out.println(linkedList.get(8));
            System.out.println(linkedList.get(9));
            System.out.println(linkedList.get(10));
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