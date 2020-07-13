package codes.drkfrtz.ratingsdataservice.controllers;

import codes.drkfrtz.ratingsdataservice.models.Rating;
import codes.drkfrtz.ratingsdataservice.models.User;
import codes.drkfrtz.ratingsdataservice.models.UserRating;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/ratings", produces= MediaType.APPLICATION_JSON_VALUE)
public class RatingsDataController {

    private List<Rating> agnesRatings = Arrays.asList(
            new Rating(0, 5),
            new Rating(1, 5),
            new Rating(2, 5)
    );

    private List<Rating> theoRatings = Arrays.asList(
            new Rating(0, 4),
            new Rating(1, 2),
            new Rating(2, 5)
    );

    private List<User> userList = Arrays.asList(
            new User(0, "Agnes", new UserRating(agnesRatings)),
            new User(1, "Theo", new UserRating(theoRatings))
    );

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") int userId) {
        return userList.stream().filter(user -> user.getUserId() == userId).findFirst().get().getUserRating();
    }
}
