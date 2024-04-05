import java.util.ArrayList;

public class Shop {
    private ArrayList<Weapon> weaponsForSale;

    public Shop() {
        this.weaponsForSale = new ArrayList<>();
        // Initialize the shop with weapons based on the photo
        loadWeaponsForSale();
    }

    private void loadWeaponsForSale() {
        weaponsForSale.add(new Weapon(1, "Short Sword", "Sword", new Statistics(0,13, 15, 15, 15, 15), 1000));
        weaponsForSale.add(new Weapon(2, "Rogier's Rapier", "Sword", new Statistics(10, 18, 35, 25, 35, 35), 8000));
        weaponsForSale.add(new Weapon(3, "Coded Sword", "Sword", new Statistics(20, 21, 40, 35, 40, 40), 4000 ));
        weaponsForSale.add(new Weapon(4, "Sword of Night and Flame", "Sword", new Statistics(30, 25, 55, 45, 55, 55), 8000));
        
        weaponsForSale.add(new Weapon(5, "Uchigatana", "Katana", new Statistics(20, 15, 0, 35, 55, 30, 0), 1875));
        weaponsForSale.add(new Weapon(6, "Moonveil", "Katana", new Statistics(30, 20, 0, 40, 45, 0), 3750));
        weaponsForSale.add(new Weapon(7, "Rivers of Blood", "Katana", new Statistics(40, 25, 0, 45, 60, 0), 7500));
        weaponsForSale.add(new Weapon(8, "hand of Malenia", "Katana", new Statistics(50, 30, 0, 50, 75, 0), 15000));

        weaponsForSale.add(new Weapon(9, "Whip", "Whip", new Statistics(15, 20, 0, 60, 20, 0), 1500));
        weaponsForSale.add(new Weapon(10, "Urumi", "Whip", new Statistics(20, 25, 10, 70, 40, 0), 3000));
        weaponsForSale.add(new Weapon(11, "Thorned Whip", "Whip", new Statistics(30, 30, 0, 80, 50, 40), 5000));
        weaponsForSale.add(new Weapon(12, "Hoslow's Petal Whip", "Whip", new Statistics(35, 35, 20, 90, 55, 20), 10000));

        weaponsForSale.add(new Weapon(13, "Claymore", "Greatsword", new Statistics(30, 25, 55, 45, 55, 55), 3000));
        weaponsForSale.add(new Weapon(14, "Starscourge Greatsword", "Greatsword", new Statistics(30, 25, 55, 45, 55, 55), 6000));
        weaponsForSale.add(new Weapon(15, "Inseparable Sword", "Greatsword", new Statistics(30, 25, 55, 45, 55, 55), 12000));
        weaponsForSale.add(new Weapon(16, "Maliketh's Blackblade", "Greatsword", new Statistics(30, 25, 55, 45, 55, 55), 24000));

        weaponsForSale.add(new Weapon(17, "Astrologer's Staff", "Stave", new Statistics(30, 25, 55, 45, 55, 55), 2000));
        weaponsForSale.add(new Weapon(18, "Alibunauric Staff", "Stave", new Statistics(30, 25, 55, 45, 55, 55), 4000));
        weaponsForSale.add(new Weapon(19, "Staff of the Guilty", "Stave", new Statistics(30, 25, 55, 45, 55, 55), 8000));
        weaponsForSale.add(new Weapon(20, "Carian Regal Scepter", "Stave", new Statistics(30, 25, 55, 45, 55, 55), 16000));

        weaponsForSale.add(new Weapon(21, "Finger Seal", "Seal", new Statistics(30, 25, 55, 45, 55, 55), 2500));
        weaponsForSale.add(new Weapon(22, "Godslayer's Seal", "Seal", new Statistics(30, 25, 55, 45, 55, 55), 5000));
        weaponsForSale.add(new Weapon(23, "Golden Order Seal", "Seal", new Statistics(30, 25, 55, 45, 55, 55), 10000));
        weaponsForSale.add(new Weapon(24, "Dragon Communion Seal", "Seal", new Statistics(30, 25, 55, 45, 55, 55), 15000));

    }

    public void displayWeapons() {
            for (Weapon weapon : weaponsForSale) {
                System.out.println("Index: " + weapon.getIndex());
                System.out.println("Name: " + weapon.getName());
                System.out.println("Type: " + weapon.getType());
                System.out.println("Cost: " + weapon.getRuneCost());
                System.out.println("DEX Required: " + weapon.getStats().getDEX());
              
                System.out.println("Statistics:");
                System.out.println("HP: " + weapon.getStats().getHP());
                System.out.println("END: " + weapon.getStats().getEND());
                System.out.println("STR: " + weapon.getStats().getSTR());
                System.out.println("INT: " + weapon.getStats().getINT());
                System.out.println("FTH: " + weapon.getStats().getFTH());
                System.out.println();
            }
        }


    public boolean purchaseWeapon(Player player, int weaponIndex) {
        Weapon weaponToBuy = getWeaponByIndex(weaponIndex);
        if (weaponToBuy != null && player.getpRunes() >= weaponToBuy.getRuneCost() && player.getpStats().getDEX() > weaponToBuy.getStats().getDEX()) {
            player.getInventory().addWeapon(weaponToBuy); // Add to player inventory
            player.setpRunes(player.getpRunes() - weaponToBuy.getRuneCost()); // Subtract cost
            weaponsForSale.remove(weaponToBuy); // Remove from shop
            return true;
        }
        return false;
    }

    private Weapon getWeaponByIndex(int index) {
        for (Weapon weapon : weaponsForSale) {
            if (weapon.getIndex() == index) {
                return weapon;
            }
        }
        return null;
    }
}