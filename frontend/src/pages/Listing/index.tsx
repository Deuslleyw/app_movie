import MovieCard from "components/MovieCard";
import Pagination from "components/Pagination";
import axios from "axios"
import { BASE_URL } from "utils/requests";
import { useEffect } from "react";
import { useState } from "react"
import { MoviePage } from "Types/movie";

function Listing() {

    const [pageNumber, setPageNumber] = useState(0);

    const [page, setPage] = useState<MoviePage>({

        content: [],
        last: true,
        totalPages: 0,
        totalElements: 0,
        size: 12,
        number: 0,
        first: true,
        numberOfElements: 0,
        empty: true
    });


    useEffect(() => {
        axios.get(`${BASE_URL}/movies?size=12&page=${pageNumber}`)
        .then(response => {
            const data = response.data as MoviePage;
            setPage(data);

        });

    }, [pageNumber]);

    const handlerPageChange = (newPageNumber : number) =>{
        setPageNumber(newPageNumber);
    }



    return (
        <>

            <Pagination page = {page} onChange= {handlerPageChange}/>

            <div className="container">

                <div className="row">
                    {page.content.map(movie => (

                            <div key={movie.id} className="col-sm-6 col-lg-4 col-x1-3 mb-5">
                            <MovieCard movie={movie} />
                        </div>

                        ) 
                    )}

                </div>
            </div>

        </>
    );
}

export default Listing;