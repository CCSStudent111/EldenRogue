import java.util.ArrayList;

public class JobClass{
    private String className;
    private Statistics stats;
<<<<<<< Updated upstream

    JobClass(String className, Statistics stats){
        this.className = className;
        this.stats = stats;
    }

    public int getLevel(){
        return stats.getLevel();
    }

    public int getHP(){
        return stats.getHP();
    }

    public int getDEX(){
        return stats.getDEX();
    }

    public int getINT(){
        return stats.getINT();
    }

    public int getEND(){
        return stats.getEND();
    }

    public int getSTR(){
        return stats.getSTR();
    }

    public int getFTH(){
        return stats.getFTH();
    }

    public static void main(String[] args){
        Statistics vagabondStats = new Statistics(9, 15, 13, 9, 11, 14, 9);
        JobClass Vagabond = new JobClass("Vagabond", vagabondStats);

        Statistics samuraiStats = new Statistics(9, 12, 15, 9, 13, 12, 8);
        JobClass Samurai = new JobClass("Samurai", samuraiStats);

        Statistics warriorStats = new Statistics(8, 11, 16, 10, 11, 10, 8);
        JobClass Warrior = new JobClass("Warrior", warriorStats);

        Statistics heroStats = new Statistics(7, 14, 9, 7, 12, 16, 8);
        JobClass Hero = new JobClass("Hero", heroStats);

        Statistics astrologerStats = new Statistics(6, 9, 12, 16, 9, 8, 7);
        JobClass Astrologer = new JobClass("Astrologer", astrologerStats);

        Statistics prophetStats = new Statistics(7, 10, 10, 7, 8, 11, 16);
        JobClass Prophet = new JobClass("Prophet", prophetStats);
=======
    private int index;
    private static ArrayList<JobClass> jobClass = new ArrayList<>();


    public JobClass(String className, Statistics stats, int index){
        this.className = className;
        this.stats = stats;
        this.index = index;
        //jobClass.add(this);
        
    }

    static {
        Statistics vagabondStat = new Statistics(9, 15, 13, 9, 11, 14, 9);
        Statistics samuraiStat = new Statistics(9, 12, 15, 9, 13, 12, 8);
        Statistics warriorStat = new Statistics(8, 11, 16, 10, 11, 10, 8);
        Statistics heroStat = new Statistics(7, 14, 9, 7, 12, 16, 8);
        Statistics astrologerStat = new Statistics(6, 9, 12, 16, 9, 8, 7);
        Statistics prophetStat = new Statistics(7, 10, 10, 7, 8, 11, 16);
>>>>>>> Stashed changes

        jobClass.add(new JobClass("Vagabond", vagabondStat, 1));
        jobClass.add(new JobClass("Samurai", samuraiStat, 2));
        jobClass.add(new JobClass("Warrior", warriorStat, 3));
        jobClass.add(new JobClass("Hero", heroStat, 4));
        jobClass.add(new JobClass("Astrologer", astrologerStat, 5));
        jobClass.add(new JobClass("Prophet", prophetStat, 6));
    }

    
    public static void displayJobClasses(){

        for (JobClass job : jobClass) {
            System.out.println("Class Name: " + job.className);
            System.out.println("Statistics:");
            System.out.println("Level: " + job.stats.getLVL());
            System.out.println("HP: " + job.stats.getHP());
            System.out.println("DEX: " + job.stats.getDEX());
            System.out.println("INT: " + job.stats.getINT());
            System.out.println("END: " + job.stats.getEND());
            System.out.println("STR: " + job.stats.getSTR());
            System.out.println("FTH: " + job.stats.getFTH());
            System.out.println();
        }
    }

    public String getClassName() {
        return className;
    }

    public Statistics getStats() {
        return stats;
    }

    public int getIndex(){
        return index;
    }

    public static ArrayList<JobClass> getJobClass() {
        return jobClass;
    }

    public String toString(){
        return className;
    }


}