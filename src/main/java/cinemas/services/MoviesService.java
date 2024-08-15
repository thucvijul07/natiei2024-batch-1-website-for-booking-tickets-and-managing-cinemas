package cinemas.services;

import cinemas.dtos.PaginationResult;
import cinemas.models.Movie;

import java.util.List;
import java.util.Optional;

public interface MoviesService {
    List<Movie> getAllMovies();
    Movie save(Movie movie);
    Optional<Movie> findById(int id);
    PaginationResult<Movie> getPaginationMoviesByTitleAndStatus(String keyword, int page, int size, String status);
}
