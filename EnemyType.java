import java.util.Arrays;
import java.util.Random;

/**
 * This class provides functionality related to enemy types and bosses in the game.
 */
public class EnemyType{
    private static final String[] ENEMY_TYPES_CASTLE = {"Godrick Soldier", "Godrick Archer", "Godrick Knight"}; 
    private static final String[] ENEMY_TYPES_ACADEMY = {"Living Jar", "Glintstone Sorcerer", "Battlemage"};
    private static final String[] BOSSES = {"Godrick the Grafted", "Rennala, Queen of the Full Moon", "The Elden Beast"};


    public static String getEnemyType(int i, int index){
        if (index == 1){
            if (i >= 0 && i < ENEMY_TYPES_CASTLE.length) {
                return ENEMY_TYPES_CASTLE[i];
            } else {
                return "Unknown";
            }
        } else if (index == 2){
            if (i >= 0 && i < ENEMY_TYPES_ACADEMY.length) {
                return ENEMY_TYPES_ACADEMY[i];
            } else {
                return "Unknown";
            }
        } else {
            return "Unknown";
        }
    }

    public static int getEnemyTypeIndex(int i, int index){
        if (index == 1){
            if (i >= 0 && i < ENEMY_TYPES_CASTLE.length) {
                return Arrays.asList(ENEMY_TYPES_CASTLE).indexOf(ENEMY_TYPES_CASTLE[i]);
            } 
            
            return -1; 
        } else if (index == 2){
            if (i >= 0 && i < ENEMY_TYPES_ACADEMY.length) {
                return Arrays.asList(ENEMY_TYPES_ACADEMY).indexOf(ENEMY_TYPES_ACADEMY[i]);
            } 
            
            return -1; 
        } else {
            return -1;
        }
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

        if (i == 0){ //Type 1
           return (r.nextInt(30-20) + 20);
        } else if (i == 1){ // Type 2
            return (r.nextInt(35-25) + 25);
        } else if (i == 2){ //Type 3
            return (r.nextInt(80-70) + 70);
        } else if (i == 3) { //Godrick
            return 200;
        } else if (i == 4){ // Rennala
            return 400;
        } else if (i == 5){ //Elden Beast
            return 800;
        }

        else {
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

        if (i == 0){ // Type 1
            return (r.nextInt(80 - 70) + 70);
        } else if (i == 1){ // Type 2
            return (r.nextInt(120 - 110) + 110);
        } else if (i == 2){ // Type 3
            return (r.nextInt(130 - 120) + 120);
        } else if (i == 3){ // Godrick
            return (r.nextInt(300 - 150) + 150);
        } else if (i == 4){ // Rennala
            return (r.nextInt(300 - 200) + 200);
        } else if (i == 5){ //Elden Beast
            return (r.nextInt(500 - 250) + 250);
        } else {
            return -1;
        }
    }

    /**
     *  Returns a physical defense value based on the enemy type index.
     * @param i The index of the enemy type.
     * @return The generated DEF value.
     */
    public static float PhysDefense(int i){
        if (i == 0){
            return 0.20f;
        } else if (i == 1){
            return 0.50f;
        } else if (i == 2){
            return 0.25f;
        } else {
            return -1;
        }
    }

    public static float SorceryDefense(int i){
        if (i == 0){
            return 0.15f;
        } else if (i == 1){
            return 0.15f;
        } else if (i == 2){
            return 0.25f;
        } else {
            return -1;
        }
    }

    public static float IncanDefense(int i){
        if (i == 0){
            return 0.10f;
        } else if (i == 1){
            return 0.20f;
        } else if (i == 2){
            return 0.20f;
        } else {
            return -1;
        }
    }
    
}