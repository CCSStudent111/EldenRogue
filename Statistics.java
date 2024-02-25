public class Statistics{
    private int nLevel;
    private int nHP;
    private int nDEX;
    private int nINT;
    private int nEND;
    private int nSTR;
    private int nFTH;
    
   Statistics (int nLevel, int nHP, int nDEX, int nINT, int nEND, int nSTR, int nFTH){
    this.nLevel = nLevel;
    this.nHP = nHP;
    this.nDEX = nDEX;
    this.nINT = nINT;
    this.nEND = nEND;
    this.nSTR = nSTR;
    this.nFTH = nFTH;
}

    public int getLevel(){
        return nLevel;
    }

    public int getHP(){
        return nHP;
    }

    public int getDEX(){
        return nDEX;
    }

    public int getINT(){
        return nINT;
    }

    public int getEND(){
        return nEND;
    }

    public int getSTR(){
        return nSTR;
    }

    public int getFTH(){
        return nFTH;
    }



}

