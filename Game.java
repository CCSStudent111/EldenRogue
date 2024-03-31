import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Game class manages the game flow, including character creation and game lobby options.
 */
public class Game {
    public Player player = new Player(); // The player instance

    /**
     * Starts the game by displaying the main menu and handling user input.
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int nInput;

        System.out.println("  ______ _     _              _____                   ______ \r\n" + //
                " |  ____| |   | |            |  __ \\                 |  ____|\r\n" + //
                " | |__  | | __| | ___ _ __   | |__) |___   __ _ _   _| |__   \r\n" + //
                " |  __| | |/ _` |/ _ \\ '_ \\  |  _  // _ \\ / _` | | | |  __|  \r\n" + //
                " | |____| | (_| |  __/ | | | | | \\ \\ (_) | (_| | |_| | |____ \r\n" + //
                " |______|_|\\__,_|\\___|_| |_| |_|  \\_\\___/ \\__, |\\__,_|______|\r\n" + //
                "                                           __/ |             \r\n" + //
                "                                          |___/              ");
        System.out.println("                        1. START                                                 ");
        System.out.println("                        2. EXIT                                                  ");

        do {
            System.out.println("Enter your choice: ");
            nInput = scanner.nextInt();
            scanner.nextLine(); 

            if (nInput == 1) {
                characterCreation(scanner);
                break;
            } else if (nInput == 2) {
                System.exit(0);
                break;
            } else {
                System.out.println("Invalid Input!");
            }
        } while (true);

        scanner.close();
    }

    /**
     * Manages character creation, allowing the player to input their name and select a job class.
     * @param scanner The Scanner object for user input.
     */
    private void characterCreation(Scanner scanner){
        int nInput = 0;
        do{

            System.out.println("Player Name: " + player.getpName());
            System.out.println("Selected Job Class: " + player.getpJob());

            Statistics selectedStats = player.getpStats();
            if (selectedStats != null) {
                System.out.println("Statistics:");
                System.out.println("Level: " + selectedStats.getLVL());
                System.out.println("HP: " + selectedStats.getHP());
                System.out.println("DEX: " + selectedStats.getDEX());
                System.out.println("INT: " + selectedStats.getINT());
                System.out.println("END: " + selectedStats.getEND());
                System.out.println("STR: " + selectedStats.getSTR());
                System.out.println("FTH: " + selectedStats.getFTH());
            }

            System.out.println("Character Creation\n\n");
            System.out.println("1. Input Name");
            System.out.println("2. Select Job Class");
            System.out.println("3. Confirm");
            System.out.println("4. Back\n");
            nInput = scanner.nextInt();
            scanner.nextLine();
        
            if(nInput < 1 || nInput > 4){
             System.out.println("Invalid Input!");
            }

            switch(nInput){
            case 1: 
                inputName(scanner);
                break;
            case 2:
                selectJobClass(scanner);
                break;           
            case 3:
                handleConfirmation(scanner);
                break;
            case 4:
                handleBack(scanner, this);
                break;
            default:
                System.out.println("Invalid Input!");
                break;
            }

        }while(true);
    }

    /**
     * Allows the player to input their name.
     * @param scanner The Scanner object for user input.
     */
    private void inputName(Scanner scanner) {
        String sInput;
        do {
            System.out.println("Enter your username (25 character limit):\n");
            sInput = scanner.nextLine();
            if (sInput.length() != 0 && sInput.length() <= 25) {
                System.out.println("Username is set to: " + sInput);
                player.setpName(sInput);
                break;
            } else {
                System.out.println("Username is not valid!");
            }
        } while (true);
    }

    /**
     * Handles the confirmation of character creation.
     * @param scanner The Scanner object for user input.
     */
    private void handleConfirmation(Scanner scanner) {
        int nConfirm;
        do {
            System.out.println("Are you sure you want to proceed?\n");
            System.out.println("1. Yes");
            System.out.println("2. No");

            nConfirm = scanner.nextInt();
            scanner.nextLine(); 

            if (nConfirm == 1) {
                gameLobby(scanner);
                break;
            } else if (nConfirm == 2) {
                break;
            } else {
                System.out.println("Invalid Input!");
            }
        } while (true);
    }

    /**
     * Handles the back option during character creation.
     * @param scanner The Scanner object for user input.
     * @param game The Game object to return to.
     */
    private void handleBack(Scanner scanner, Game game) {
        int nConfirm;
        do {
            System.out.println("Are you sure you want to go back?\n");
            System.out.println("1. Yes");
            System.out.println("2. No");

            nConfirm = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (nConfirm == 1) {
                game.start();
                break;
            } else if (nConfirm == 2) {
                break;
            } else {
                System.out.println("Invalid Input!");
            }
        } while (true);
    }

    /**
     * Allows the player to select their job class.
     * @param scanner The Scanner object for user input.
     */
    private void selectJobClass(Scanner scanner){
        int nChoice;
        ArrayList<JobClass> jobclass = JobClass.getJobClass();
        JobClass.displayJobClasses();
            do{

                System.out.println("Select your Job Class (1-" + jobclass.size() + "): ");
                nChoice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if (nChoice >= 1 && nChoice <= jobclass.size()) {
                    for (JobClass job : jobclass) {
                        if (job.getIndex() == nChoice) {
                            player.setpJob(job);
                            player.setpStats(job.getStats());
                            System.out.println("You have selected: " + job.getClassName());
                            System.out.println("Statistics set to the class's default.");
                            break;
                        }
                    }
                    break;
                } else {
                    System.out.println("Invalid Input!");
                }   
            } while (true);
        }

    /**
     * Manages the game lobby, providing options for the player to interact with the game.
     * @param scanner The Scanner object for user input.
     */
    private void gameLobby(Scanner scanner){
        int nInput = 0;
        do{
            
            System.out.println("Player Name: " + player.getpName());
            System.out.println("Selected Job Class: " + player.getpJob());

            Statistics selectedStats = player.getpStats();
            if (selectedStats != null) {
                System.out.println("Statistics:");
                System.out.println("Level: " + selectedStats.getLVL());
                System.out.println("HP: " + selectedStats.getHP());
                System.out.println("DEX: " + selectedStats.getDEX());
                System.out.println("INT: " + selectedStats.getINT());
                System.out.println("END: " + selectedStats.getEND());
                System.out.println("STR: " + selectedStats.getSTR());
                System.out.println("FTH: " + selectedStats.getFTH());
            }

            System.out.println("Game Lobby\n\n");
            System.out.println("1. Fast Travel");
            System.out.println("2. Level Up");
            System.out.println("3. Inventory");
            System.out.println("4. Shop");
            System.out.println("5. Quit\n");
            nInput = scanner.nextInt();
            scanner.nextLine();
        
            if(nInput < 1 || nInput > 5){
             System.out.println("Invalid Input!");
            }

            switch(nInput){
            case 1: 
                int nArea;
                do{
                    System.out.println("Which area would you want to fast travel to:");
                    System.out.println("1. Stormveil Castle");
                    System.out.println("2. Raya Lucaria Academy");
                    System.out.println("3. The Elden Throne");
                    nArea = scanner.nextInt();
                    scanner.nextLine();
                } while (nArea <= 0 && nArea >=4);

               
                if(nArea == 1){
                    new CastleStage().runGame();
                } else if (nArea == 2){
                    new AcademyStage().runGame();
                } else if (nArea == 3){
                    //Area3
                } else {
                    System.out.println("Invalid Input!");
                }

                
                break;
            case 2:
                
                break;           
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
               System.exit(0); // Debugging
                break;
            default:
                System.out.println("Invalid Input!");
                break;
            }

        }while(true);
    }
}
            
    

