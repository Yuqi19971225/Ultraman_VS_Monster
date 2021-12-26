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
