//done
import com.phidget22.*;

public class ReadButton {
    
    public static void main(String[] args) throws Exception{
        
        
        DigitalInput redButton = new DigitalInput();

        
        redButton.setHubPort(5);
        redButton.setIsHubPortDevice(true);

        
        redButton.open(1000);

        
        //while(true){
          //  System.out.println("Button State: " + redButton.getState());
          //  Thread.sleep(150);
            
        Boolean buttonState = false; // track button state changes
        while(true){
	          if(redButton.getState() && !buttonState){
System.out.println("Button State: true " );
                       }else if (!redButton.getState() && buttonState){
System.out.println("Button State: false " );
                       }	
	         buttonState = redButton.getState(); // record button state changes
            Thread.sleep(150);
        }
            
        }
    }
//}
  