/**
 * 
 */
package io.icegadda.goodwatchcatalogservice.model;

import java.util.List;

/**
 * @author icegadda
 *
 */
public class UserRating {

	private List<Rating> userRating;
	
	public UserRating(){
		
	}

	public UserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}

	/**
	 * @return the userRating
	 */
	public List<Rating> getUserRating() {
		return userRating;
	}

	/**
	 * @param userRating the userRating to set
	 */
	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}

}
