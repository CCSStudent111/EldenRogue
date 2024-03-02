import java.util.Arrays;
import java.util.Random;

/**
 * This class provides functionality related to enemy types and bosses in the game.
 */
public class EnemyType{
    private static final String[] ENEMY_TYPES_CASTLE = {"Godrick Soldier", "Godrick Archer", "Godrick Knight"}; 
    private static final String[] ENEMY_TYPES_ACADEMY = {"Living Jar", "Glintstone Sorcerer", "Battlemage"};
    private static final String[] BOSSES = {"Godrick the Grafted", "Rennala, Queen of the Full Moon", "The Elden Beast"};



    /**
     * Returns the enemy type in the Castle area based on the index.
     * @param i The index of the enemy type.
     * @return The enemy type.
     */
    public static String getEnemyTypeCastle(int i){
        if (i >= 0 && i < ENEMY_TYPES_CASTLE.length) {
            return ENEMY_TYPES_CASTLE[i];
        } else {
            return "Unknown";
        }
    }

    /**
     * Returns the index of the enemy type in the Castle area.
     * @param i The index of the enemy type.
     * @return The index of the enemy type.
     */
    public static int getEnemyTypeIndexCastle(int i) {
        if (i >= 0 && i < ENEMY_TYPES_CASTLE.length) {
            return Arrays.asList(ENEMY_TYPES_CASTLE).indexOf(ENEMY_TYPES_CASTLE[i]);
        } 
        
        return -1; 
    }


    /**
     * Returns the enemy type in the Academy area based on the index.
     * @param i The index of the enemy type.
     * @return The enemy type.
     */
    public static String getEnemyTypeAcademy(int i){
        if (i >= 0 && i < ENEMY_TYPES_ACADEMY.length) {
            return ENEMY_TYPES_ACADEMY[i];
        } else {
            return "Unknown";
        }
    }

    /**
     * Returns the index of the enemy type in the Academy area.
     * @param i The index of the enemy type.
     * @return The index of the enemy type.
     */
    public static int getEnemyTypeIndexAcademy(int i) {
        if (i >= 0 && i < ENEMY_TYPES_ACADEMY.length) {
            return Arrays.asList(ENEMY_TYPES_ACADEMY).indexOf(ENEMY_TYPES_ACADEMY[i]);
        } 
        
        return -1; 
    }

    /**
     * Returns the name of the boss based on the index.
     * @param i The index of the boss.
     * @return The boss name.
     */
    public static String getBosses(int i){
        if (i >= 0 && i < BOSSES.length){
            return BOSSES[i];
        } else{
            return "Unknown";
        }
    }

    /**
     * Generates and returns a random HP value based on the enemy type index.
     * @param i The index of the enemy type.
     * @return The generated HP value.
     */
    public static int HPValue(int i){
        Random r = new Random();

        if (i == 0){
           return (r.nextInt(30-20) + 20);
        } else if (i == 1){
            return (r.nextInt(35-25) + 25);
        } else if (i == 2){
            return (r.nextInt(80-70) + 70);
        } else {
            return -1;
        }
    }
    
    /**
     * Generates and returns a random ATK value based on the enemy type index.
     * @param i The index of the enemy type.
     * @return The generated ATK value.
     */
    public static int ATKValue(int i){
        Random r= new Random();

        if (i == 0){
            return (r.nextInt(80 - 70) + 70);
        } else if (i == 1){
            return (r.nextInt(120 - 110) + 110);
        } else if (i == 2){
            return (r.nextInt(130 - 120) + 120);
        } else {
            return -1;
        }
    }

}