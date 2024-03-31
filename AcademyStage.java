import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


/**
 * This class represents the movement of the player within different areas of a grid-based game.
 */
public class AcademyStage {
    private static final int AREA1_ROW = 5; //All finals are in allcaps
    private static final int AREA1_COL = 5;
    private static final int AREA2_ROW = 6;
    private static final int AREA2_COL = 3;
    private static final int AREA3_ROW = 7;
    private static final int AREA3_COL = 5;   
    private static final int AREA4_ROW = 3; 
    private static final int AREA4_COL = 6; 
    private static final int AREA5_ROW = 8; //Boss Room
    private static final int AREA5_COL = 7; //Boss Room
    private static int currentArea = 1; // First Area
    private static int PRow = 0; //Starting position in Area 1; Row-side
    private static int PCol = 2; // Starting position in Area 1; Column-side
    private int runes = 0;
    private int areaIndex = 2; //Area Index of the Academy
    Scanner scanner = new Scanner(System.in);
    /**
     * Constructor for AREA2 class; Starts the game.
     */
    public AcademyStage() {
        runGame();
    }


   /**
     * Method to run the game loop.
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
            } else if (currentArea == 4) {
                String[][] area4 = new String[AREA4_ROW][AREA4_COL];
                initializestage(area4);
                displaystage(area4);
                playerMovement(scanner, area4);
            } else if (currentArea == 5) {
                String[][] area5 = new String[AREA5_ROW][AREA5_COL];
                initializestage(area5);
                displaystage(area5);
                playerMovement(scanner, area5);
            }
        }
    }

   /**
     * Method to initialize the stage with empty cells.
     * @param stage The stage to initialize.
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
     * Method to display the stage grid.
     * @param stage The stage to display.
     */
    private void displaystage(String[][] stage) {
        System.out.println("Raya Lucaria Academy");
        for (String[] row : stage) {
            for (String cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    
   
    /**
     * Method to handle player movement.
     * @param scanner Scanner object for user input.
     * @param stage The stage in which the player is moving.
     */
    private void playerMovement(Scanner scanner, String[][] stage) {
        while (true) {
            System.out.print("Enter direction (Use WSAD to move) or M for the menu: ");
            String Sinput = scanner.next().toUpperCase();
            if (movePlayer(Sinput, stage)) {
                break;
            }
            displaystage(stage); // Update the stage after each movement
        }
    }

    
    /**
     * Method to move the player according to the input direction.
     * @param direction The direction in which the player is moving.
     * @param stage The stage in which the player is moving.
     * @return True if the player successfully moves, false otherwise.
     */
    private boolean movePlayer(String direction, String[][] stage) {
        Random r = new Random();
        int low = 0;
        int high = 100;
        int RNum = r.nextInt(high - low + 1) + low;
        int i = r.nextInt(3 - 1 + 1) + low;
        boolean BossDefeat = false;
        boolean Activated = false;
        switch (direction) {
            case "W":
                if (PRow > 0) {
                    stage[PRow][PCol] = "[ ]"; // Clear current position
                    PRow--;
            } else if(currentArea == 3 && PRow == 0 && PCol == 2){
                    System.out.println("Do you want to go to Area 5? (Y/N): ");
                    Scanner scanner = new Scanner(System.in);
                    String choice = scanner.next().toUpperCase();
                    if (choice.equals("Y")) {
                        currentArea = 5;
                        PRow = 7;
                        PCol = 3; // Door position for Area 1
                        return true;
                } 
            } else if (currentArea == 2 && PRow == 0 && PCol == 1){
                System.out.println("Do you want to return to Area 1? (Y/N): ");
                    Scanner scanner = new Scanner(System.in);
                    String choice = scanner.next().toUpperCase();
                    if (choice.equals("Y")) {
                        currentArea = 1;
                        PRow = 4;
                        PCol = 2; // Door position for Area 2
                        return true;
                } 
            } else if (currentArea == 3 && PRow == 0 && PCol == 2){
                System.out.println("Do you want to go to Area 5? (Y/N): ");
                    Scanner scanner = new Scanner(System.in);
                    String choice = scanner.next().toUpperCase();
                    if (choice.equals("Y")) {
                        currentArea = 5;
                        PRow = 4;
                        PCol = 7; // Door position for Area 2
                        return true;
                } 
            }
            else {
                    System.out.println("Cannot go up. The player is at the edge.");
                }
                break;
                
            case "A":
                if (PCol > 0) {
                    stage[PRow][PCol] = "[ ]"; // Clear current position
                    PCol--;
                } 
                else if(currentArea == 3 && PRow == 3 && PCol == 0) {
                    System.out.println("Do you want to return to Area 2? (Y/N): ");
                    Scanner scanner = new Scanner(System.in);
                    String choice = scanner.next().toUpperCase();
                    if (choice.equals("Y")) {
                        currentArea = 2;
                        PRow = 3;
                        PCol = 2; // Door position for Area 2
                        return true;
                    } 
                } else if (currentArea == 4 && PRow == 1 && PCol == 0){
                    System.out.println("Do you want to return to Area 3? (Y/N): ");
                    Scanner scanner = new Scanner(System.in);
                    String choice = scanner.next().toUpperCase();
                    if (choice.equals("Y")) {
                        currentArea = 3;
                        PRow = 3;
                        PCol = 4; // Door position for Area 2
                        return true;
                    } 
                } else if (currentArea == 3 && PRow == 1 && PCol == 0){
                    System.out.println("Cannot go left. The player is at the edge.");
                    return true;
                } 
                else {
                    System.out.println("Cannot go left. The player is at the edge.");
                }
                break;
            case "S":
                if (currentArea == 1 && PRow < AREA1_ROW - 1) {
                    stage[PRow][PCol] = "[ ]"; // Clear current position
                    PRow++;
                } else if (currentArea == 1 && PRow == 4 && PCol == 2) {
                    System.out.println("Do you want to move to Area 2? (Y/N): ");
                    Scanner scanner = new Scanner(System.in);   
                    String choice = scanner.next().toUpperCase();
                    if (choice.equals("Y")) {
                        currentArea = 2;
                        PRow = 0;
                        PCol = 1; // Starting position for Area 2
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
                } else if (currentArea == 5 && PRow == 7 && PCol == 3) {
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
                }  else if (currentArea == 4 && PRow < AREA4_ROW - 1) {
                    stage[PRow][PCol] = "[ ]"; // Clear current position
                    PRow++;
                }  else if (currentArea == 5 && PRow < AREA5_ROW - 1) {
                    stage[PRow][PCol] = "[ ]"; // Clear current position
                    PRow++;
                }  
                else {
                    System.out.println("Cannot go down. The player is at the edge.");
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
                }  else if (currentArea == 4 && PCol < AREA4_COL - 1) {
                    stage[PRow][PCol] = "[ ]"; // Clear current position
                    PCol++;
                }  else if (currentArea == 5 && PCol < AREA5_COL - 1) {
                    stage[PRow][PCol] = "[ ]"; // Clear current position
                    PCol++;
                } else if (currentArea == 2 && PRow == 3 && PCol == 2){
                    System.out.println("Do you want to return to Area 3? (Y/N): ");
                    Scanner scanner = new Scanner(System.in);
                    String choice = scanner.next().toUpperCase();
                    if (choice.equals("Y")) {
                        currentArea = 3;
                        PRow = 3;
                        PCol = 0; // Door position for Area 3
                        return true;
                    } 
                } else if (currentArea == 3 && PRow == 3 && PCol == 4){
                    System.out.println("Do you want to return to Area 4? (Y/N): ");
                    Scanner scanner = new Scanner(System.in);
                    String choice = scanner.next().toUpperCase();
                    if (choice.equals("Y")) {
                        currentArea = 4;
                        PRow = 1;
                        PCol = 0; // Door position for Area 4
                        return true;
                    } 
                } 
                else {
                    System.out.println("Cannot go right. The player is at the edge.");
                }
                break;

            case "M":
                //Put code for the menu here.
                break;

            default:
                System.out.println("Please use WASD to move.");
                break;
        }
        stage[PRow][PCol] = "[X]"; // Update the stage with the new player position;
        System.out.println("Row: " + PRow + "" + "Col: " + PCol);

        // Logic for encounters and events in different areas //
        if (currentArea == 1){
            if (stage[PRow][PCol] == stage[3][1] || stage[PRow][PCol] == stage[3][3]){
                if (RNum <= 25){
                    System.out.println("You found treasure. \n");
                    runes = runes + (areaIndex * r.nextInt(150 - 50 + 1));
                    System.out.println("Runes: " + runes + "\n");
                    Activated = true;
                } else {
                    System.out.println("\nYou fought a monster. Here is its stats: ");
                    System.out.println("Enemy Name: " + EnemyType.getEnemyTypeAcademy(i));
                    System.out.println("Enemy Value: " + (EnemyType.getEnemyTypeIndexAcademy(i) + 1));
                    System.out.println("HP: " + EnemyType.HPValue(i));
                    System.out.println("Attack: " + EnemyType.ATKValue(i) + "\n");
                    Activated = true;
                }
    
            } 
        }
        
        if (currentArea == 2){
            if (stage[PRow][PCol] == stage[1][0] || stage[PRow][PCol] == stage[3][0] || stage[PRow][PCol] == stage[5][0]){
                if (RNum <= 25){
                    System.out.println("You found treasure. \n");
                    runes = runes + (areaIndex * r.nextInt(150 - 50 + 1));
                    System.out.println("Runes: " + runes + "\n");
                    Activated = true;
                } else {
                    System.out.println("\nYou fought a monster. Here is its stats: ");
                    System.out.println("Enemy Name: " + EnemyType.getEnemyTypeAcademy(i));
                    System.out.println("Enemy Value: " + (EnemyType.getEnemyTypeIndexAcademy(i) + 1));
                    System.out.println("HP: " + EnemyType.HPValue(i));
                    System.out.println("Attack: " + EnemyType.ATKValue(i) + "\n");
                    Activated = true;
                }
            } 
        }

        if (currentArea == 3){
            if (stage[PRow][PCol] == stage[1][2] || stage[PRow][PCol] == stage[5][2]){
                if (RNum <= 25){
                    System.out.println("You found treasure. \n");
                    runes = runes + (areaIndex * r.nextInt(150 - 50 + 1));
                    System.out.println("Runes: " + runes + "\n");
                    Activated = true;
                } else {
                    System.out.println("\nYou fought a monster. Here is its stats: ");
                    System.out.println("Enemy Name: " + EnemyType.getEnemyTypeAcademy(i));
                    System.out.println("Enemy Value: " + (EnemyType.getEnemyTypeIndexAcademy(i) + 1));
                    System.out.println("HP: " + EnemyType.HPValue(i));
                    System.out.println("Attack: " + EnemyType.ATKValue(i) + "\n");
                    Activated = true;
                
                }
            }
        }

        if (currentArea == 4){
            if (stage[PRow][PCol] == stage[0][2] || stage[PRow][PCol] == stage[0][4] || stage[PRow][PCol] == stage[2][2] || stage[PRow][PCol] == stage[2][4]){
                if (RNum <= 25){
                    System.out.println("You found treasure. \n");
                    runes = runes + (areaIndex * r.nextInt(150 - 50 + 1));
                    System.out.println("Runes: " + runes + "\n");
                    Activated = true;
                } else {
                    System.out.println("\nYou fought a monster. Here is its stats: ");
                    System.out.println("Enemy Name: " + EnemyType.getEnemyTypeAcademy(i));
                    System.out.println("Enemy Value: " + (EnemyType.getEnemyTypeIndexAcademy(i) + 1));
                    System.out.println("HP: " + EnemyType.HPValue(i));
                    System.out.println("Attack: " + EnemyType.ATKValue(i) + "\n");
                    Activated = true;
                
                }
            }
        }
        
        if (currentArea == 5){
            if (BossDefeat == false && stage[PRow][PCol] == stage[4][3]){
                System.out.println("\nYou now face the boss of this area: " + EnemyType.getBosses(1) + "\n");
                System.out.println("HP: " + 400);
                System.out.println("Attack: " + (r.nextInt(300-200) + 200) + "\n");
                System.out.println("The boss is defeated for now. You can now use the teleporter in the end of the room.\n");
                BossDefeat = true;
            }
        }

        if (currentArea == 3 && stage[PRow][PCol] == stage[6][2] && BossDefeat == true){
            
        }

        return false;
    }


    public static void main(String[] args) {
        new AcademyStage().runGame();
    }
}
