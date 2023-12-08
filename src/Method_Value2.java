public class Method_Value2 {

    public static void main(String[] args) {

        // 잘못된 코드임
        // *** 자바는 항상 변수의 값을 복사해서 대입한다! ***
        // 기존의 값이 없어지는게 아니다!!!

        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number); // 5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number); // 5
    }
    // * 위 아래 변수는 이름은 같아도 완전히 다른 변수다! *
    // main(위)의 number()와 changeNumber의 number는 서로 다른 별도의 변수이다. (영향 전혀 X)
    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, num2: " + number); // 5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + number); // 10
    }
}
