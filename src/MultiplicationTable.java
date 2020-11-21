public class MultiplicationTable {

    // multiplication table with 1 row\
    public static void  multiplicationTable(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(n + " * " + (i + 1) +  " = " + (n * (i + 1)));
        }
    }

    public static void twoDmultiplicationTable() {
         int rows = 12, columns = 12;
         int[][] table = new int[rows][columns];

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= columns; j++) {

                System.out.print((i*j + " "));

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        multiplicationTable(10);
        twoDmultiplicationTable();
    }
}
