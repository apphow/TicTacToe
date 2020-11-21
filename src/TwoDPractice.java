public class TwoDPractice {
    public static int rows = 8, columns = 8;
    public static int[][] board = new int[rows][columns];

    public static void main(String[] args) {
        printGameBoard();

    }


    public static void printGameBoard() {

        int incrementer = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] += incrementer;
                incrementer++;
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
