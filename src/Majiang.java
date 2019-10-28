import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Majiang {
    private static Player player1;
    private static Player player2;
    private static Player player3;
    private static Player player4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("This is a Majiang game");
            Session session = new Session();
            Game game = session.getGame();
            game.setPlayers(new Player(), new Player(), new Player(), new Player());
            game.setPosition();
            game.faPai();
            player1 = game.getPlayer(0);
            player2 = game.getPlayer(1);
            player3 = game.getPlayer(2);
            player4 = game.getPlayer(3);

            // System.out.println(game.getPaiChi());

            // System.out.println(game.getIndex());
            // while (game.getIndex() < 136) {
            // System.out.println(player1.getPaiList().size());
            // boolean status = false;
            // while (!status) {
            //     game.playerMoPai();
            //     Collections.sort(player1.getPaiList());
            //     MajiangUtil.print(player1.getPaiList());
            //     status = game.checkWin(player1);
            //     System.out.println("status:[" + status + "]*****************************");
            //     System.out.print("Please choose which Pai to play:");
            //     String choice = sc.next();
            //     if (!choice.matches("[0-9]{1,2}")) {
            //         break;
            //     }
            //     game.daPai(Integer.valueOf(choice)-1);
            //     game.playerMoPai();
            //     game.daPai(0);
            //     game.playerMoPai();
            //     game.daPai(0);
            //     game.playerMoPai();
            //     game.daPai(0);
            // }
            player1.setPaiList(MajiangUtil.getTestPaiList(1));
            Collections.sort(player1.getPaiList());
            MajiangUtil.print(player1.getPaiList());
            System.out.println(game.checkWin(player1));
            // System.out.print("Please choose which Pai to play:");
            // int choice = sc.nextInt();
            // System.out.println(choice);
            // game.playerMoPai();
            // Collections.sort(player1.getPaiList());
            // boolean status =game.checkWin(player1);
            // MajiangUtil.print(player1.getPaiList());
            // System.out.println(status);
            // System.out.println("����:" + player1.getPaiList());
            // System.out.println("��" +game.daPai(0));
            // System.out.println("����:" + player1.getPaiList());

            // ArrayList<Pai> lst = player1.getPaiList();
            // Collections.sort(player1.getPaiList());
            // System.out.println("����:" + player1.getPaiList());

            // game.playerMoPai();
            // System.out.println("����:" + player2.getPaiList());
            // System.out.println("��" +game.daPai(0));
            // System.out.println("����:" +game.getPlayer(1).getPaiList());

            // game.playerMoPai();
            // System.out.println("����:" + player3.getPaiList());
            // System.out.println("��" +game.daPai(0));
            // System.out.println("����:" +game.getPlayer(2).getPaiList());

            // // System.out.println(game.getIndex());
            // game.playerMoPai();
            // System.out.println("����:" + player4.getPaiList());
            // System.out.println("��" +game.daPai(0));
            // System.out.println("����:" + player4.getPaiList());
            // }

            // System.out.println(game.getTurn());
            // System.out.println("�ڶ���:" + player1.getPaiList());
            // game.playerMoPai();
            // System.out.println("��"+game.daPai(0));
            // System.out.println("����:" +game.getPlayer(0).getPaiList());
            // System.out.println(game.getPlayer(0).getPaiList());
            // System.out.println(game.getPlayer(1).getPaiList());
            // System.out.println(game.getPlayer(2).getPaiList());
            // System.out.println(game.getPlayer(3).getPaiList());

            // for (int i=0; i < 10; i )) {
            // game.daPai(3);
            // }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    public Majiang() {

    }

}