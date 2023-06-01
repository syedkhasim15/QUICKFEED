import React, { useState, useEffect } from 'react';
import { Button } from './Button';
import { Link } from 'react-router-dom';
import './Navbar.css';

function Navbar() {
  const [click, setClick] = useState(false);
  const [button, setButton] = useState(true);

  const handleClick = () => setClick(!click);
  const closeMobileMenu = () => setClick(false);

  const handleOptionChange = (event) => {
    const selectedValue = event.target.value;
    if (selectedValue === 'News') {
      window.location.href = 'http://localhost:3001'; // Replace with your desired URL
    }
    else if (selectedValue === 'Article') {
      window.location.href = 'http://localhost:2016'; // Replace with your desired URL
    }
    else{
      window.location.href = 'http://localhost:2017'; // Replace with your desired URL
    }
  }

  const showButton = () => {
    if (window.innerWidth <= 960) {
      setButton(false);
    } else {
      setButton(true);
    }
  };

  useEffect(() => {
    showButton();
  }, []);

  window.addEventListener('resize', showButton);

  return (
    <>
      <nav className='navbar'>
        <div className='navbar-container'>
          <Link to='/' className='navbar-logo' onClick={closeMobileMenu}>
            QUICKFEED
            <i class='fab fa-typo3' />
          </Link>
          <div className='menu-icon' onClick={handleClick}>
            <i className={click ? 'fas fa-times' : 'fas fa-bars'} />
          </div>
          <ul className={click ? 'nav-menu active' : 'nav-menu'}>
            <li className='nav-item'>
              <Link to='/' className='nav-links' onClick={closeMobileMenu}>
                Home
              </Link>
            </li>
            <li className='nav-item'>
              
              <a  className='nav-links' href="http://localhost:3002/">About</a>
            </li>
            

            <li className='nav-item'>
            {/* value={selectedOption} onChange={handleOptionChange} */}
            <div className='nav-links'>
            <select onChange={handleOptionChange}>
              <option value="">Services</option>
              <option value="News">News</option>
              <option value="Article">Article</option>
              <option value="Blog">Blog</option>
            </select> 
            </div>
            </li>
          </ul>
          
              <a  className='nav-links' href="http://localhost:9090">Sinup/Login</a>
        </div>
      </nav>
    </>
  );
}

export default Navbar;
