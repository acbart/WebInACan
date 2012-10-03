import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class XMLParser {

	private Document doc;

	public void open(String path) {
		try {
			File fXmlFile = new File(path);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			this.doc = dBuilder.parse(fXmlFile.getPath());
			doc.getDocumentElement().normalize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Element getRoot() {
		return doc.getDocumentElement();
	}

	public NodeList getElementsByTagName(String name) {
		return doc.getElementsByTagName(name);
	}


	public String getTagValue(String sTag) {
		NodeList nodeList = doc.getElementsByTagName(sTag);
        for(int x=0,size= nodeList.getLength(); x<size; x++) {
            return nodeList.item(x).getAttributes().getNamedItem("name").getNodeValue();
        }
		return null;
	}
}
