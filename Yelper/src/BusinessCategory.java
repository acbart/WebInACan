import java.util.ArrayList;
import java.util.List;


public class BusinessCategory {
	private String title;
	private String alias;
	private List<BusinessCategory> subcategories;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public List<BusinessCategory> getSubcategories() {
		ArrayList<BusinessCategory> bcSubcategoriesCopy = new ArrayList<BusinessCategory>();
		for (BusinessCategory bc : this.subcategories) {
			bcSubcategoriesCopy.add(new BusinessCategory(bc));
		}
		return bcSubcategoriesCopy;
	}
	
	private BusinessCategory(BusinessCategory bc) {
		this.title = bc.title;
		this.alias = bc.alias;
		if (bc.subcategories.isEmpty()) {
			this.subcategories = null;
		} else {
			this.subcategories = bc.getSubcategories();
		}
	}
	public void addCategory(BusinessCategory ct) {
		subcategories.add(ct);
	}
	
	public boolean hasSubcategories() {
		return subcategories.isEmpty();
	}
	
	public BusinessCategory(String title, String alias) {
		this.title = title;
		this.alias = alias;
	}

}
