public class JobClass{
    private String className;

    JobClass(String className, int nLevel, int nHP, int nDEX, int nINT, int nEND, int nSTR, int nFTH){
        this.className = className;
        this.nLevel = nLevel;
        this.nHP = nHP;
        this.nDEX = nDEX;
        this.nINT = nINT;
        this.nEND = nEND;
        this.nSTR = nSTR;
        this.nFTH = nFTH;
    }

    public static void main(String[] args){
        JobClass Vagabond = new JobClass("Vagabond", 9, 15, 13, 9, 11, 14, 9);
        JobClass Samurai = new JobClass("Samurai", 9, 12, 15, 9, 13, 12, 8);
        JobClass Warrior = new JobClass("Warrior", 8, 11, 16, 10, 11, 10, 8);
        JobClass Hero = new JobClass("Hero", 7, 14, 9, 7, 12, 16, 8);
        JobClass Astrologer = new JobClass("Astrologer", 6, 9, 12, 16, 9, 8, 7);
        JobClass Prophet = new JobClass("Prophet", 7, 10, 10, 7, 8, 11, 16);

    }

}