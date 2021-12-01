/**
 * 
 */
package io.icegadda.goodwatchcatalogservice.model;

/**
 * @author icegadda
 *
 */
public class Rating {

	private String movieId;
	private Integer rating;
	
	public Rating() {
		
	}

	/**
	 * @param movieId
	 * @param rating
	 */
	public Rating(String movieId, Integer rating) {
		this.movieId = movieId;
		this.rating = rating;
	}

	/**
	 * @return the movieId
	 */
	public String getMovieId() {
		return movieId;
	}

	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(String movieId) {
		this.movieId = movieId;
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
