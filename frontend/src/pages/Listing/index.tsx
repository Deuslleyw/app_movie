import axios from "axios";
import MovieCard from "components/MovieCard";
import Pagination from "components/Pagination";
import { BASE_URL } from "utils/requests";

function Listing() {

    //TESTE RQ

    axios.get(`${BASE_URL}/movies?size=12&page=0`).then(response => {console.log(response.data)});


    return (
        <>
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