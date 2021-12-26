package 作业题5奥特曼打小怪兽;

import java.util.ArrayList;

public class GameLauncher {

    public static void main(String[] args) {
        Ultraman dijia = new Ultraman("迪迦", 1000);
        Monster monster1 = new Monster("加坦杰厄", 350);
        Monster monster2 = new Monster("哥尔赞", 300);
        Monster monster3 = new Monster("邪恶迪迦", 350);
        Monster monster4 = new Monster("贝利亚", 350);

        Monster[] monsters = new Monster[]{monster1,monster2,monster3,monster4};
        ArrayList<Monster> liveMonsters = new ArrayList<>();
        liveMonsters.add(monster1);
        liveMonsters.add(monster2);
        liveMonsters.add(monster3);
        liveMonsters.add(monster4);
        int round = 1;
        while (round<10) {
            System.out.println("========第" + round + "回合========");
            System.out.println(dijia.getName() + "凹凸曼  血量" + dijia.getHealthPoint());
            int attackTarget = (int)(Math.random()*(liveMonsters.size()));
            dijia.attack(liveMonsters.get(attackTarget));
            round++;
        }
    }

}
