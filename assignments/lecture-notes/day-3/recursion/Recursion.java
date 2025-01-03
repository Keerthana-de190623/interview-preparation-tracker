package recursion;

public class Recursion {
    public static void main(String[] args) {
        // a();
        // printing nos from 1 to n;
        printingNosNTo1(5);
        printingNos1ToN(5);
    }

    public static void printingNosNTo1(int n) {
        // Base condition
        if (n == 0) {
            return;
        }
        // Some operation
        System.out.println(n);

        // Function call
        printingNosNTo1(n - 1);

        // return something
    }

    public static void printingNos1ToN(int n) {
        if (n == 0) {
            return;
        }
        printingNos1ToN(n - 1);
        System.out.println(n);
    }

    public static void a() {
        System.out.println("Hi");
        b();
    }

    public static void b() {
        System.out.println("Hello");
        c();
    }

    public static void c() {
        System.out.println("World");
    }
}
