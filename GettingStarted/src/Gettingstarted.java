


	
	import com.phidget22.*;

	public class Gettingstarted {
	    
	    public static void main(String[] args) throws Exception{

	        
	        DigitalOutput redLED = new DigitalOutput();

	        
	        redLED.setHubPort(4);
	        redLED.setIsHubPortDevice(true);

	        
	        redLED.open(1000);

	        
	        while(true){
	        	redLED.setState(true);
	            Thread.sleep(1000);
	            redLED.setState(false);
	            Thread.sleep(1000);
	        }
	    }
	}
	  

