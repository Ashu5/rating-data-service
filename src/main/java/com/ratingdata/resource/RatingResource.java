package com.ratingdata.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratingdata.model.Rating;
import com.ratingdata.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingResource {

	@RequestMapping("/{movieId}")
	public Rating getRatings( @PathVariable String movieId) {
		return new Rating(movieId,8);
		
	}
	@RequestMapping("users/{userId}")
	public UserRating getUserRatings(@PathVariable String userId) {
		List<Rating> rating=Arrays.asList(
				 new Rating("Oblivion",7),
				 new Rating("Intersteller",9)
				
				);
		UserRating userRating= new UserRating();
		userRating.setUserRating(rating);
		return userRating;
		
	}

}
