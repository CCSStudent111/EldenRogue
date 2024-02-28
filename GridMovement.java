import java.util.Scanner;

public class GridMovement {
    private static final int GRID_ROWS = 3;
    private static final int GRID_COLS = 7;
    private static int playerRow = 1;
    private static int playerCol = 0;

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        String[][] grid = new String[GRID_ROWS][GRID_COLS];

        while (true) {
            initializeGrid(grid);
            displayGrid(grid);
            System.out.print("Enter direction (WASD to move): ");
            String input = scanner.next().toUpperCase();
            movePlayer(input);
        }
    }

    private static void initializeGrid(String[][] grid) {
        for (int i = 0; i < GRID_ROWS; i++) {
            for (int j = 0; j < GRID_COLS; j++) {
                grid[i][j] = "[ ]";
            }
        }
        grid[playerRow][playerCol] = "[X]";
    }

    private static void displayGrid(String[][] grid) {
        System.out.println("Grid:");
        for (int i = 0; i < GRID_ROWS; i++) {
            for (int j = 0; j < GRID_COLS; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    private static void movePlayer(String direction) {
        switch (direction) {
            case "W":
                if (playerRow > 0) {
                    playerRow--;
                } else {
                    System.out.println("Cannot move up. Already at the top.");
                }
                break;
            case "A":
                if (playerCol > 0) {
                    playerCol--;
                } else {
                    System.out.println("Cannot move left. Already at the leftmost.");
                }
                break;
            case "S":
                if (playerRow < GRID_ROWS - 1) {
                    playerRow++;
                } else {
                    System.out.println("Cannot move down. Already at the bottom.");
                }
                break;
            case "D":
                if (playerCol < GRID_COLS - 1) {
                    playerCol++;
                } else {
                    System.out.println("Cannot move right. Already at the rightmost.");
                }
                break;
            default:
                System.out.println("Invalid direction. Please use WASD to move.");
                break;
        }
    }
}
