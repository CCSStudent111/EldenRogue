import java.util.ArrayList;

public class Inventory {
    private ArrayList<Weapon> weapons;

    public Inventory() {
        this.weapons = new ArrayList<>();
    }

    public void menus(scanner){
        System.out.println("1. Select Weapon\n");
        System.out.println("2. Back\n");

        nInput = scanner.nextInt();
        scanner.nextLine();

        if(nInput == 1){
            
        } else{
            game.gameLobby(scanner);
        }
    }

    public void displayInventory(){

        for (Weapon weapon : weapons ) {
            System.out.println("Index: " + weapon.getIndex());
            System.out.println("Weapon Name: " + weapon.getName());
            System.out.println("Weapon Type: " + weapon.getType());
            // System.out.println("Rune Cost: " + weapon.getRuneCost());
            System.out.println("DEX Required: " + weapon.getStats().getDEX());
            //Need Weapon Image later on
            System.out.println("Statistics:");
            System.out.println("Level: " + weapon.getStats().getLVL());
            System.out.println("Weapon HP: " + weapon.getStats().getHP());
            System.out.println("DEX: " + weapon.getStats().getDEX());
            System.out.println("INT: " + weapon.getStats().getINT());
            System.out.println("END: " + weapon.getStats().getEND());
            System.out.println("STR: " + weapon.getStats().getSTR());
            System.out.println("FTH: " + weapon.getStats().getFTH());
            System.out.println();
        }
    }

    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }

    public void addToInventory(Weapon weapon) {
        this.addWeapon(weapon);
    }


}