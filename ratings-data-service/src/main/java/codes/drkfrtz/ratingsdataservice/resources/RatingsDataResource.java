package codes.drkfrtz.ratingsdataservice.resources;

import codes.drkfrtz.ratingsdataservice.models.Rating;
import codes.drkfrtz.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") int movieId) {
        return new Rating(movieId, 5);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") int userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating(1234, 4),
                new Rating(2345, 3)
        );
        return new UserRating(ratings);
    }
}
