public class Round {
    private int round = 1;

    public Round() {
    	
    }
    
    public int getRound(){
        return this.round;
    }

    public void nextRound() {
        this.round++;
    }
}
