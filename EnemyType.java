import java.util.Arrays;
import java.util.Random;

/**
 * The EnemyType class contains methods to retrieve enemy types, bosses, and their corresponding HP and
 * ATK values for a game.
 */
public class EnemyType{
    private static final String[] ENEMY_TYPES_CASTLE = {"Godrick Soldier", "Godrick Archer", "Godrick Knight"}; 
    private static final String[] ENEMY_TYPES_ACADEMY = {"Living Jar", "Glintstone Sorcerer", "Battlemage"};
    private static final String[] BOSSES = {"Godrick the Grafted", "Rennala, Queen of the Full Moon", "The Elden Beast"};



    /**
     * This Java function returns the enemy type at a specified index from a predefined array or
     * "Unknown" if the index is out of bounds.
     * 
     * @param i The parameter `i` in the `getEnemyTypeCastle` method is used as an index to retrieve an
     * enemy type from the `ENEMY_TYPES_CASTLE` array.
     * @return The method `getEnemyTypeCastle` returns the enemy type at index `i` from the
     * `ENEMY_TYPES_CASTLE` array. If the index `i` is within the valid range of the array, it returns
     * the enemy type at that index. Otherwise, it returns "Unknown".
     */
    public static String getEnemyTypeCastle(int i){
        if (i >= 0 && i < ENEMY_TYPES_CASTLE.length) {
            return ENEMY_TYPES_CASTLE[i];
        } else {
            return "Unknown";
        }
    }

    /**
     * The function `getEnemyTypeIndexCastle` returns the index of a specific enemy type in an array if
     * it exists.
     * 
     * @param i The parameter `i` in the `getEnemyTypeIndexCastle` method represents the index of an
     * enemy type in the `ENEMY_TYPES_CASTLE` array for which you want to retrieve the index.
     * @return The method `getEnemyTypeIndexCastle` returns the index of the enemy type in the
     * `ENEMY_TYPES_CASTLE` array based on the input `i`. If `i` is within the valid range of indices
     * for the array, it returns the index of the enemy type at that position. If `i` is outside the
     * valid range, it returns -1.
     */
    public static int getEnemyTypeIndexCastle(int i) {
        if (i >= 0 && i < ENEMY_TYPES_CASTLE.length) {
            return Arrays.asList(ENEMY_TYPES_CASTLE).indexOf(ENEMY_TYPES_CASTLE[i]);
        } 
        
        return -1; 
    }


    /**
     * The function `getEnemyTypeAcademy` returns the enemy type based on the index provided, or
     * "Unknown" if the index is out of bounds.
     * 
     * @param i The parameter `i` in the `getEnemyTypeAcademy` method is an integer representing the
     * index of the enemy type in the `ENEMY_TYPES_ACADEMY` array that you want to retrieve.
     * @return The method `getEnemyTypeAcademy` returns the enemy type at index `i` from the
     * `ENEMY_TYPES_ACADEMY` array if the index is within bounds. If the index is out of bounds, it
     * returns "Unknown".
     */
    public static String getEnemyTypeAcademy(int i){
        if (i >= 0 && i < ENEMY_TYPES_ACADEMY.length) {
            return ENEMY_TYPES_ACADEMY[i];
        } else {
            return "Unknown";
        }
    }

    /**
     * The function `getEnemyTypeIndexAcademy` returns the index of a specified enemy type in an array
     * if it exists.
     * 
     * @param i The parameter `i` in the `getEnemyTypeIndexAcademy` method represents the index of an
     * enemy type in the array `ENEMY_TYPES_ACADEMY`. The method checks if the index `i` is within the
     * valid range of the array and then returns the index of the enemy
     * @return The method `getEnemyTypeIndexAcademy` returns the index of the enemy type in the
     * `ENEMY_TYPES_ACADEMY` array based on the input `i`. If `i` is within the valid range of indices
     * for the array, it returns the index of the enemy type at that position. If `i` is outside the
     * valid range, it returns -1.
     */
    public static int getEnemyTypeIndexAcademy(int i) {
        if (i >= 0 && i < ENEMY_TYPES_ACADEMY.length) {
            return Arrays.asList(ENEMY_TYPES_ACADEMY).indexOf(ENEMY_TYPES_ACADEMY[i]);
        } 
        
        return -1; 
    }

    /**
     * The function `getBosses` returns the name of a boss based on the index provided, or "Unknown" if
     * the index is out of bounds.
     * 
     * @param i The parameter `i` is an integer representing the index of a boss in an array called
     * `BOSSES`. The `getBosses` method returns the name of the boss at the specified index if it is
     * within the valid range of the array. If the index is out of bounds, it
     * @return The method `getBosses(int i)` returns the name of a boss at the specified index `i` from
     * the array `BOSSES`. If the index is within the valid range of the array, it returns the name of
     * the boss at that index. Otherwise, it returns "Unknown".
     */
    public static String getBosses(int i){
        if (i >= 0 && i < BOSSES.length){
            return BOSSES[i];
        } else{
            return "Unknown";
        }
    }

    /**
     * The HPValue function generates random HP values based on the input parameter i.
     * 
     * @param i The parameter `i` in the `HPValue` method is used to determine the range of random
     * values returned based on the following conditions:
     * @return The HP (Health Points) value based on the input parameter `i` is being returned. The HP
     * value is generated randomly within a specific range based on the value of `i`. If `i` is 0, a
     * random value between 20 and 29 is returned. If `i` is 1, a random value between 25 and 34 is
     * returned.
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
     * This Java function generates random attack values based on the input parameter i.
     * 
     * @param i The `i` parameter in the `ATKValue` method is used to determine the range from which a
     * random attack value is generated based on the following conditions:
     * @return The ATKValue method returns an integer value based on the input parameter `i`. If `i` is
     * 0, it returns a random integer between 70 and 79. If `i` is 1, it returns a random integer
     * between 110 and 119. If `i` is 2, it returns a random integer between 120 and 129.
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