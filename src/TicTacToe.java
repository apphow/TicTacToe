import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

        public String board[][];

        public TicTacToe(String[][] board) {
            this.board = board;

        }

        public TicTacToe() {

        }

        public String[] getRow(Integer value) {
            return board[value];
        }

        public String[] getColumn(Integer value) {
            String[] column = new String[3];
            for (int i = 0; i < 3; i++) {
                column[i] = board[i][value];
            }
            return column;

        }

        public Boolean isRowHomogenous(Integer rowIndex) {

            String[] row = getRow(rowIndex);

            if (row[0].equals(row[1]) && row[0].equals(row[2])) {
                return true;
            }
            return false;

        }


        public Boolean isColumnHomogeneous(Integer columnIndex) {
            String[] column = getColumn(columnIndex);
            if(column[0].equals(column[1]) && column[0].equals(column[2])) {
                return true;
            }
            return false;
        }


        public String getWinner() {
            String winner = "";
            for(int i = 0; i < 3; i++) {
                if (isRowHomogenous(i)) {
                    winner = board[i][i];
                }
                else if (isColumnHomogeneous(i)) {
                    winner = board[i][i];
                } else{
                    winner = board[1][1];
                }
            }
            return winner;

        }

        public String[][] getBoard() {
            return board;
        }

    }








