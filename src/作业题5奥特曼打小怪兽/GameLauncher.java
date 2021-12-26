package 作业题5奥特曼打小怪兽;

import java.util.ArrayList;
import java.util.Scanner;

public class GameLauncher {

    public static void main(String[] args) {
        Ultraman dijia = new Ultraman("迪迦", 1000);
        Monster monster1 = new Monster("加坦杰厄", 350);
        Monster monster2 = new Monster("哥尔赞  ", 300);
        Monster monster3 = new Monster("邪恶迪迦", 350);
        Monster monster4 = new Monster("贝利亚  ", 350);

        Monster[] monsters = new Monster[]{monster1,monster2,monster3,monster4};
        ArrayList<Monster> liveMonsters = new ArrayList<>();
        liveMonsters.add(monster1);
        liveMonsters.add(monster2);
        liveMonsters.add(monster3);
        liveMonsters.add(monster4);
        int round = 1;
        System.out.println("游戏开始！");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("========第" + round + "回合========");
            System.out.println(dijia.getName() + "凹凸曼  血量" + dijia.getHealthPoint());
            dijia.attack(liveMonsters);


            //打印怪兽血量
            for(int i=0;i<4;i++){
                if(monsters[i].getHealthPoint()<0){
                    monsters[i].setHealthPoint(0);
                    liveMonsters.remove(monsters[i]);
                }
                System.out.println(monsters[i].getName()+"小怪兽  血量"+monsters[i].getHealthPoint());
            }
//            try {
//                Thread.currentThread().sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            //奥特曼胜利
            if(liveMonsters.isEmpty()){
                System.out.println("游戏结束，所有小怪兽都已死亡，凹凸曼胜利");
                break;
            }

            //怪兽攻击

            for(int i=0;i<liveMonsters.size();i++){
                liveMonsters.get(i).commonAttack(dijia);
            }

            if(dijia.getHealthPoint()<=0){
                System.out.println("游戏结束，凹凸曼战败，小怪兽胜利");
                break;
            }
            round++;
//            try {
//                Thread.currentThread().sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

}
