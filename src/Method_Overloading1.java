public class Method_Overloading1 {

    // 메서드는 매개변수 정보를 함께 사용해서 메서드를 구분한다.
    // -> 이름이 같은 (매개변수는 다른) 메서드 사용 가능
    // 메서드 오버로딩(Method Overloading): 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것
    // 매서드 시그니처(Method Signature): 메서드를 구분할 수 있는 고유한 서명, 이름 + 매개변수의 타입(순서 포함)으로 구성됨
    // 반환 타입과 매개변수의 이름은 시그니처에 포함되지 않는다.
    // 오버로딩 실패 예시
    // int add(int a, int b)와 double add(int a, int b) => 이름과 매개변수의 타입(int)이 같음

    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("1: " + add(1, 2, 3));

    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
