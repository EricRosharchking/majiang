import java.util.List;
import java.util.ArrayList;

public class Player {
    private ArrayList<Pai> paiList;
    private int position;

    public Player() {
        paiList = new ArrayList<Pai>();
    }

    public void setPaiList(ArrayList<Pai> paiList) {
        this.paiList = paiList;
    }

    public ArrayList<Pai> getPaiList() {
        return this.paiList;
    }

    public void moPai(Pai pai) {
        paiList.add(pai);
    }

    public Pai daPai(int i) {
        Pai pai = paiList.get(i);
        paiList.remove(i);
        return pai;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}