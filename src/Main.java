
public class Main {

    public static void main(String[] args) {
        testFibonacci();
        testParentheses();
    }

    private static void testFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        int fibonacciCount = 20;
        System.out.println("Fibonacci for number: " + fibonacciCount);
        fibonacci.print(fibonacciCount);
        System.out.println();
        System.out.println();
    }

    private static void testParentheses() {
        Parentheses parentheses = new Parentheses();

        System.out.println("Test zatvoriek 1");
        boolean test1 = parentheses.isValid("(a + b + (c))");
        System.out.println(test1);

        System.out.println("Test zatvoriek 2");
        boolean test2 = parentheses.isValid("(a + b + (c)))");
        System.out.println(test2);
    }
}
