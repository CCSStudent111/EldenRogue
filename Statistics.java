/**
 * This class represents the statistics of a character, including level, HP, Dexterity (DEX), Intelligence (INT), 
 * Endurance (END), Strength (STR), and Faith (FTH).
 */
public class Statistics{
    private int nLVL;     // The level of the character
    private int nHP;    // The hit points of the character
    private int nDEX;    // The dexterity of the character
    private int nINT;    // The intelligence of the character
    private int nEND;    // The endurance of the character
    private int nSTR;    // The strength of the character
    private int nFTH;    // The faith of the character
    // private int nRunes;
    
    /**
     * Constructor to initialize the statistics of a character.
     * @param nLVL The level of the character.
     * @param nHP The hit points of the character.
     * @param nDEX The dexterity of the character.
     * @param nINT The intelligence of the character.
     * @param nEND The endurance of the character.
     * @param nSTR The strength of the character.
     * @param nFTH The faith of the character.
     */
    public Statistics(int nLVL, int nHP, int nDEX, int nINT, int nEND, int nSTR, int nFTH) {
        // this.nRunes = nRunes;
        this.nLVL = nLVL;
        this.nHP = nHP;
        this.nDEX = nDEX;
        this.nINT = nINT;
        this.nEND = nEND;
        this.nSTR = nSTR;
        this.nFTH = nFTH;
    }

    /*
    public int getRunes() {
        return nRunes;
    }
    */

    /**
     * Getter method to retrieve the level of the character.
     * @return The level of the character.
     */
    public int getLVL() {
        return nLVL;
    }

    /**
     * Getter method to retrieve the hit points of the character.
     * @return The hit points of the character.
     */
    public int getHP() {
        return nHP;
    }

    /**
     * Getter method to retrieve the dexterity of the character.
     * @return The dexterity of the character.
     */
    public int getDEX() {
        return nDEX;
    }

    /**
     * Getter method to retrieve the intelligence of the character.
     * @return The intelligence of the character.
     */
    public int getINT() {
        return nINT;
    }

    /**
     * Getter method to retrieve the endurance of the character.
     * @return The endurance of the character.
     */
    public int getEND() {
        return nEND;
    }

    /**
     * Getter method to retrieve the strength of the character.
     * @return The strength of the character.
     */
    public int getSTR() {
        return nSTR;
    }

    /**
     * Getter method to retrieve the faith of the character.
     * @return The faith of the character.
     */
    public int getFTH() {
        return nFTH;
    }
    
    /*
    public void setRunes(int nRunes) {
        this.nRunes = nRunes;
    }
    */

    /**
     * Getter method to retrieve the level of the character.
     * @return The level of the character.
     */
    public void setLVL(int nLVL) {
        this.nLVL = nLVL;
    }

    /**
     * Getter method to retrieve the hit points of the character.
     * @return The hit points of the character.
     */
    public void setHP(int nHP) {
        this.nHP = nHP;
    }

    /**
     * Getter method to retrieve the dexterity of the character.
     * @return The dexterity of the character.
     */
    public void setDEX(int nDEX) {
        this.nDEX = nDEX;
    }

    /**
     * Getter method to retrieve the intelligence of the character.
     * @return The intelligence of the character.
     */
    public void setINT(int nINT) {
        this.nINT = nINT;
    }

    /**
     * Getter method to retrieve the endurance of the character.
     * @return The endurance of the character.
     */
    public void setEND(int nEND) {
        this.nEND = nEND;
    }

    /**
     * Getter method to retrieve the strength of the character.
     * @return The strength of the character.
     */
    public void setSTR(int nSTR) {
        this.nSTR = nSTR;
    }

    /**
     * Getter method to retrieve the faith of the character.
     * @return The faith of the character.
     */
    public void setFTH(int nFTH) {
        this.nFTH = nFTH;
    }

}
