import java.util.Scanner;

/**
 * This class allows the user to create a character by inputting a name and selecting a job class.
 */
public class CharacterCreation{
    private static String playerName;
    private static String playerClass;

    /**
     * Main method to run the character creation process.
     * @param args Command-line arguments (not used).
     */
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int nInput;

        do{
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
                JobClass.displayJobClasses();
                break;
            case 3:
                handleConfirmation(scanner);
                }
        }while(nInput != 4);

        scanner.close();
    }
    /**
     * Method to input the character's name.
     * @param scanner Scanner object for user input.
     */
    private static void inputName(Scanner scanner){
        do{
            System.out.println("Enter your username (25 character limit):\n");
            playerName = scanner.nextLine();
                if(playerName.length() != 0 && playerName.length() <= 25){
                    System.out.println("Username is set to: " + playerName);
                    break;
                } else{
                System.out.println("Username is not valid!");
                }
        }while(true);
        }
    /**
     * Method to handle the confirmation to proceed with character creation.
     * @param scanner Scanner object for user input.
     */
    private static void handleConfirmation(Scanner scanner){
        int nConfirm;
        do{
            System.out.println("Are you sure you want to proceed?\n");
            System.out.println("1. Yes");
            System.out.println("2. No");
            
            nConfirm = scanner.nextInt();
                if(nConfirm == 1){
                //Proceed to Game Lobby//
                } else if(nConfirm == 2){ 
                    break;
                } else{
                    System.out.println("Invalid Input!");
                } 
        }while(true);
        }

}