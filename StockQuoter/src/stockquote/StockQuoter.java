package stockquote;

import java.rmi.RemoteException;
import java.util.HashMap;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;

public class StockQuoter {
	private HashMap<String, String> cache;
	// TODO: PortType
	private StockQuoteSoap_PortType sq;
	private boolean offline;
	private boolean direct;

	public StockQuoter(boolean offline, boolean direct) throws AxisFault, ServiceException {
		this.offline = offline;
		this.direct = direct;
		initStore();
		// TODO: (new Locator()).getPortType()
		this.sq = (new StockQuoteLocator()).getStockQuoteSoap();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// TODO: command line snapshot generation
			StockQuoter sq = new StockQuoter(false, false);
			System.out.println(sq.getQuote("APL"));
			System.out.println(sq.getQuote("APL"));
			System.out.println(sq.getQuote("ACB"));
			System.out.println(sq.getQuote("ACB"));
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String[] keyifyArguments(String method, Object[] arguments) {
		String[] keys = new String[arguments.length+1];
		keys[0] = method;
		for (int i = 0; i < arguments.length; i+= 1) {
			keys[i+1] = arguments.toString();
		}
		return keys;
	}
	
	public String getQuote(String symbol) throws RemoteException {
		// TODO: listof arguments
		Object[] args = {symbol};
		// TODO: method name
		String[] key = keyifyArguments("getQuote", args);
		
		if (!this.direct && isInStore(key)) {
			return restore(key);
		} else if (!this.offline) {
			// TODO: listof arguments
			String value= this.sq.getQuote(symbol);
			store(key, value);
			return value;
		} else {
			throw new RemoteException();
		}
	}
	
	// TODO: Cache
	private void initStore() {
		this.cache = new HashMap<String, String>();
	}

	private void store(String[] keys, String value) {
		cache.put(keys[0], value);
	}

	private String restore(String[] keys) {
		return cache.get(keys[0]);
	}

	private boolean isInStore(String[] keys) {
		return cache.containsKey(keys[0]);
	}

}
