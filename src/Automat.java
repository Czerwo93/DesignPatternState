public class Automat {
    State state;

    public Automat() {
        this.state = new NoCoinState();
    }

    public void insertTheCoin(Automat automat){
        state.insertTheCoin(this);
    };
    public void pullTheLever(Automat automat){
        state.pullTheLever(this);
    };
    public void takeYourWinnings(Automat automat){
        state.takeYourWinnings(this);
    };
    public void writeState(Automat automat){
        state.writeState(this);
    };
}
