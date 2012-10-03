

import java.io.IOException;
import java.security.Permission;

public class WSDLProcesser {

	/*
	 * Consumes a WSDL file
	 * Generates Client classes (redirect)
	 * Generates Server classes
	 * Generates list of available methods
	 */
	
	private String wsdlPath;
	private String outputDirectory;
	
	public void setWsdlPath(String path) {
		this.wsdlPath = WebInACan.class.getResource(path).toString();
	}
	
	private static class ExitTrappedException extends SecurityException { }

	  private static void forbidSystemExitCall() {
	    final SecurityManager securityManager = new SecurityManager() {
	      public void checkPermission( Permission permission ) {
	        if( "exitVM".equals( permission.getName() ) ) {
	          throw new ExitTrappedException() ;
	        }
	      }
	    } ;
	    System.setSecurityManager( securityManager ) ;
	  }

	  private static void enableSystemExitCall() {
	    System.setSecurityManager( null ) ;
	  }
	
	public void process() {
		/**
		 * 
			WSDL clause				Java class(es) generated
			For each entry in the 	A java class
				type section		A holder if this type is used as an inout/out parameter
			For each portType		A java interface
			For each binding		A stub class
			For each service		A service interface
									A service implementation (the locator)
		 */
		createJavaBindings();
		
		String serviceName = getServiceName().toString();
		/**
		 * _.java
		 * _Locator.java
		 * _$BindingStub.java
		 * _PortType.java 
		 * Everything else is a Type
		 */
	}
	
	public String getServiceName() {
		XMLParser xp = new XMLParser();
		xp.open(wsdlPath);
		String nl = xp.getTagValue("wsdl:service");
		if (nl == null) {
			nl = xp.getTagValue("service");
		}
		return nl;
	}

	public void setOutputDirectory(String outputDirectory) {
		this.outputDirectory = outputDirectory;
	}
	
	public String createClientClasses(String location) {
		/*
		 * direct : boolean
		 * 
		 * time : datetime
		 * 
		 * setTime(datetime)
		 * 
		 * For each call, create a corresponding function
		 * that function passes all parameters, etc. to the server
		 * or passes it directly to the web service
		 */
		String client = ""; 
		return "";
	}
	
	public String createServerClasses(String location) {
		/*
		 * cache : mapping of times,calls to data
		 * 
		 * for each call, create a corresponding function that 
		 * checks the cache and returns the existing data or
		 * makes a new call, stores it in the cache, and returns it
		 * 
		 * creates a list of snapshots
		 * 
		 * starts the snapshot daemon
		 */
		return "";
	}
	
	public void createJavaBindings() {
		/*
		 * Creates all the java files that we need to create the client and
		 * server systems
		 */
		try {
			String classes = "libs/axis/axis.jar;libs/axis/axis-ant.jar;libs/axis/commons-discovery-0.2.jar;"+
							"libs/axis/commons-logging-1.0.4.jar;libs/axis/jaxrpc.jar;libs/axis/log4j-1.2.8.jar;"+
							"libs/axis/saaj.jar;libs/axis/wsdl4j-1.5.1.jar";
			String command = "java -cp "+ classes +" org.apache.axis.wsdl.WSDL2Java " + wsdlPath + " -p"+ outputDirectory;
			Process ps = Runtime.getRuntime().exec(command);
			ps.waitFor();
	        java.io.InputStream is=ps.getErrorStream();
	        byte b[]=new byte[is.available()];
	        is.read(b,0,b.length);
	        System.out.println(new String(b));
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
