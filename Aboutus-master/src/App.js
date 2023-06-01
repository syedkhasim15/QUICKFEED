// App.js
import React from 'react';
import AboutUs from './AboutUs';
import './App.css';

const foundersData = [
  { id: 1, name: "Syed Khasim", designation: "Founder", photo: "/images/newsfounders10.jpeg" },
  { id: 2, name: "Suvalakshmi.R", designation: "Founder", photo: "/images/newsfounders20.jpeg" },
  { id: 3, name: "Revu Kavitha", designation: "Founder", photo: "/images/newsfounders30.jpeg" },
  { id: 4, name: "Salagrama Sri Venkateswarlu", designation: "Founder", photo: "/images/newsfounders40.jpeg" }
];

const App = () => {
  return (
    <div className="app-container">
      <header>
        <nav>
          <ul className="nav-list">
            <li>
              <a href="http://localhost:3000" className="nav-link">Home</a>
            </li>
            <li>
              <a href="/" className="nav-link">About</a>
            </li>
          </ul>
        </nav>
      </header>
      <main>
        <AboutUs />
        <div className="founders-section">
          <h1>Our Founders</h1>
          <div className="founders-gallery">
            {foundersData.map(founder => (
              <div key={founder.id} className="founder-item">
                <img src={founder.photo} alt={founder.name} />
                <strong><p className="founder-name">{founder.name}</p></strong>
                <p className="founder-designation">{founder.designation}</p>
              </div>
            ))}
          </div>
        </div>
        <br></br>
        <div className="about-us">
          <h1>Our Uniqueness</h1>
          <p>The News module displays various news articles from different domains like politics, sports, entertainment, etc. Users can select their preferred domain and get the latest news on that topic.</p>

          <p>The Article module provides access to article writing and blog content, which can be availed by subscribing to the portal.</p>

          <p><strong>Multi-Domain News Coverage:</strong> Quick Feed stands out by offering news articles from various domains, including politics, sports, entertainment, and more. Users can access a wide range of news topics in one centralized platform.</p>

          <p><strong>Article Writing and Blog Content:</strong> Quick Feed sets itself apart by providing a platform for users to actively participate in content creation. Along with accessing news articles, users can contribute their own articles and blog content. This feature allows aspiring writers, experts, and enthusiasts to showcase their writing skills, share their perspectives, and engage with the community. By empowering users to become content creators, Quick Feed fosters a sense of inclusivity and collaboration, making it more than just a news portal but also a platform for self-expression and knowledge sharing.</p>
        </div>
      </main>
      <footer className="footer">
        <div className="contact-section">
          <h3>Contact Us</h3>
          <p>Puducherry Technological University, Pillaichavady, Puducherry</p>
          <p>Email: qwikfeed@gmail.com</p>
          <p>Phone: +91 9988987678</p>
        </div>
        <p>&copy; 2023 QwikFeed Website. All rights reserved.</p>
      </footer>
    </div>
  );
}

export default App;
