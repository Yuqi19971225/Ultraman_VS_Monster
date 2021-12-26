package 作业题5奥特曼打小怪兽;

public class Monster {
    private String name;
    private int healthPoint;

    public Monster() {
    }

    public Monster(String name, int healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
    }

    public void commonAttack(Ultraman ultraman) {
        int damage = (int) (Math.random() * 10 + 10);
        System.out.println(name+"使用了普攻  对"+ultraman.getName()+"造成了"+damage+"伤害");
        ultraman.setHealthPoint(ultraman.getHealthPoint()-damage);
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
