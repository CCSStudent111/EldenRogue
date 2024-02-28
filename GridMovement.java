import java.util.Scanner;

public class GridMovement {
    private static final int AREA1_ROWS = 7;
    private static final int AREA1_COLS = 3;
    private static final int AREA2_ROWS = 7;
    private static final int AREA2_COLS = 7;
    private static int currentArea = 1; // Current area
    private static int playerRow = 0;
    private static int playerCol = 1; // Starting position in Area 1

    public GridMovement() {
        runGame();
    }

    public void runGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (currentArea == 1) {
                String[][] area1 = new String[AREA1_ROWS][AREA1_COLS];
                initializeGrid(area1);
                displayGrid(area1);
                playerMovement(scanner, area1);
            } else if (currentArea == 2) {
                String[][] area2 = new String[AREA2_ROWS][AREA2_COLS];
                initializeGrid(area2);
                displayGrid(area2);
                playerMovement(scanner, area2);
            }
        }
    }

    private void initializeGrid(String[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = "[ ]";
            }
        }
        grid[playerRow][playerCol] = "[X]"; // Set X at the current player position
    }

    private void displayGrid(String[][] grid) {
        System.out.println("Grid:");
        for (String[] row : grid) {
            for (String cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    private void playerMovement(Scanner scanner, String[][] grid) {
        while (true) {
            System.out.print("Enter direction (WASD to move): ");
            String input = scanner.next().toUpperCase();
            if (movePlayer(input, grid)) {
                break;
            }
            displayGrid(grid); // Update the grid after each movement
        }
    }

    private boolean movePlayer(String direction, String[][] grid) {
        switch (direction) {
            case "W":
                if (playerRow > 0) {
                    grid[playerRow][playerCol] = "[ ]"; // Clear current position
                    playerRow--;
                } else {
                    System.out.println("Cannot move up. Already at the top.");
                }
                break;
            case "A":
                if (playerCol > 0) {
                    grid[playerRow][playerCol] = "[ ]"; // Clear current position
                    playerCol--;
                } else {
                    System.out.println("Cannot move left. Already at the leftmost.");
                }
                break;
                case "S":
                if (currentArea == 1 && playerRow < AREA1_ROWS - 1) {
                    grid[playerRow][playerCol] = "[ ]"; // Clear current position
                    playerRow++;
                } else if (currentArea == 1 && playerRow == 6 && playerCol == 1) {
                    System.out.println("Do you want to move to the next area? (Y/N): ");
                    Scanner scanner = new Scanner(System.in);
                    String choice = scanner.next().toUpperCase();
                    if (choice.equals("Y")) {
                        currentArea = 2;
                        playerRow = 0;
                        playerCol = 6; // Changed from playerCol = 7 to playerCol = 6
                        return true;
                    }
                } else if (currentArea == 2 && playerRow < AREA2_ROWS - 1) {
                    grid[playerRow][playerCol] = "[ ]"; // Clear current position
                    playerRow++;
                } else {
                    System.out.println("Cannot move down. Already at the bottom.");
                }

                break;
            case "D":
                if (currentArea == 1 && playerCol < AREA1_COLS - 1) {
                    grid[playerRow][playerCol] = "[ ]"; // Clear current position
                    playerCol++;
                } else if (currentArea == 2 && playerCol < AREA2_COLS - 1) {
                    grid[playerRow][playerCol] = "[ ]"; // Clear current position
                    playerCol++;
                } else {
                    System.out.println("Cannot move right. Already at the rightmost.");
                }
                break;
            default:
                System.out.println("Invalid direction. Please use WASD to move.");
                break;
        }
        grid[playerRow][playerCol] = "[X]"; // Update the grid with the new player position
        return false;
    }
    
    

    public static void main(String[] args) {
        new GridMovement().runGame();
    }
}
