public class Method_Overloading2 {
    public static void main(String[] args) {
        myMethod(1.2,1); // double, int라서 myMethod(double a, int b) 호출
        myMethod(1,1.2); // int, double이라서 myMethod(int a, double b) 호출
    }

    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }
}
