package 作业题5奥特曼打小怪兽;

public class GameLauncher {
    public static Ultraman dijia = new Ultraman("迪迦", 1000);
    public static Monster monster1 = new Monster("加坦杰厄", 350);
    public static Monster monster2 = new Monster("哥尔赞", 300);
    public static Monster monster3 = new Monster("邪恶迪迦", 350);
    public static Monster monster4 = new Monster("贝利亚", 350);

    public static void main(String[] args) {
        int round = 1;
        while (true){
            System.out.println("========第"+round+"回合========");
            System.out.println(dijia.getName()+"凹凸曼  血量"+dijia.getHealthPoint());
        }
    }

}
