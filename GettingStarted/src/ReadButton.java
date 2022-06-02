


import com.phidget22.*;

public class ReadButton {
    
    public static void main(String[] args) throws Exception{
        
        
        DigitalInput redButton = new DigitalInput();

        
        redButton.setHubPort(5);
        redButton.setIsHubPortDevice(true);

        
        redButton.open(1000);

        
        while(true){
            System.out.println("Button State: " + redButton.getState());
            Thread.sleep(0);
        }
    }
}
  