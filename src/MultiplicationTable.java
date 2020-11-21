public class MultiplicationTable {

    // multiplication table with 1 row\
    public static void multiplicationTable(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(n + " * " + (i + 1) + " = " + (n * (i + 1)));
        }
    }

    public static void twoDmultiplicationTable() {
        int rows = 12, columns = 12;
        int numAfterMultiplied;
        for (int i = 1; i <= rows; i++) {
            if (i < 10) System.out.print(i + " :");
            else System.out.print(i + ":");

            for (int j = 1; j <= columns; j++) {
                numAfterMultiplied = i * j;
                System.out.print(" " + numAfterMultiplied);
                if (numAfterMultiplied < 10) System.out.print("  ");
                else if (numAfterMultiplied < 100) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        multiplicationTable(10);
        twoDmultiplicationTable();
    }
}
