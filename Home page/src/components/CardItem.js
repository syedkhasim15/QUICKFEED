import React from 'react';
import { Link } from 'react-router-dom';


function CardItem(props) {
  return (
    <>
      <li className='cards__item'>
        <div className='cards__item__link'>
          <figure className='cards__item__pic-wrap' data-category={props.label}>
            <img
              className='cards__item__img'
              alt='Travel Image'
              src={props.src}
            />
          </figure>
          <div className='cards__item__info'>
            <h5 className='cards__item__text'>{props.text}</h5>
          </div>
          <a href={props.visit}>
          <button
            style={{
              
              backgroundColor: '#31d3cb',
              width:"100%",   
              color: '#fff',
              padding: '10px 20px',
              borderRadius: '5px',
              border: 'none',
              cursor: 'pointer',
              fontSize: '16px',
              fontWeight: 'bold',
              
             
            }}
            
        >
        VISIT
    </button>
    </a>
        </div>
      </li>
    </>
  );
}

export default CardItem;
