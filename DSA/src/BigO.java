public class BigO {
    /**
     *
     * @param n
     * print the numbers of ints in the loop
     */
    public void oNComplexity(int n){
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
    }

    public void onSquare(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println(i + " " + j);
            }
        }
    }
}
