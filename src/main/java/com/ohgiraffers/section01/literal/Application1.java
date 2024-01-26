package com.ohgiraffers.section01.literal;

public class Application1 {
    public static void main(String[] args) {

        // 주석
        /* 주석 */
        // 숫자 형태의 값
        // 정수 형태의 값 출력

        System.out.println("---정수 형태의 값---");
        System.out.println(123);

        // 실수 형태의 값
        System.out.println("---실수 형태의 값---");
        System.out.println(1.23);

        // 문자 형태의 값
        System.out.println("---문자 형태의 값---");
        System.out.println('a'); // 문자 형태의 값을 홑따옴표로 감싸줘야 한다.
        System.out.println('1'); // 숫자 값이지만 홑따옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다.
//      System.out.println('ab'); // 두 개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다.
//      System.out.println(''); // 아무 문자도 기록되지 않는 경우에도 에러가 발생한다.

        // 문자열 형태의 값
        System.out.println("---문자열 형태의 값---");
        System.out.println("ab");
        System.out.println("안녕하세요"); // 문자열은 문자 여러개가 나열된 형태를 말하며 쌍따옴표로 감싸줘야 한다.
        System.out.println("123"); // 정수 이지만 쌍따옴표로 감싸져 있기 때문에 문자열로 보아야 한다.
        System.out.println("a"); // 한 개의 문자도 쌍따옴표로 감싸면 문자열이다.(문자 a와 다르다.)

        // 논리형태의 값
        System.out.println("---논리 형태의 값---");
        System.out.println(true);
        System.out.println(false); // true 혹은 false 값을 논리형이라고 한다.


    }
}
