public class Method_Overloading3 {

    public static void main(String[] args) { // 매개변수의 타입이 다름
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1.2, 1.5));
    }

    // 만약 int add(int a, int b)가 없어도 System.out.println("1: " + add(1, 2));는 출력이 됨!
    // int형은 double로 자동 형변환이 되기 때문에 아래의 double add(double a, double b)을 통해 출력된다.
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
