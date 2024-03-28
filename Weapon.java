public class Weapon{

    private String wName;
    private Statistics wStats;
    // private int wRuneCost;

    public Weapon(){

    }

    public String getName(){
        return this.wName;
    }

    public Statistics getStats(){
        return this.wStats;
    }

    /* 
    public int getRuneCost(){
        return this.wRuneCost;
    }
    */

    public void setName(String wName){
        this.wName = wName;
    }

    public void setStats(Statistics wStats){
        this.wStats = wStats;
    }

    /* 
    public void setCost(int wRuneCost){
        this.wRuneCost = wRuneCost;
    }
    */

}