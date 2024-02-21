import java.util.Scanner;
public class CharacterCreation{
    private static String playerName;
    private static String playerClass;
    public static void main (String[] args){
        Scanner sName = new Scanner(System.in);
        int nInput;

        do{
            System.out.println("Character Creation\n\n");
            System.out.println("1. Input Name");
            System.out.println("2. Select Job Class");
            System.out.println("3. Confirm");
            System.out.println("4. Back\n");
            nInput = scanner.nextInt();
            if(nInput < 1 || nInput > 4){
                System.out.println();
            }

            switch(nInput){
                case 1: 
                    inputname(playerName);
                    break;
                case 2:
                    // Getter Methods + if statement? //
                    break;
                case 3:
                // add if statements for name and job class //
                    System.out.println("Are you sure you want to proceed?\n");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    nInput = scanner.nextInt();
                
                    if(nInput == 1){
                        //Proceed to Game Lobby//
                    } else if(nInput == 2){ 
                    break;
                    } else{
                    System.out.println("Invalid Input!");
                    break;
                    }
                case 4:
                    //Go back to Title Screen //
            }

        }while(nInput != 4);
            
    }

    private static String inputName(Scanner sName){
        do{
            System.out.println("Enter your username (25 character limit):\n");
            playerName = sName.nextLine();
                if(playerName.length() != 0 && playerName.length() <= 25){
                    System.out.println("Username is set to: " + playerName);
                    return;
                } else{
                System.out.println("Username is not valid!");
                return null;
                }
        }while(true);
    }

}