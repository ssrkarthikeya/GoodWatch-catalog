/**
 * 
 */
package io.icegadda.goodwatchcatalogservice.model;

/**
 * @author icegadda
 *
 */
public class CatalogItem {

	private String title;
	private String desc;
	private Integer rating;
	
	

	/**
	 * @param title
	 * @param desc
	 * @param rating
	 */
	public CatalogItem(String title, String desc, Integer rating) {
		this.title = title;
		this.desc = desc;
		this.rating = rating;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the rating
	 */
	public Integer getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(Integer rating) {
		this.rating = rating;
	}

}
