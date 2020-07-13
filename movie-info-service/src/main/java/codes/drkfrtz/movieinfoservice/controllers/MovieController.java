package codes.drkfrtz.movieinfoservice.controllers;

import codes.drkfrtz.movieinfoservice.models.Movie;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/movies", produces= MediaType.APPLICATION_JSON_VALUE)
public class MovieController {

    private List<Movie> movieList = Arrays.asList(
            new Movie(0, "Iron Man", "The coolest super hero in the MCU."),
            new Movie(1, "Wolf of Wallstreet", "The academy should have given Leo an Oscar for that movie."),
            new Movie(2, "The life of Brian", "Monty Python at its best.")
    );

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") int movieId) {
        return movieList.stream().filter(m -> m.getMovieId() == movieId).findFirst().get();
    }
}
