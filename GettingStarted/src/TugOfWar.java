
  
import com.phidget22.*;

public class TugOfWar {
    
    public static void main(String[] args) throws Exception{
        
        
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalInput greenLED = new DigitalInput();
        DigitalInput redLED = new DigitalInput();
        
        
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        
        redButton.open(1000);
        greenButton.open(1000);
        
        if( redButton.getState()){
            redLED.setState(true);
        } else {
            redLED.setState(false);
        }
            
            System.out.println("Button State: " + greenButton.getState());
            Thread.sleep(150);
        }
    }
//}
  
