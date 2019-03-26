import java.util.List;
import java.util.ArrayList;

public class Player {
    private List<Pai> paiList;
    
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
}