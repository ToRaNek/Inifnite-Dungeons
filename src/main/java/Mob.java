package main.java;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Mob
 */
public class Mob extends Entity{
    
    private MobType type;

    public Mob(String name, MobType listMob,int hpMax, int dmgA, int dmgP, int defA, int defP, float speed, int gold) {
        super(name, hpMax, dmgA, dmgP, defA, defP, speed, gold);
    }

    public MobType getType() {
        return type;
    }

    public static Mob randomNewMob(int difficulty){
        Random rdm = new Random();
        MobType[] listMob = MobType.values();
        int longueur = listMob.length;
        int num = rdm.nextInt(longueur);
        int hp =  (int)((80*rdm.nextInt(101)/100 + 20) *difficulty);
        int defA =  (int)((5*rdm.nextInt(101)/100 + 10) *0.25*difficulty);
        int defP =  (int)((20*rdm.nextInt(101)/100 + 10) *0.25*difficulty);
        int dmgA;
        int dmgP;
        if(rdm.nextInt(2)==0){
            dmgA =  (int)((5*rdm.nextInt(101)/100 + 5) *0.25*difficulty);
            dmgP =  0;

        }else{
            dmgA =  0;
            dmgP =  (int)((5*rdm.nextInt(101)/100 + 5) *0.25*difficulty);

        }
        int gold =  (int)((10*rdm.nextInt(101)/100 + 5) *0.25*difficulty);
        Mob newMob = new Mob(listMob[num].toString(), listMob[num] , hp, dmgA, dmgP, defA, defP, 5, gold);

        return newMob;
    }

    public void mobToImage() throws IOException{
        String path = System.getProperty("user.dir") + File.separator + "res" + File.separator + "mobs" + File.separator + "ansi" +  File.separator;
        Utils.printAnsi(new File(path + this.type.getPath()));
    }


}