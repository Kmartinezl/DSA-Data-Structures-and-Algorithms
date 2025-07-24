public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // O(n) example
        BigO bigO = new BigO();
        bigO.oNComplexity(10);

        // o(n2) example
        bigO.onSquare(10);
    }

}