public class JobClass{
    private String className;
    private Statistics stats;

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

    }

}