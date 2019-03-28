import java.util.List;
import java.util.ArrayList;

public class Player {
    private List<Pai> paiList;
    private int position;
    
    public Player() {
        paiList = new ArrayList<Pai>();
    }
    
    public void setPaiList(List<Pai> paiList) {
        this.paiList = paiList;
    }
    
    public List<Pai> getPaiList() {
        return this.paiList;
    }
    
    public void moPai(Pai pai) {
        paiList.add(pai);
    }
    
    public Pai daPai(Pai pai) {
        paiList.remove(pai);
        return pai;
    }
    
    public int getPosition() {
        return this.position;
    }
    
    public void setPosition(int position) {
        this.position = position;
    }
}