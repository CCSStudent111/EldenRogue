/**
 * This class represents a Player object with a name, statistics, and job class.
 */
public class Player{
    // The name of the player
    private String pName;
    // The statistics of the player
    private Statistics pStats;
    // The job class of the player
    private JobClass pJob;
    // The number of runes the player has
    private int pRunes;
    // The inventory of the player
    private Inventory pInventory;

    private Weapon equippedWeapon;


     /**
     * Default constructor for Player class.
     */
    public Player(){
    
    }

     /**
     * Getter method for retrieving the name of the player.
     * @return The name of the player.
     */
    public String getpName(){
        return pName;
    }

    /**
     * Getter method for retrieving the statistics of the player.
     * @return The statistics of the player.
     */
    public Statistics getpStats(){
        return pStats;
    }

    /**
     * Getter method for retrieving the job class of the player.
     * @return The job class of the player.
     */
    public JobClass getpJob(){
        return pJob;
    }

    public int getpRunes(){
        return pRunes;
    }

    public Inventory getInventory(){
        return pInventory;
    }

    public Weapon getequippedWeapon(){
        return equippedWeapon;
    }

    /**
     * Setter method for setting the name of the player.
     * @param pName The name to set for the player.
     */
    public void setpName(String pName){
        this.pName = pName;
    }

    /**
     * Setter method for setting the statistics of the player.
     * @param pStats The statistics to set for the player.
     */
    public void setpStats(Statistics pStats){
        this.pStats = pStats;
    }

    /**
     * Setter method for setting the job class of the player.
     * @param pJob The job class to set for the player.
     */
    public void setpJob(JobClass pJob){
        this.pJob = pJob;
    }

    public void setpRunes(int pRunes){
        this.pRunes = pRunes;
    }

    public void setInventory(){
        this.pInventory = pInventory;
    }


    public boolean equipWeapon(int nIndex) {
        Weapon weapon = this.pInventory.getWeaponByIndex(nIndex);
        if (weapon == null) {
            System.out.println("Weapon not found in inventory.");
            return false;
        }
        if (this.pStats.getDEX() >= weapon.getStats().getDEX()) {
            this.equippedWeapon = weapon;
            System.out.println("Weapon equipped successfully.");
            return true;
        } else {
            System.out.println("You don't meet the DEX requirement to equip this weapon.");
            return false;
        }
    }


}





