import React from 'react';
import '../App.css';
import { Button } from './Button';
import './HeroSection.css';

function HeroSection() {
  return (
    <div className='hero-container'>
      <video src='/videos/video-3.mp4' autoPlay loop muted />
      <h1>QUICKFEED</h1>
      <p>Receive up-to-date, pertinent news instantly at your fingertips</p>
      <div className='hero-btns'>
      <a
        href="http://localhost:3001"
        className="btns btn--outline btn--large"
        style={{
        textDecoration: "none",
        padding: "10px 20px",
        borderRadius: "4px",
        border: "2px solid #000",
        color: "white",
        backgroundColor: "#000000c9",
        transition: "all 0.3s ease-in-out",
      }}
    >
      VISIT
    </a>
      </div>
    </div>
  );
}

export default HeroSection;
