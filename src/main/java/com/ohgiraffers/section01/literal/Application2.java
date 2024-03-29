package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {

        // 수업 목표 : 값을 직접 연산하여 출력할 수 있다.
        // 이 때 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다.

        // 1. 숫자와 숫자의 연산
        // 1-1. 정수와 정수의 연산
        System.out.println("---1-1. 정수와 정수의 연산---");
        System.out.println(123 + 456);
        System.out.println(123-23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10); // 나머지 구하는 방법

        // 1-2. 실수와 실수의 연산
        System.out.println("---1-2. 실수와 실수의 연산---");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 * 10); // 실수와 정수의 연산은 실수로 결과가 나타난다.
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0); // 약간의 오차가 생긴다.

        // 1-3. 정수와 실수의 연산
        System.out.println("---1-3. 정수와 실수의 연산---");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        // 2. 문자의 연산
        // 2-1. 문자와 문자의 연산
        System.out.println("---2-1. 문자와 문자의 연산---");
        System.out.println('a' + 'b'); // 아스키코드 a : 97, b : 98, A : 65
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        // 2-2. 문자와 정수의 연산
        // 이쯤 되면 문자 'a'는 숫자 97과 같다 라는 것을 알 수 있다.
        // 컴퓨터는 문자를 인식하지 못하고 숫자로만 인식할 수 있기 때문에,
        // 모든 문자에 대응되는 숫자들이 매칭이 되어 있다. (아스키코드와 유니코드)
        System.out.println("---2-2. 문자와 정수의 연산---");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        // 2-3 문자와 실수의 연산
        // 실수도 숫자이기 때문에 정수의 연산처럼 모든 연산이 가능하다.
        System.out.println("---2-3. 문자와 실수의 연산---");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);
        // 여기서 결론은 문자는 내부적으로 숫자 취급을 한다는 것이다.
        // 결국 지금까지 연산은 숫자끼리의 연산을 본 것이고, 숫자(정수 혹은 실수) 형태의 값은
        // 수학의 사칙연산과 mod연산이 전부 가능하다.

        // 3. 문자열의 연산
        // 3-1. 문자열과 문자열의 연산
        // 문자열과 문자열의 '+' 연산 결과는 문자열 합치기(이어 붙이기)가 된다.
        System.out.println("---3-1. 문자열과 문자열의 연산---");
        System.out.println("Hello" + " World");
//        System.out.println("Hello" - " World");
//        System.out.println("Hello" * " World");
//        System.out.println("Hello" / " World");
//        System.out.println("Hello" % " World");
        // 문자열 연산은 더하기만 가능.

        // 3-2 문자열과 다른 형태의 값 연산
        // 문자열과의 연산은 '+' 연산만 가능하다.
        // 연산결과는 다른 형태의 값들도 문자열로 취급하여 이어 붙이기(문자열 합치기) 결과가 나오게 된다.

        System.out.println("---3-1. 문자열과 다른 값의 연산---");
        // 문자열과 정수의 연산
        System.out.println("Hello World" + 123);
        // 문자열과 실수의 연산
        System.out.println("Hello WOrld" + 1.23);
        // 문자열과 문자의 연산
        System.out.println("Hello World" + 'a'); //문자열과 문자의 연산은 문자열로 합산된다.
        // 문자열과 논리값의 연산
        System.out.println("Hello World" + true); //문자열과 논리값의 연산도 문자열로 합산된다.

        // 주의사항. 숫자로 된 문자열의 형태의 값 '+' 연산의 결과가 문자열 합치기 결과가 되는 것에 주의
        System.out.println("123" + "456"); // 문자열
        System.out.println("123" + 456); // 문자열


        // 4. 논리값 연산
        // 4-1. 논리값과 논리값 연산
        System.out.println("---4-1. 논리값과 논리값의 연산---");
//        System.out.println(true + true);
//        System.out.println(true - true);
//        System.out.println(true * true);
//        System.out.println(true / true);
//        System.out.println(true % true);

        // 4-2. 논리값과 정수의 연산
        System.out.println("---4-2. 논리값과 정수의 연산---");
//        System.out.println(true + 1);
//        System.out.println(true - 1);
//        System.out.println(true * 1);
//        System.out.println(true / 1);
//        System.out.println(true % 1);

        // 4-3. 논리값과 실수의 연산
        System.out.println("---4-3. 논리값과 실수의 연산---");
//        System.out.println(true + 1.0);
//        System.out.println(true - 1.0);
//        System.out.println(true * 1.0);
//        System.out.println(true / 1.0);
//        System.out.println(true % 1.0);

        // 4-4. 논리값과 문자의 연산
        System.out.println("---4-4. 논리값과 문자의 연산---");
//        System.out.println(true + 'a');
//        System.out.println(true - 'a');
//        System.out.println(true * 'a');
//        System.out.println(true / 'a');
//        System.out.println(true % 'a');

        // 4-5. 논리값과 문자열의 연산
        System.out.println("---4-5. 논리값과 문자열의 연산---");
        System.out.println(true + "a"); // 문자열이 있기 때문에 논리값이 문자열로 인식됨.
//        System.out.println(true - "a");
//        System.out.println(true * "a");
//        System.out.println(true / "a");
//        System.out.println(true % "a");

    }

}
