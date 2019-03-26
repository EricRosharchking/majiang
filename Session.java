public class Session {
    private Game game;
    
    public Session() {
        game = new Game();
    }
    
    public void nextGame() {
        game = new Game();
    }
    
    public Game getGame() {
        return this.game;
    }
}