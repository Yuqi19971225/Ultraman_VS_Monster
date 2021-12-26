package 作业题5奥特曼打小怪兽;

public class Ultraman {
    private String name;
    private int healthPoint;

    public Ultraman(String name, int healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
    }

    public void attack(Monster monster) {
        int attackType = (int) (Math.random() * 10);
        switch (attackType) {
            case 0:
                monster.setHealthPoint(criticalAttack(monster));
                break;
            case 1:
            case 2:
            case 3:
                monster.setHealthPoint(magicAttack(monster));
                break;
            default:
                monster.setHealthPoint(commonAttack(monster));
                break;
        }
    }

    public int commonAttack(Monster monster) {
        int damage = (int) (Math.random() * 10 + 20);
        System.out.println("使用了 普攻"+monster.getName());
        return monster.getHealthPoint() - damage;
    }

    public int magicAttack(Monster monster) {
        int damage = 30;
        return monster.getHealthPoint() - damage;
    }

    public int criticalAttack(Monster monster) {
        int damage;
        if (monster.getHealthPoint() > 60) {
            damage = monster.getHealthPoint() * 3 / 4;
        } else {
            damage = 60;
        }
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
