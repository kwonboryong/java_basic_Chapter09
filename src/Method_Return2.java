public class Method_Return2 {

    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) { // 10이면 여기 수행
            System.out.println(age + "살, 미성년자는 출입이 불가합니다.");
            return; // return을 만나면 다음을 수행하지 않고 메서드를 빠져나온다.
        }

        System.out.println(age + "살, 입장하세요."); // 20이면 여기 수행
        // 반환타입 void로 없기 때문에 return은 생략 가능
    }
}
