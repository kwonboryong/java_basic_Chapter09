public class Method_Value1 {

    public static void main(String[] args) {

        // 잘못된 코드임
        // *** 자바는 항상 변수의 값을 복사해서 대입한다! ***
        // 기존의 값이 없어지는게 아니다!!!

        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1); // 5
        changeNumber(num1); // num1의 값 5를 읽고 복사해서 num2에 전달 -> 5
        System.out.println("4. changeNumber 호출 후, num1: " + num1); // 5
    }
    public static void changeNumber(int num2) { // 5
        System.out.println("2. changeNumber 변경 전, num2: " + num2); // 5
        num2 = num2 * 2; // num2는 10이 됨
        System.out.println("3. changeNumber 변경 후, num2: " + num2); // 10
    }
}
