import { ReactComponent as GitHubIcon } from 'assets/img/githubICO.svg';
import './styles.css';

function Navbar() {

    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie - Rafael Costa</h1>
                    <a href="https://github.com/rafaelbvc">
                        <div className="dsmovie-contact-container">
                            <GitHubIcon />
                            <p className="dsmovie-contact-link">/rafaelbvc</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    )
}

export default Navbar;