import java.awt.*;

public class Saab95 extends Bilar{

    private boolean turboOn;
    
    private Saab95(){
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
	    turboOn = false;
        modelName = "Saab95";
        stopEngine();
    }

    private void setTurboOn(){
	    turboOn = true;
    }

    private void setTurboOff(){
	    turboOn = false;
    }
    
    private double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    private void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    private void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    public void move() {

    }

    public void turnLeft() {

    }

    public void turnRight() {

    }
    
    // TODO fix this method according to lab pm
    private void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    private void brake(double amount){
        decrementSpeed(amount);
    }
}
