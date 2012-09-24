import java.io.InputStream;
import java.net.URL;



public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WSDLProcesser wp = new WSDLProcesser();
		
		// Get source WSDL location, set the output directory
		wp.setWsdlPath("busTracker.wsdl");
		wp.setOutputDirectory("bustracker");
		
		// Generate the raw java bindings
		wp.process();
	}

}
