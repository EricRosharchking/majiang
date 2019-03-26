public class Pai {
    private char huaSe;
    private int num;
    private int seq;
    
    public Pai(char huaSe, int seq, int num) {
        this.huaSe = huaSe;
        this.seq = seq;
        this.num = num;
    }
    
    public char getHuaSe() {
        return huaSe;
    }
    
    public void setHuaSe(char huaSe) {
        this.huaSe = huaSe;
    }
    
    public int getSeq() {
        return seq;
    }
    
    public void setSeq(int seq) {
        this.seq = seq;
    }
    
    public int getNum() {
        return num;
    }
    
    public void setNum() {
        this.num = num;
    }
    
    public String toString() {
        return huaSe + ":" + seq + "," + num;
    }
}