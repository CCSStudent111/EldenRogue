import java.util.ArrayList;

/**
 * This class represents a job class in the game, including its name, statistics, and index.
 */

public class JobClass{
    // The name of the job class
    private String className;
    // The statistics of the job class
    private Statistics stats;
    // The index of the job class
    private int index;
    // List to store all available job classes
    private static ArrayList<JobClass> jobClass = new ArrayList<>();


     /**
     * Constructor to initialize a job class with its name, statistics, and index.
     * @param className The name of the job class.
     * @param stats The statistics of the job class.
     * @param index The index of the job class.
     */
    public JobClass(String className, Statistics stats, int index){
        this.className = className;
        this.stats = stats;
        this.index = index;
        
        
    }

    /**
     * Static block to initialize predefined job classes and their statistics.
     */
    static {
        Statistics vagabondStat = new Statistics(9, 15, 13, 9, 11, 14, 9);
        Statistics samuraiStat = new Statistics(9, 12, 15, 9, 13, 12, 8);
        Statistics warriorStat = new Statistics(8, 11, 16, 10, 11, 10, 8);
        Statistics heroStat = new Statistics(7, 14, 9, 7, 12, 16, 8);
        Statistics astrologerStat = new Statistics(6, 9, 12, 16, 9, 8, 7);
        Statistics prophetStat = new Statistics(7, 10, 10, 7, 8, 11, 16);

        jobClass.add(new JobClass("Vagabond", vagabondStat, 1));
        jobClass.add(new JobClass("Samurai", samuraiStat, 2));
        jobClass.add(new JobClass("Warrior", warriorStat, 3));
        jobClass.add(new JobClass("Hero", heroStat, 4));
        jobClass.add(new JobClass("Astrologer", astrologerStat, 5));
        jobClass.add(new JobClass("Prophet", prophetStat, 6));
    }

    
    /**
     * Method to display all available job classes along with their statistics.
     */
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


    /**
     * Getter method to retrieve the name of the job class.
     * @return The name of the job class.
     */
    public String getClassName() {
        return className;
    }

    /**
     * Getter method to retrieve the statistics of the job class.
     * @return The statistics of the job class.
     */
    public Statistics getStats() {
        return stats;
    }

    /**
     * Getter method to retrieve the index of the job class.
     * @return The index of the job class.
     */
    public int getIndex(){
        return index;
    }

    /**
     * Getter method to retrieve the list of all available job classes.
     * @return The list of all available job classes.
     */
    public static ArrayList<JobClass> getJobClass() {
        return jobClass;
    }

    /**
     * Override of the toString method to represent the job class by its name.
     * @return The name of the job class.
     */
    public String toString(){
        return className;
    }


}