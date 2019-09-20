import java.lang.Thread.State;

public class Switch{
   private boolean state=false;
   Bulb bulb = new Bulb();

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void toggleState(){
        if (state==false) {
            state=true;
            System.out.println("Switch is ON");
            bulb.toggleBulb(state);

        }
        else {
            state=false;
            System.out.println("Switch is OFF");
            bulb.toggleBulb(state);
        }
    }
   

}