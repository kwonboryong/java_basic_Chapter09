public class Method_Value0 {

    public static void main(String[] args) {

        // *** 자바는 변수의 값을 복사해서 대입한다! ***

        int num1 = 5;
        int num2 = num1; // num1의 값을 읽고 복사해서 대입한다.
        // num1의 값은 그대로! (num1이라는 변수 자체가 num2에 들어가는 것이 아님)
        num2 = 10;

        System.out.println("num1= " + num1);
        System.out.println("num2= " + num2);

    }
}
