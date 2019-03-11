import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingHTTPSCertifications {

	public static void main(String[] args) {
		//SSL Certification
		
		
		//Desired capabilities 
		//Custom General Chrome Profile
		
		//Create a "DesiredCapabilities" variable
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		//Invoke the "acceptInsecureCerts()" method to accept insecure connection on the web
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//Assign your ChromeOptions method to a variable
		ChromeOptions c = new ChromeOptions();		
		//Merge your ch variable to your chrome options
		//Your local chrome browser will now handle insecureCerts
		c.merge(ch);
		
		
	}

}
