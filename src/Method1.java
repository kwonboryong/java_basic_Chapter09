public class Method1 {

    public static void main(String[] args) {

        // 함수(메서드) 정의
        // add(a, b) = a + b -> add라는 이름의 함수는 a와 b 두 값을 받아 a + b 연산을 수행한다.
        // 계산이 반복될 때 함수를 정의해놓고 필요하면 호출하면 된다.

        // 계산1
        int a = 1;
        int b = 2;
        System.out.println(a + "+" + b + "연산 수행");
        int sum1 = a + b;
        System.out.println("결과1 출력: " + sum1);

        // 계산 2
        int x = 10;
        int y = 20;
        System.out.println(x + "+" + y + "연산 수행");
        int sum2 = x + y;
        System.out.println("결과2 출력: " + sum2);
    }
}
