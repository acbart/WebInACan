package searcher;
import java.util.ArrayList;
import java.util.List;


public class BusinessCategory {
	private String title;
	private String alias;
	private List<BusinessCategory> subcategories;
	private BusinessCategory(BusinessCategory bc) {
		this.title = bc.title;
		this.alias = bc.alias;
		if (bc.subcategories.isEmpty()) {
			this.subcategories = null;
		} else {
			this.subcategories = bc.getSubcategories();
		}
	}
	public BusinessCategory(String title, String alias) {
		this.title = title;
		this.alias = alias;
	}
	public BusinessCategory(ArrayList<String> a) {
		this.title = (String) a.get(0);
		this.alias = (String) a.get(1);
	}
	public BusinessCategory(String string) {
		// TODO Auto-generated constructor stub
	}
	public void addCategory(BusinessCategory ct) {
		subcategories.add(ct);
	}
	public String getAlias() {
		return alias;
	}

	public List<BusinessCategory> getSubcategories() {
		ArrayList<BusinessCategory> bcSubcategoriesCopy = new ArrayList<BusinessCategory>();
		for (BusinessCategory bc : this.subcategories) {
			bcSubcategoriesCopy.add(new BusinessCategory(bc));
		}
		return bcSubcategoriesCopy;
	}
	
	public String getTitle() {
		return title;
	}
	public boolean hasSubcategories() {
		return subcategories.isEmpty();
	}

}
