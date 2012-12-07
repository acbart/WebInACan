package regular;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.parser.ContainerFactory;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonConverter {
	private static ContainerFactory CONTAINER_FACTORY = new ContainerFactory(){
	    public List creatArrayContainer() {
		      return new ArrayList();
		    }
	
		    public Map createObjectContainer() {
		      return new HashMap();
		    }
		                        
		  };
	

	public static HashMap<String, Object> convertToHashMap(String input) throws ParseException {
		return (HashMap<String, Object>) (new JSONParser()).parse(input, CONTAINER_FACTORY);
	}
}
