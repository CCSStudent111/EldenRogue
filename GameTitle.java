import java.util.Scanner;


public class GameTitle{
    public static void main(String args[]){
        int nInput;
        Scanner myScn = new Scanner (System.in);

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

    do{
    System.out.println("Enter your choice: ");
    nInput = myScn.nextInt();

    if (nInput == 1){
        System.out.println("Dummy Text for Character Creation");
        myScn.close();
    }

    else if (nInput == 2){
        myScn.close();
        System.exit(2);
    }
    }  while (nInput != 1 && nInput != 2);

    }

}