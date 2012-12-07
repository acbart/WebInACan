package regular;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import searcher.BusinessCategory;

public class Util {
	private String join(Object[] objects) {
		StringBuilder sb = new StringBuilder();
		for (Object o : objects) {
		    if (sb.length() > 0) sb.append(',');
		    sb.append(o.toString());
		}
		return sb.toString();
	}

	public static String join(ArrayList<String> strings) {
		StringBuilder sb = new StringBuilder();
		for (String s: strings) {
		    if (sb.length() > 0) sb.append(',');
		    sb.append(s);
		}
		return sb.toString();
	}
	
	public static String join(String glue, ArrayList<String> strings) {
		StringBuilder sb = new StringBuilder();
		for (String s: strings) {
		    if (sb.length() > 0) sb.append(glue);
		    sb.append(s);
		}
		return sb.toString();
	}
	
	public static double formatDecimals(double d, int mantissa) {
		String m = "";
		for (int i = 0; i < mantissa; i++) {
			m+= "#";
		}
        DecimalFormat decimalForm = new DecimalFormat("#."+m);
        return Double.valueOf(decimalForm.format(d));
	}
}
