import java.util.Scanner;

public class Game {
    private static String playerName;
    private static String playerClass;

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
                break;
            } else {
                System.out.println("Invalid Input!");
            }
        } while (true);

        scanner.close();
    }

    private void characterCreation(Scanner scanner){
    do{
        System.out.println("Character Creation\n\n");
        System.out.println("1. Input Name");
        System.out.println("2. Select Job Class");
        System.out.println("3. Confirm");
        System.out.println("4. Back\n");
        int nInput = scanner.nextInt();
        scanner.nextLine();
        
        if(nInput < 1 || nInput > 4){
            System.out.println("Invalid Input!");
        }

        switch(nInput){
        case 1: 
            inputName(scanner);
            break;
        case 2:
            // Getter Methods + if statement? //
            break;
        case 3:
            handleConfirmation(scanner);
        case 4:
            handleBack(scanner);
            }
        }while(nInput != 3 || nInput !=4);
    }

    private static void inputName(Scanner scanner) {
        do {
            System.out.println("Enter your username (25 character limit):\n");
            playerName = scanner.nextLine();
            if (playerName.length() != 0 && playerName.length() <= 25) {
                System.out.println("Username is set to: " + playerName);
                handleConfirmation(scanner);
                break;
            } else {
                System.out.println("Username is not valid!");
            }
        } while (true);
    }

    private static void handleConfirmation(Scanner scanner) {
        int nConfirm;
        do {
            System.out.println("Are you sure you want to proceed?\n");
            System.out.println("1. Yes");
            System.out.println("2. No");

            nConfirm = scanner.nextInt();
            scanner.nextLine(); 

            if (nConfirm == 1) {
                // Proceed to Game Lobby
                break;
            } else if (nConfirm == 2) {
                break;
            } else {
                System.out.println("Invalid Input!");
            }
        } while (true);
    }

    private static void handleBack(Scanner scanner) {
        int nConfirm;
        do {
            System.out.println("Are you sure you want to go back?\n");
            System.out.println("1. Yes");
            System.out.println("2. No");

            nConfirm = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (nConfirm == 1) {
                start(scanner);
                break;
            } else if (nConfirm == 2) {
                break;
            } else {
                System.out.println("Invalid Input!");
            }
        } while (true);
    }
}
