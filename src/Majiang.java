import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Majiang {
    private static Player player1;
    private static Player player2;
    private static Player player3;
    private static Player player4;
    
    public static void main(String[] args) {
		try {
        System.out.println("This is a Majiang game");
        Session session = new Session();
        session.getGame().setPlayers(new Player(), new Player(), new Player(), new Player());
        session.getGame().setPosition();
        session.getGame().faPai();
        player1 = session.getGame().getPlayer(0);
        player2 = session.getGame().getPlayer(1);
        player3 = session.getGame().getPlayer(2);
        player4 = session.getGame().getPlayer(3);
		
        // System.out.println(session.getGame().getPaiChi());
		
		// System.out.println(session.getGame().getIndex());
 // while (session.getGame().getIndex() < 136) {
        // System.out.println(player1.getPaiList().size());
		
		session.getGame().playerMoPai();
		Collections.sort(player1.getPaiList());
		boolean status = session.getGame().checkWin(player1);
		System.out.println(status);
        // System.out.println("摸完:" + player1.getPaiList());
        // System.out.println("打" + session.getGame().daPai(0));
        // System.out.println("打完:" + player1.getPaiList());
		
		// ArrayList<Pai> lst = player1.getPaiList();
		// Collections.sort(player1.getPaiList());
		// System.out.println("排序:" + player1.getPaiList());
		
		// session.getGame().playerMoPai();
        // System.out.println("摸完:" + player2.getPaiList());
        // System.out.println("打" + session.getGame().daPai(0));
        // System.out.println("打完:" + session.getGame().getPlayer(1).getPaiList());
		
		
		// session.getGame().playerMoPai();
        // System.out.println("摸完:" + player3.getPaiList());
        // System.out.println("打" + session.getGame().daPai(0));
        // System.out.println("打完:" + session.getGame().getPlayer(2).getPaiList());
		
        // // System.out.println(session.getGame().getIndex());
		// session.getGame().playerMoPai();
        // System.out.println("摸完:" + player4.getPaiList());
        // System.out.println("打" + session.getGame().daPai(0));
        // System.out.println("打完:" + player4.getPaiList());
// }
                
		// System.out.println(session.getGame().getTurn());
        // System.out.println("第二轮:" + player1.getPaiList());
		// session.getGame().playerMoPai();
        // System.out.println("打"+ session.getGame().daPai(0));
        // System.out.println("打完:" + session.getGame().getPlayer(0).getPaiList());
        // System.out.println(session.getGame().getPlayer(0).getPaiList());
        // System.out.println(session.getGame().getPlayer(1).getPaiList());
        // System.out.println(session.getGame().getPlayer(2).getPaiList());
        // System.out.println(session.getGame().getPlayer(3).getPaiList());
        
        // for (int i=0; i < 10; i )) {
            // session.getGame().daPai(3);
        // }
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public Majiang() {
        
    }
    
}