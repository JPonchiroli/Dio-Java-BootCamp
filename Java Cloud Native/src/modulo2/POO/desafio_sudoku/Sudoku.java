package modulo2.POO.desafio_sudoku;

import java.util.Random;
import java.util.Scanner;

public class Sudoku {
    private static final int SIZE = 9;
    private static final int SUBGRID = 3;
    private int[][] board;
    private int[][] solution;
    private Random random;
    private Scanner scanner;

    public Sudoku() {
        board = new int[SIZE][SIZE];
        solution = new int[SIZE][SIZE];
        random = new Random();
        scanner = new Scanner(System.in);
        generateSudoku();
    }

    private void generateSudoku() {
        fillDiagonal();
        solveSudoku();
        copySolution();
        removeNumbers(40); // Ajuste a dificuldade alterando a quantidade de números removidos
    }

    private void copySolution() {
        for (int i = 0; i < SIZE; i++) {
            System.arraycopy(board[i], 0, solution[i], 0, SIZE);
        }
    }

    private void fillDiagonal() {
        for (int i = 0; i < SIZE; i += SUBGRID) {
            fillBox(i, i);
        }
    }

    private void fillBox(int row, int col) {
        boolean[] used = new boolean[SIZE + 1];
        for (int i = 0; i < SUBGRID; i++) {
            for (int j = 0; j < SUBGRID; j++) {
                int num;
                do {
                    num = random.nextInt(SIZE) + 1;
                } while (used[num]);
                used[num] = true;
                board[row + i][col + j] = num;
            }
        }
    }

    private boolean solveSudoku() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= SIZE; num++) {
                        if (isSafe(row, col, num)) {
                            board[row][col] = num;
                            if (solveSudoku()) {
                                return true;
                            }
                            board[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isSafe(int row, int col, int num) {
        return !usedInRow(row, num) && !usedInCol(col, num) && !usedInBox(row - row % SUBGRID, col - col % SUBGRID, num);
    }

    private boolean usedInRow(int row, int num) {
        for (int col = 0; col < SIZE; col++) {
            if (board[row][col] == num) {
                return true;
            }
        }
        return false;
    }

    private boolean usedInCol(int col, int num) {
        for (int row = 0; row < SIZE; row++) {
            if (board[row][col] == num) {
                return true;
            }
        }
        return false;
    }

    private boolean usedInBox(int rowStart, int colStart, int num) {
        for (int i = 0; i < SUBGRID; i++) {
            for (int j = 0; j < SUBGRID; j++) {
                if (board[rowStart + i][colStart + j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    private void removeNumbers(int count) {
        while (count > 0) {
            int row = random.nextInt(SIZE);
            int col = random.nextInt(SIZE);
            if (board[row][col] != 0) {
                board[row][col] = 0;
                count--;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            if (i % 3 == 0 && i != 0) System.out.println("---------------------");
            for (int j = 0; j < SIZE; j++) {
                if (j % 3 == 0 && j != 0) System.out.print("| ");
                System.out.print((board[i][j] == 0 ? "." : board[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public void playGame() {
        while (!isComplete()) {
            printBoard();
            System.out.print("Digite a linha (1-9), coluna (1-9) e número (1-9) separados por espaço: ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            int num = scanner.nextInt();

            if (board[row][col] == 0 && solution[row][col] == num) {
                board[row][col] = num;
                System.out.println("Movimento válido!");
            } else {
                System.out.println("Movimento inválido! Tente novamente.");
            }
        }
        System.out.println("Parabéns! Você completou o Sudoku!");
    }

    private boolean isComplete() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku.playGame();
    }
}

