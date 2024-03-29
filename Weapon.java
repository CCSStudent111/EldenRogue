public class Weapon{

    private int wIndex;
    private String wName;
    private String wType;
    private Statistics wStats;
    private int wRuneCost;

    public Weapon(){
        this.wIndex = wIndex;
        this.wName = wName;
        this.wType = wType;
        this.wStats = wStats;
        this.wRuneCost = wRuneCost;
    }

    public int getIndex(){
        return this.wIndex;
    }

    public String getName(){
        return this.wName;
    }

    public String getType(){
        return this.wType;
    }

    public Statistics getStats(){
        return this.wStats;
    }

    public int getRuneCost(){
        return this.wRuneCost;
    }

    public void setIndex(int wIndex){
        this.wIndex = wIndex;
    }

    public void setName(String wName){
        this.wName = wName;
    }

    public void setType(String wType){
        this.wType = wType;
    }

    public void setStats(Statistics wStats){
        this.wStats = wStats;
    }

    public void setRuneCost(int wRuneCost){
        this.wRuneCost = wRuneCost;
    }
    

}