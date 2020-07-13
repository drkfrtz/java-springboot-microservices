package codes.drkfrtz.movieinfoservice.resources;

import codes.drkfrtz.movieinfoservice.models.Movie;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/movies", produces= MediaType.APPLICATION_JSON_VALUE)
public class MovieResource {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") int movieId) {
        return new Movie(movieId, "Movie title", "Lorem ipsum ...");
    }
}
