package 作业题5奥特曼打小怪兽;

public class Ultraman {
    private String name;
    private int healthPoint;

    public Ultraman(String name, int healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
    }

    public int attack(int healthPoint) {
        int attackType = (int) (Math.random() * 10);
        switch (attackType) {
            case 0:
                healthPoint = criticalAttack(healthPoint);
                break;
            case 1:
            case 2:
            case 3:
                healthPoint = magicAttack(healthPoint);
                break;
            default:
                healthPoint = commonAttack(healthPoint);
                break;
        }
        return healthPoint;
    }

    public int commonAttack(int heathPoint) {
        int damage = (int) Math.random() * 10 + 20;
        return heathPoint - damage;
    }

    public int magicAttack(int healthPoint) {
        int damage = 30;
        return healthPoint - damage;
    }

    public int criticalAttack(int healthPoint) {
        int damage;
        if (healthPoint > 60) {
            damage = (int) (healthPoint * 3 / 4);
        } else {
            damage = 60;
        }
        return healthPoint - damage;
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
