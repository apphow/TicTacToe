public class MultiplicationTable {

    // multiplication table with 1 row\
    public static void  multiplicationTable(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(n + " * " + (i + 1) +  " = " + (n * (i + 1)));
        }
    }
    public static void main(String[] args) {
        multiplicationTable(10);
    }
}
