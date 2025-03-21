package learning.classExercise;

import java.util.Random;

public class Role {
    private String name;
    private int hp = 100;

    public Role() {
    }

    public Role(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    //r1被r2打
    public void beAttacked(Role r) {
        Random ran = new Random();
        int rNum = ran.nextInt(5, 16);
        hp = hp - rNum ;
        if (hp <= 0) {
            hp = 0;
        }
        StringBuilder text = new StringBuilder().append(r.name).append("举起拳头打了")
                .append(name).append("一下，造成了").append(rNum).append("点伤害，")
                .append("还剩下").append(hp).append("点血量");
        System.out.println(text);
        if (hp == 0) {
            System.out.println(name + "被KO了");
        }
    }
}
