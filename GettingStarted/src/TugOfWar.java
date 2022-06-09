//done
import com.phidget22.*;

public class TugOfWar {
    
    public static void main(String[] args) throws Exception{

        //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
      
        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. 
        int button = 0;
        int button1 = 0;
        {
        	
        }
        while(true){

            if( redButton.getState()){
                redLED.setState(true);
                button++;
            } 
            else 
            {
                redLED.setState(false);
            }

            if(
            	greenButton.getState()){
                greenLED.setState(true);
                button1++;
            } 
            else
            {
                greenLED.setState(false);
            }
            
            if (redButton.getState()==true) {
            	System.out.println("Red has " + button + (" points"));
            Thread.sleep(150);} 
            
            if (greenButton.getState()==true) {
                System.out.println("Green has " + button1 + (" points"));
            Thread.sleep(100);}
            
            if (button==10) {
            		System.out.println("Red wins!");
            		redLED.setState(true);

            		  Thread.sleep(10);
                      redLED.setState(false);
                      Thread.sleep(10);
                      greenLED.setState(true);
                      Thread.sleep(100);
                      greenLED.setState(false);
                      Thread.sleep(10);
                      redLED.setState(true);
                      Thread.sleep(100);
                      redLED.setState(false);
                      Thread.sleep(100);
                      redLED.setState(true);
                      Thread.sleep(100);
                      redLED.setState(false);
                      Thread.sleep(100);
                      redLED.setState(true);
                      Thread.sleep(100);
                      redLED.setState(false);
                      Thread.sleep(100);
                      redLED.setState(true);
                      Thread.sleep(100);
                      redLED.setState(false);
                      Thread.sleep(100);
                      redLED.setState(true);
                      Thread.sleep(100);
                      redLED.setState(false);
                      Thread.sleep(100);
                    return;
              }
              if (button1==10) {
              	{
                      greenLED.setState(true);
                      Thread.sleep(100);
                      greenLED.setState(false);
                      Thread.sleep(100);
                      greenLED.setState(true);
                      Thread.sleep(100);
                      greenLED.setState(false);
                      Thread.sleep(100);
                      greenLED.setState(true);
                      Thread.sleep(100);
                      greenLED.setState(false);
                      Thread.sleep(100);
                      greenLED.setState(true);
                      Thread.sleep(100);
                      greenLED.setState(false);
                      Thread.sleep(100);
                      greenLED.setState(true);
                      Thread.sleep(100);
                      greenLED.setState(false);
                      Thread.sleep(100);
                      greenLED.setState(true);
                      Thread.sleep(100);
                      greenLED.setState(false);
                      Thread.sleep(100);
                  }
              	System.out.println("Green wins!");
          		
          		return;
          }
              
          }
      }
  }



  