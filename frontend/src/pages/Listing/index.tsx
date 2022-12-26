import axios from "axios";
import MovieCard from "components/MovieCard";
import Pagination from "components/Pagination";
import { MoviePage } from "Types/movie";
import { BASE_URL } from "utils/requests";
import{useState} from "react"
import{useEffect} from "react"

function Listing() {

    const[pageNumber, setPageNumber] = useState(0);

    useEffect


    axios.get(`${BASE_URL}/movies?size=12&page=0`)
    .then(response => {
        const data = response.data as MoviePage;
        setPageNumber(data.number);
    });

    return (
        <>
        <p>{pageNumber}</p>

            <Pagination />

            <div className="container">

                <div className="row">
                    <div className="col-sm-6 col-lg-4 col-x1-3 mb-5">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-x1-3 mb-5">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-x1-3 mb-5">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-x1-3 mb-5">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-x1-3 mb-5">
                        <MovieCard />
                    </div>
                </div>
            </div>

        </>
    );
}

export default Listing;