import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


/**
 * The `GridMovement` class in Java represents a game where the player can move through different
 * areas, encounter enemies, find treasures, and defeat bosses.
 */
public class GridMovement {
    private static final int AREA1_ROW = 7; //All finals are in allcaps
    private static final int AREA1_COL = 3;
    private static final int AREA2_ROW = 7;
    private static final int AREA2_COL = 7;
    private static final int AREA3_ROW = 7;
    private static final int AREA3_COL = 5;     
    private static int currentArea = 1; // First Area
    private static int PRow = 0; //Starting position in Area 1; Row-side
    private static int PCol = 1; // Starting position in Area 1; Column-side

    public GridMovement() {
        runGame();
    }


    /**
     * The `runGame` function in Java uses a while loop to continuously check the current area and then
     * initializes, displays, and handles player movement for the corresponding game area.
     */
    public void runGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (currentArea == 1) {
                String[][] area1 = new String[AREA1_ROW][AREA1_COL];
                initializestage(area1);
                displaystage(area1);
                playerMovement(scanner, area1);
            } else if (currentArea == 2) {
                String[][] area2 = new String[AREA2_ROW][AREA2_COL];
                initializestage(area2);
                displaystage(area2);
                playerMovement(scanner, area2);
            } else if (currentArea == 3){
                String [][] area3 = new String[AREA3_ROW][AREA3_COL];
                initializestage(area3);
                displaystage(area3);
                playerMovement(scanner, area3);
            }
        }
    }

    /**
     * The `initializestage` function initializes a 2D array representing a stage with empty spaces and
     * sets a player marker at a specific position.
     * 
     * @param stage The `stage` parameter is a 2D array of Strings that represents the game stage or
     * board. Each element in the array corresponds to a cell on the stage. The method
     * `initializestage` initializes the stage by setting each cell to "[ ]" except for the player's
     * current position
     */
    private void initializestage(String[][] stage) {
        for (int i = 0; i < stage.length; i++) {
            for (int j = 0; j < stage[0].length; j++) {
                stage[i][j] = "[ ]";
            }
        }
        stage[PRow][PCol] = "[X]"; // Set X at the current player position
    }

    /**
     * The `displaystage` function in Java prints out a 2D array representing a stage, line by line.
     * 
     * @param stage A 2D array of strings representing the layout of Stormveil Castle. Each element in
     * the array corresponds to a cell in the castle, and the strings represent the contents of each
     * cell (e.g., walls, doors, enemies, items).
     */
    private void displaystage(String[][] stage) {
        System.out.println("Stormveil Castle:");
        for (String[] row : stage) {
            for (String cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    
   
    /**
     * The function `playerMovement` takes user input to move a player within a game stage until a
     * valid move is made.
     * 
     * @param scanner The `scanner` parameter in the `playerMovement` method is an object of the
     * `Scanner` class in Java. It is used to read input from the user during the player's movement in
     * the game.
     * @param stage The `stage` parameter is a 2D array representing the game stage or map where the
     * player can move around. Each element in the array corresponds to a specific position on the
     * stage and may contain information about obstacles, items, or the player's current position. 
     */
    private void playerMovement(Scanner scanner, String[][] stage) {
        while (true) {
            System.out.print("Enter direction (Use WSAD to move): ");
            String Sinput = scanner.next().toUpperCase();
            if (movePlayer(Sinput, stage)) {
                break;
            }
            displaystage(stage); // Update the stage after each movement
        }
    }

    /**
     * The function `movePlayer` in Java handles player movement within different areas of a stage,
     * including encountering enemies, finding treasure, and defeating bosses.
     * 
     * @param direction The `direction` parameter in the `movePlayer` method represents the direction
     * in which the player intends to move. It is a string value that can be one of the following:
     * @param stage The `stage` parameter is a 2D array representing the game stage where the player
     * can move. Each element in the array corresponds to a position on the stage. The player's current
     * position is denoted by `[X]`, empty spaces are represented by `[ ]`, and other elements may
     * represent
     * @return The method `movePlayer` is returning a boolean value. It returns `true` in certain
     * conditions when the player successfully moves to a different area or defeats a boss, and it
     * returns `false` in all other cases.
     */
    private boolean movePlayer(String direction, String[][] stage) {
        Random r = new Random();
        int low = 0;
        int high = 100;
        int RNum = r.nextInt(high - low + 1) + low;
        int i = r.nextInt(3 - 1 + 1) + low;
        boolean BossDefeat = false;

        switch (direction) {
            case "W":
                if (PRow > 0) {
                    stage[PRow][PCol] = "[ ]"; // Clear current position
                    PRow--;
                }else if(currentArea == 2 && PRow == 0 && PCol == 3){
                    System.out.println("Do you want to return to Area 1? (Y/N): ");
                    Scanner scanner = new Scanner(System.in);
                    String choice = scanner.next().toUpperCase();
                    if (choice.equals("Y")) {
                        currentArea = 1;
                        PRow = 6;
                        PCol = 1; // Door position for Area 1
                        return true;
                } 
            } else if (currentArea == 3 && PRow == 0 && PCol == 2){
                System.out.println("Do you want to return to Area 2? (Y/N): ");
                    Scanner scanner = new Scanner(System.in);
                    String choice = scanner.next().toUpperCase();
                    if (choice.equals("Y")) {
                        currentArea = 2;
                        PRow = 6;
                        PCol = 3; // Door position for Area 2
                        return true;
                } 
            } else {
                    System.out.println("Cannot go up. The player is at the edge.");
                }
                break;
                
            case "A":
                if (PCol > 0) {
                    stage[PRow][PCol] = "[ ]"; // Clear current position
                    PCol--;
                } else {
                    System.out.println("Cannot go left. The player is at the edge.");
                }
                break;
            case "S":
                if (currentArea == 1 && PRow < AREA1_ROW - 1) {
                    stage[PRow][PCol] = "[ ]"; // Clear current position
                    PRow++;
                } else if (currentArea == 1 && PRow == 6 && PCol == 1) {
                    System.out.println("Do you want to move to Area 2? (Y/N): ");
                    Scanner scanner = new Scanner(System.in);   
                    String choice = scanner.next().toUpperCase();
                    if (choice.equals("Y")) {
                        currentArea = 2;
                        PRow = 0;
                        PCol = 3; // Starting position for Area 2
                        return true;
                    }
                } else if (currentArea == 2 && PRow < AREA2_ROW - 1) {
                    stage[PRow][PCol] = "[ ]"; // Clear current position
                    PRow++;
                } else if (currentArea == 2 && PRow == 6 && PCol == 3) {
                    System.out.println("Do you want to move to Area 3? (Y/N): ");
                    Scanner scanner = new Scanner(System.in);
                    String choice = scanner.next().toUpperCase();
                    if (choice.equals("Y")) {
                        currentArea = 3;
                        PRow = 0;
                        PCol = 2; // Starting position for Area 3
                        return true;
                    }
                } else if (currentArea == 3 && PRow < AREA3_ROW - 1) {
                    stage[PRow][PCol] = "[ ]"; // Clear current position
                    PRow++;
                } else {
                    System.out.println("Cannot go down. The player is at the edge.");
                }

                if (currentArea == 3 && PRow == 6 && PCol == 2 && BossDefeat == true){
                    //Put the call for the Game Lobby here.
                }
                break;
            
            case "D":
                if (currentArea == 1 && PCol < AREA1_COL - 1) {
                    stage[PRow][PCol] = "[ ]"; // Clear current position
                    PCol++;
                } else if (currentArea == 2 && PCol < AREA2_COL - 1) {
                    stage[PRow][PCol] = "[ ]"; // Clear current position
                    PCol++;
                } else if (currentArea == 3 && PCol < AREA3_COL - 1) {
                    stage[PRow][PCol] = "[ ]"; // Clear current position
                    PCol++;
                } else {
                    System.out.println("Cannot go right. The player is at the edge.");
                }
                break;
            default:
                System.out.println("Please use WASD to move.");
                break;
        }
        stage[PRow][PCol] = "[X]"; // Update the stage with the new player position;
        
        if (currentArea == 1){
            if (stage[PRow][PCol] == stage[5][0] || stage[PRow][PCol] == stage[5][2]){
                if (RNum <= 25){
                    System.out.println("\n You found treasure. \n");
                } else {
                    System.out.println("\nYou fought a monster. Here is its stats: ");
                    System.out.println("Enemy Name: " + EnemyType.getEnemyTypeCastle(i));
                    System.out.println("Enemy Value: " + (EnemyType.getEnemyTypeIndexCastle(i) + 1));
                    System.out.println("HP: " + EnemyType.HPValue(i));
                    System.out.println("Attack: " + EnemyType.ATKValue(i) + "\n");
                }
    
            } 
        } 
        
        if (currentArea == 2){
            if (stage[PRow][PCol] == stage[1][2] || stage[PRow][PCol] == stage[1][4] || stage[PRow][PCol] == stage[3][0] || stage[PRow][PCol] == stage[3][2] || stage[PRow][PCol] == stage[3][3] || stage[PRow][PCol] == stage[3][4] || stage[PRow][PCol] == stage[3][6] || stage[PRow][PCol] == stage[5][3]){
                if (RNum <= 25){
                    System.out.println("You found treasure. \n");
                } else {
                    System.out.println("\nYou fought a monster. Here is its stats: ");
                    System.out.println("Enemy Name: " + EnemyType.getEnemyTypeCastle(i));
                    System.out.println("Enemy Value: " + (EnemyType.getEnemyTypeIndexCastle(i) + 1));
                    System.out.println("HP: " + EnemyType.HPValue(i));
                    System.out.println("Attack: " + EnemyType.ATKValue(i) + "\n");
                }
    
            } 
        }
        
        if (currentArea == 3){
            if (stage[PRow][PCol] == stage[3][2]){
                System.out.println("\nYou now face the boss of this area: " + EnemyType.getBosses(0) + "\n");
                System.out.println("HP: " + 200);
                System.out.println("Attack: " + (r.nextInt(300-150) + 150) + "\n");
                System.out.println("The boss is defeated for now. You can now use the teleporter in the end of the room.\n");
                BossDefeat = true;
            }
        }

        return false;
    }
    
    public static void main(String[] args) {
        new GridMovement().runGame();
    }
}
