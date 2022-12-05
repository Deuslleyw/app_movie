import MovieScore from "components/MovieScore";
import { Link } from "react-router-dom";

function MovieCard() {

    const movie = {
        id: 1,
        image: "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/pz7bGOUNJXyPKJ2GcJN6nhwBnCs.jpg",
        title: "A Fera",
        count: 2,
        score: 4.5
    };

    return (
        <div>
            <img className="movie-movie-card-image" src={movie.image} alt={movie.title} />
            <div className="movie-card-bottom-container">
                <h3>{movie.title}</h3>
                <MovieScore />
                <Link to={`/form/${movie.id}`}>
                    <div className="btn btn-primary movie-btn">Avaliar</div>
                </Link>
            </div>

        </div>
    );
}
export default MovieCard;