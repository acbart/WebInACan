package searcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BusinessQuery {

	private int radius;
	private boolean hasRadius;
	private String term;
	private BusinessCategory[] categories;
	private boolean deals;
	private SortMode sortMode;
	private int limit;
	private int offset;
	private Location location;
	private boolean hasTerm;
	private boolean hasCategories;
	private boolean hasDeals;
	private boolean hasSortMode;
	private boolean hasLimit;
	private boolean hasOffset;

	public BusinessQuery(Location location) {
		this.location = location;
	}
	
	public BusinessQuery(String location) {
		this(new NamedLocation(location));
	}
	
	public BusinessQuery limitRadius(int radius) {
		this.radius = radius;
		this.hasRadius = false;
		return this;
	}
	public BusinessQuery removeRadiusLimit() {
		this.hasRadius = false;
		return this;
	}
	
	public BusinessQuery filterTerm(String term) {
		this.term = term;
		this.hasTerm = true;
		return this;
	}
	
	public BusinessQuery removeTermFilter() {
		this.hasTerm = false;
		return this;
	}
	
	public BusinessQuery filterCategories(BusinessCategory... categories) {
		this.categories = categories.clone();
		this.hasCategories = true;
		return this;
	}
	
	public BusinessQuery filterCategories(String... categories) {
		this.categories = new BusinessCategory[categories.length];
		for (int i = 0; i < categories.length; i++) {
			this.categories[i] = new BusinessCategory(categories[i]);
		}
		this.hasCategories = true;
		return this;
	}
	
	public BusinessQuery removeCategoriesFilter() {
		this.hasCategories = false;
		return this;
	}
	
	public BusinessQuery filterDeals() {
		this.deals = true;
		this.hasDeals = true;
		return this;
	}
	
	public BusinessQuery filterDeals(boolean filter) {
		this.deals = filter;
		this.hasDeals = true;
		return this;
	}
	
	public BusinessQuery removeDealsFilter() {
		this.hasDeals = false;
		return this;
	}
	
	public BusinessQuery sortBy(SortMode sortMode) {
		this.sortMode = sortMode;
		this.hasSortMode = true;
		return this;
	}
	
	public BusinessQuery removeSortBy() {
		this.hasSortMode = false;
		return this;
	}
	
	public BusinessQuery limitResults(int limit) {
		this.limit = limit;
		this.hasLimit = true;
		return this;
	}
	
	public BusinessQuery removeResultLimit() {
		this.hasLimit = false;
		return this;
	}
	
	public BusinessQuery offsetResults(int offset) {
		this.offset = offset;
		this.hasOffset = true;
		return this;
	}
	
	public BusinessQuery removeResultOffset() {
		this.hasOffset = false;
		return this;
	}
	
	public BusinessQuery paginate(int offset, int limit) {
		this.offsetResults(offset);
		this.limitResults(limit);
		return this;
	}
	
	public BusinessQuery removePagination() {
		this.removeResultLimit();
		this.removeResultOffset();
		return this;
	}

	public HashMap<String, String> getFilters() {
		HashMap<String, String> filters = new HashMap<String, String>();
		
		filters.putAll(this.location.getFilter());
		
		if (this.hasTerm) {
			filters.put("term", this.term);
		}
		
		if (this.hasLimit) {
			filters.put("limit", "" + this.limit);
		}
		
		if (this.hasOffset) {
			filters.put("offset", "" + this.offset);
		}
		
		if (this.hasCategories && this.categories.length >= 1) {
			StringBuilder csl = new StringBuilder();
			csl.append(this.categories[0]);
			if (this.categories.length > 1) {
				for (int i = 1; i < this.categories.length; i++){
					csl.append(","+this.categories[i]);
				}
			}
			filters.put("category_filter", csl.toString());
		}
		
		if (this.hasDeals){
			filters.put("deals_filter", (this.hasDeals ? "1" : "0"));
		}
		
		if (this.hasSortMode){
			filters.put("sort", ""+this.sortMode.ordinal());
		}
		
		return filters;
	}
}
