public class Prophet{
    private String className;
    private int Health;
    private int Strength;
    private int Endurance;
    private int Dexterity;
    private int Intelligence;
    private int Faith;
    //private int Level


    public Prophet(String cName, int cHP, int cStr, int cEnd, int cInt, int cDex, int cFth){
        this.className = cName;
        this.Health = cHP;
        this.Strength = cStr;
        this.Endurance = cEnd;
        this.Dexterity = cDex;
        this.Intelligence = cInt;
        this.Faith = cFth;
        //this.cLvl = Level;
        //Stats
        cName = "Prophet";
        cHP = 10;
        cStr = 11;
        cEnd = 8;
        cDex = 10;
        cInt = 7;
        cFth = 16;
        //cLvl = 7;

    }

    public String getcName(){
        return cName;
    }

    public int getcHP(){
        return cHP;
    }

    public int getcStr(){
        return cStr;
    }

    public int getcEnd(){
        return cEnd;
    }

    public int getcDex(){
        return cDex;
    }

    public int getcInt(){
        return cInt;
    }
    public int getcFth(){
        return cFth;
    }

}
