/**
 * 
 */
package io.icegadda.goodwatchcatalogservice.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import io.icegadda.goodwatchcatalogservice.model.CatalogItem;
import io.icegadda.goodwatchcatalogservice.model.Movie;
import io.icegadda.goodwatchcatalogservice.model.UserRating;

/**
 * @author icegadda
 *
 */
@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	private RestTemplate catalogRestTemplate;

	@Autowired
	private WebClient.Builder webClientBuilder;

	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

		System.out.println(discoveryClient.getInstances("goodwatch-rating-service"));
		System.out.println(discoveryClient.getInstances("goodwatch-info-service"));

		UserRating ratingList = catalogRestTemplate
				.getForObject("http://goodwatch-rating-service/ratingsdata/users/" + userId, UserRating.class);

		return ratingList.getUserRating().stream().map((rating) -> {
//			Movie movieObject = catalogRestTemplate
//					.getForObject("http://goodwatch-info-service/movies/" + rating.getMovieId(), Movie.class);

			Movie movieObject = webClientBuilder.build().get()
					.uri("http://goodwatch-info-service/movies/" + rating.getMovieId()).retrieve().bodyToMono(Movie.class)
					.block();

			return new CatalogItem(movieObject.getName(), "Description", rating.getRating());

		}).collect(Collectors.toList());

	}

}
