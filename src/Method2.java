public class Method2 {
    public static void main(String[] args) {
        printHeader(); // 매개변수, 반환 타입이 없음 -> 호출만 함 (반환값을 받으면 에러)
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader() {
        // 매개 변수가 없음 -> () 비워둠
        // 반환 타입이 없음 -> void 사용
        System.out.println("= 프로그램을 시작합니다 =");
        return; // 반환할게 없어서 return 뒤를 비워둠
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
        // * 모든 메서드는 항상 return을 호출해야 한다!
        // 그런데 반환 타입 void의 경우엔 생략 가능
    }
}
