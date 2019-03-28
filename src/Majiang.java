public class Majiang {
    private static Player player1;
    private static Player player2;
    private static Player player3;
    private static Player player4;
    
    public static void main(String[] args) {
        System.out.println("This is a Majiang game");
        Session session = new Session();
        session.getGame().setPlayers(new Player(), new Player(), new Player(), new Player());
        session.getGame().setPosition();
        session.getGame().faPai();
        player1 = session.getGame().getPlayer(1);
        player2 = session.getGame().getPlayer(2);
        player3 = session.getGame().getPlayer(3);
        player4 = session.getGame().getPlayer(4);
        // for (Pai pai: game.getPaiChi()) {
            // System.out.println(pai);
        // }

        System.out.println(player1.getPaiList().size());
        System.out.println(player1.getPaiList());
        System.out.println(player2.getPaiList());
        System.out.println(player3.getPaiList());
        System.out.println(player4.getPaiList());
    }
    
    public Majiang() {
        
    }
    
}