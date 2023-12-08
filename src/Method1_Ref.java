public class Method1_Ref {

    public static void main(String[] args) {

        // 메서드 = 함수
        // 메서드 이름 => 동사!!!
        // 메서드 선언 = public static int add(int a, int b)
        // int: 반환 타입
        // add: 메서드 이름, 이름으로 호출
        // int a & int b: 매개변수, 해당 메서드 안에서만 사용됨
        // * 메서드 타입과 매개변수의 타입이 맞아야 한다!

        // 인수(Argument): 메서드 호출 시 함수로 넘기는(들어가는) 전달값
        // 매개변수(Parameter): 메서드 선언 시 정의한 변수(인수가 넘어와서 대입되는 곳)


        // 계산1
        int sum1 = add(5, 10); // 메서드 호출 (5, 10 -> 인수)
        // 아래의 method 계산이 끝나면 add에 아래의 sum 값이 add에 대입됨
        System.out.println("결과1 출력: " + sum1);

        // 계산 2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);
    }

    // add 메서드
    public static int add(int a, int b) { // 메서드 선언
        System.out.println(a + "+" + b + "연산 수행"); // 메서드 본문
        int sum = a + b;
        return sum; // 수행 후 위의 int sum1에 들어간다!
    }
}
