import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    
    private List<Pai> paiChi;
    
    public Game() {
        paiChi = new ArrayList<Pai>();
        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 4; j ++) {
                if (j < 3) {
                    for (int k = 0; k < 9; k ++) {
                        paiChi.add(new Pai((char)(j+97), k, i));
                    }
                } else {
                    for (int k = 0; k < 7; k ++) {
                        paiChi.add(new Pai((char)(j+97), k, i));
                    }
                }
            }
        }
        for (int i = 0; i < 4; i ++)
            Collections.shuffle(paiChi);
    }
    
    public void setPlayers(Player player1, Player player2, Player player3, Player player4) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;
    }
    
    public Player getPlayer(int i) {
        switch (i){
            case 1:
                return player1;
            case 2:
                return player2;
            case 3:
                return player3;
            case 4:
                return player4;
            default:
                return null;
        }
                
    }
    
    public List<Pai> getPaiChi() {
        return this.paiChi;
    }
}