public class Method_Casting1 {

    public static void main(String[] args) {
        double number = 1.5; // double형
        // printNumber(number); 변수값 1.5(double)와 매개변수(int)의 형이 맞지 않아서 에러
        // double은 (더 작은) int에 넣을 수 없음
        printNumber((int) number); // 1.5를 호출해서 int형으로 명시적 형변환!
    }

    public static void printNumber(int n) { // int형만 받는 메서드
        System.out.println("숫자: " + n);

    }
}
