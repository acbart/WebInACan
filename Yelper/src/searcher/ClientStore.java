package searcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import org.json.simple.parser.ParseException;

import regular.Business;
import regular.JsonConverter;

public class ClientStore {

	private HashMap<String, String> jsonData;
	private HashMap<String, Object> structuredData;
	private HashMap<String, Business> classData;
	
	public ClientStore(String source) {
		try {
			this.load(source);
		} catch (IOException e) {
			System.out.println("Couldn't find client-side datastore!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ClientStore() {
		this("../updated.json");
	}

	public void load(String source) throws IOException {
		InputStreamReader is = new InputStreamReader(getClass().getResourceAsStream(source));
		BufferedReader clientData = new BufferedReader(is);
		String line;
		jsonData = new HashMap<String, String>();
		structuredData = new HashMap<String, Object>();
		classData = new HashMap<String, Business>();
		while ((line = clientData.readLine()) != null) {
			try {
				HashMap<String, Object> hm = JsonConverter.convertToHashMap(line);
				System.out.println(hm);
			} catch (ParseException e) {
				System.out.println("Client-Side Data is corrupted! JSON file couldn't be parsed...");
				e.printStackTrace();
			}
		}
		clientData.close();
		System.out.println("Loaded");
	}
}
