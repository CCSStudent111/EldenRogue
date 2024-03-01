public class Player{
    private String pName;
    private Statistics pStats;
    private JobClass pJob;


    public Player(){
    
    }

    public String getpName(){
        return pName;
    }

    public Statistics getpStats(){
        return pStats;
    }

    public JobClass getpJob(){
        return pJob;
    }

    public void setpName(String pName){
        this.pName = pName;
    }

    public void setpStats(Statistics pStats){
        this.pStats = pStats;
    }

    public void setpJob(JobClass pJob){
        this.pJob = pJob;
    }

    /* public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Player Name: ").append(pName).append("\n");
        builder.append("Selected Job Class: ").append(pJob).append("\n");
        if (pStats != null) {
            builder.append("Statistics:\n");
            builder.append("Level: ").append(pStats.getLVL()).append("\n");
            builder.append("HP: ").append(pStats.getHP()).append("\n");
            builder.append("DEX: ").append(pStats.getDEX()).append("\n");
            builder.append("INT: ").append(pStats.getINT()).append("\n");
            builder.append("END: ").append(pStats.getEND()).append("\n");
            builder.append("STR: ").append(pStats.getSTR()).append("\n");
            builder.append("FTH: ").append(pStats.getFTH()).append("\n");
        }
        return builder.toString(); 
    } */

}