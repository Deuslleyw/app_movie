import { ReactComponent as GithubIcon } from 'assets/img/github.svg'
import './styles.css'
function Navbar() {

    return (
        <header>
            <nav className="container">
                <div className="movie-nav-content">
                    <h1>Movie</h1>
                    <a href="https://github.com/Deuslleyw">
                        <div className="movie-icon-container">
                            <GithubIcon/>
                            <p className="movie-contact-link">Dev.DeusleyDiego</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;