import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './style.css';

function Navbar() {
    return (
        <header>
            <nav className="container">
                <section className = "dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/devsuperior">
                        <section className="dsmovie-contact-container">
                            <GithubIcon />
                            <p className="dsmovie-contact-link">/devsuperior</p>
                        </section>
                    </a>
                </section>
            </nav>
        </header>

    );
}
export default Navbar;