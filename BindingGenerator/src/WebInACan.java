
public class WebInACan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WSDLProcesser wp = new WSDLProcesser();
		
		// Get source WSDL location, set the output directory
		wp.setWsdlPath("weather.wsdl");
		wp.setOutputDirectory("weather");
		
		// Generate the raw java bindings
		wp.process();
	}

}
