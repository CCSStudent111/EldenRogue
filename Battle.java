import java.util.Scanner;
import java.util.Arrays;
import java.util.List;


public class Battle {
    private int TurnOrder = 0; // 0 for player, 1 for enemy
    Scanner scanner = new Scanner(System.in);

    //Weapon weapon = new Weapon();

    

    //Statistics weaponStats = weapon.getStats();
    int wHP = 10;
    int wEND = 7;
    int wSTR = 8;
    int wINT = 9;
    int wFTH = 6;

    public void BattleMechanics(int i, int index, Player player){
        Statistics selectedStats = player.getpStats();
        int HP = selectedStats.getHP();
        int END = selectedStats.getEND();
        int STR = selectedStats.getSTR();
        int INT = selectedStats.getINT();
        int FTH = selectedStats.getFTH();
        String name = player.getpName();
       
        int nInput = 0;
        int nSubInput = 0;
        int PlayerMaxHealth = 100 * ((HP + wHP)/ 2); 
        int EnemyHP = EnemyType.HPValue(i);
        int EnemyATK = EnemyType.ATKValue(i);

       
            //Player Turn
            do {
                //Player
                System.out.println("Player Name: " + name);
                System.out.println("HP: " + PlayerMaxHealth + "\n");

                //Enemy
                System.out.println("Enemy Name: " + EnemyType.getEnemyType(i, index));
                System.out.println("HP: " + EnemyHP + "\n");


                System.out.println("===YOUR TURN===\n");
                System.out.println("Incoming Enemy Damage: " + EnemyATK + "\n");
                System.out.println("1. Attack\n");
                System.out.println("2. Dodge\n");
                nInput = scanner.nextInt();
                scanner.nextLine();

                if (nInput == 1){
                    //Attack
                    System.out.println("1. Physical");
                    System.out.println("2. Sorcery");
                    System.out.println("3. Incantation");
                    nSubInput = scanner.nextInt();
                    scanner.nextLine();

                    if (nSubInput == 1){
                        //Physical Atk
                        float PhysDMG = ((STR + wSTR) * (1 - EnemyType.PhysDefense(i)));
                        EnemyHP = EnemyHP - (int)PhysDMG;
                        System.out.println("You did " + (int)PhysDMG + "\sdamage.");
                        System.out.println("The enemy is at " + EnemyHP + "\sHP.");
                        TurnOrder = 1;

                    } else if (nSubInput == 2){
                        //Sorcery Atk
                        float SorDMG = ((INT + wINT) * (1 - EnemyType.SorceryDefense(i)));
                        EnemyHP = EnemyHP - (int)SorDMG;
                        System.out.println("You did " + (int)SorDMG + "\sdamage.");
                        System.out.println("The enemy is at " + EnemyHP + "\sHP.");
                        TurnOrder = 1;
                        
                    } else if (nSubInput == 3){
                        //Incant Atk
                        float IncantDMG = ((FTH + wFTH) * (1 - EnemyType.IncanDefense(i)));
                        EnemyHP = EnemyHP - (int)IncantDMG;
                        System.out.println("You did " + (int)IncantDMG + "\sdamage.");
                        System.out.println("The enemy is at " + EnemyHP + "\sHP.");
                        TurnOrder = 1;

                    } else{
                        System.out.println("Wrong Choice.");
                    }

                    
                }

                else{
                    //Dodge
                    double DodgeRate = (double)(20 + ((END + wEND) / 2) / (double)100);
                    TurnOrder = 1;
                }

            } while (TurnOrder == 0);


            //Enemy's turn
            do{
                //Player
                System.out.println("Player Name: " + name);
                System.out.println("HP: " + PlayerMaxHealth + "\n");

                //Enemy
                System.out.println("Enemy Name: " + EnemyType.getEnemyType(i, index));
                System.out.println("HP: " + EnemyHP + "\n");

                System.out.println("===ENEMY's TURN===\n");

                PlayerMaxHealth = PlayerMaxHealth - (int)EnemyATK;
                System.out.println("You took " + EnemyATK + "\sdamage.");
                System.out.println("You are at " + PlayerMaxHealth + "\sHP.");
                TurnOrder = 0;
            
            } while (TurnOrder == 1);
        
        
        
    }
}   
