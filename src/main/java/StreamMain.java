import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[]args) {
        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getValue().stream())
                .flatMap(Function.identity())
                .collect(Collectors.joining("!"));


        System.out.println(movies);
    }


}
