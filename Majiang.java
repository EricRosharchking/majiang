public class Majiang {
    private static Player player1;
    private static Player player2;
    private static Player player3;
    private static Player player4;
    
    public static void main(String[] args) {
        System.out.println("This is a Majiang game");
        Session session = new Session();
        session.getGame().setPlayers(new Player(), new Player(), new Player(), new Player());
        player1 = session.getGame().getPlayer(1);
        player2 = session.getGame().getPlayer(2);
        player3 = session.getGame().getPlayer(3);
        player4 = session.getGame().getPlayer(4);
        // for (Pai pai: game.getPaiChi()) {
            // System.out.println(pai);
        // }
        for (int i = 0; i < 13; i ++) {
                player1.moPai(session.getGame().getPaiChi().get(i + 0));
                player2.moPai(session.getGame().getPaiChi().get(i + 1));
                player3.moPai(session.getGame().getPaiChi().get(i + 2));
                player4.moPai(session.getGame().getPaiChi().get(i + 3));
        }
        System.out.println(player1.getPaiList().size());
        System.out.println(player1.getPaiList());
    }
    
    public Majiang() {
        
    }
    
    public boolean checkWin() {
        return false;
    }
}