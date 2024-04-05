import java.util.ArrayList;

public class Inventory {
    private ArrayList<Weapon> weapons;

    public Inventory() {
        this.weapons = new ArrayList<>();
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

    public Weapon getWeaponByIndex(int index) {
        for (Weapon weapon : this.weapons) {
            if (weapon.getIndex() == index) {
                return weapon;
            }
        }
        return null;
    }

    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }



}