package 作业题5奥特曼打小怪兽;

import java.util.ArrayList;

import static java.util.ArrayList.*;

public class Ultraman {
    private String name;
    private int healthPoint;

    public Ultraman(String name, int healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
    }

    public void attack(ArrayList<Monster> liveMonsters) {
        int attackType = (int) (Math.random() * 10);
        int attackTarget = (int)(Math.random()*(liveMonsters.size()));
        Monster attackMonster = liveMonsters.get(attackTarget);
        switch (attackType) {
            case 0:
                attackMonster.setHealthPoint(criticalAttack(attackMonster));
                break;
            case 1:
            case 2:
            case 3:
                for(int i=0;i<liveMonsters.size();i++){
                    attackMonster = liveMonsters.get(i);
                    attackMonster.setHealthPoint(magicAttack(attackMonster));
                }

                break;
            default:
                attackMonster.setHealthPoint(commonAttack(attackMonster));
                break;
        }
    }

    public int commonAttack(Monster monster) {
        int damage = (int) (Math.random() * 10 + 20);
        System.out.println("使用了 普攻  对"+monster.getName()+"造成了"+damage+"伤害");
        return monster.getHealthPoint() - damage;
    }

    public int magicAttack(Monster monster) {
        int damage = 30;
        System.out.println("使用了 魔法攻击  对"+monster.getName()+"造成了"+damage+"伤害");
        return monster.getHealthPoint() - damage;
    }

    public int criticalAttack(Monster monster) {
        int damage;
        if (monster.getHealthPoint() > 60) {
            damage = monster.getHealthPoint() * 3 / 4;
        } else {
            damage = 60;
        }
        System.out.println("使用了 必杀  对"+monster.getName()+"造成了"+damage+"伤害");
        return monster.getHealthPoint() - damage;
    }

    public Ultraman() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
}
