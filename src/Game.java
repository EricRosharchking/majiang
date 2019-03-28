 import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    
    private List<Pai> paiChi;
	private int index;
	private int turn;
    
    public Game() {
		turn = 0;
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
    
    public void setPosition() {
        player1.setPosition(1);
        player2.setPosition(2);
        player3.setPosition(3);
        player4.setPosition(4);
    }
    
    public void faPai() {
		int i = 0;
        for (; i < 13; i ++) {
            player1.moPai(this.getPaiChi().get(4 * i + 0));
            player2.moPai(this.getPaiChi().get(4 * i + 1));
            player3.moPai(this.getPaiChi().get(4 * i + 2));
            player4.moPai(this.getPaiChi().get(4 * i + 3));
        }
		index = i;
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
	
	public Pai moPai() {
		return this.getPaiChi().get(index++);
	}
	
	public Pai daPai(int i) {
		return this.getPlayer(turn++).daPai(i);
	}
    
    public List<Pai> getPaiChi() {
        return this.paiChi;
    }
    
    public boolean checkWin(Player player) {
        List<Pai> paiList = player.getPaiList();
        return false;
    }
    public boolean checkWin(Player player, Pai pai) {
        return false;
    }
}