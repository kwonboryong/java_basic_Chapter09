public class Method_Return1 {

    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) { // 홀수면 true
            return true;
        } else {
            return false;
        }
        // * true든 false든 반드시 return을 해줘야 함 (return이 없으면 에러)
    }
}
