package com.ohgiraffers.section01.literal;

public class Application3 {
    public static void main(String[] args) {

        // 문자열 합치기 결과를 예측하고 사용할 수 있다.
        // 1. 두 개의 문자열 합치기
        System.out.println("--- 1. 두 개의 문자열 합치기---");
        System.out.println(9 + 9); // 정수
        System.out.println("9" + 9); // 문자열
        System.out.println(9 + "9"); // 문자열
        System.out.println("9" + "9"); // 문자열

//        System.out.println("안녕" + "하세요");
//        String name = "김만호";
//        System.out.println("안녕하세요 저는 " + name + "입니다.");

        // 2. 세 개의 문자열 합치기
        System.out.println("--- 2. 세 개의 문자열 합치기---");
        System.out.println(9 + 9 + "9"); // 문자열 189
        System.out.println(9 + "9" + 9); // 문자열 999
        System.out.println("9" + 9 + 9); // 문자열 999

        System.out.println("9" + (9 + 9)); // 문자열 918

        System.out.println("10과 20의 합 : " + (10 + 20));
        System.out.println("10과 20의 차 : " + (10 - 20));
        System.out.println("10과 20의 곱 : " + (10 * 20));
        System.out.println("10과 20의 나누기한 몫 : " + (10 / 20));
        System.out.println("10과 20의 나누기 한 나머지 : " + (10 % 20));

        System.out.println("기차");
        System.out.println("기차" + "칙칙폭폭");
        System.out.println("기차" + 123 + 45 + "출발");
        System.out.println(123 + 45 + "기차" + "출발");

    }

}
