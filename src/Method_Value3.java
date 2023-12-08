public class Method_Value3 {

    public static void main(String[] args) {

        // 제대로 된 코드임
        // * Shift + F6 = 변수 이름 한 번에 바꾸기!!!

        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1);
        num1 = changeNumber(num1);
        // 1. num1의 값이 호출되고 복사해서 아래 메서드에 들어간다.
        // 2. 아래 메서드의 계산이 끝나면 return을 통해 changeNumber(num1)은 num2의 값이 된다.
        System.out.println("changeNumber 호출 후, num1: " + num1);
    }
    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;

    }
}
