public class Method_Casting2 {

    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // 명시적 형변환 안해도 됨
    }
    // double형 매개변수에 int형 인수를 전달하는 것은 아무 문제 없음
    // int < long < double 순이기 때문에 (작은 것 -> 큰 것은 가능)
    public static void printNumber(double n) {
        System.out.println("숫자: " + n);

    }
}
