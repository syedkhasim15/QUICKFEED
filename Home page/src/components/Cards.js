import React from "react";
import "./Cards.css";
import CardItem from "./CardItem";

function Cards() {
  return (
    <div className="cards">
      <h1>Check out our sections!</h1>
      <div className="cards__container">
        <div className="cards__wrapper">
          <ul className="cards__items">
           
              <CardItem
                src="images/news.jpg"
                text="Stay informed with current news and a diverse range of topics comprehensively covered"
                label="NEWS"
                visit="http://localhost:3001/"
              />
           
            <CardItem
              src="images/blog.avif"
              text="Users can share their social viewpoints through blog posts and explore blogs from others"
              label="BLOG"
              visit="http://localhost:2016/"
            />
            <CardItem
              src="images/Article.jpg"
              text="Users can publish impactful articles expressing their social perspectives and raise awareness"
              label="ARTICLE"
              path="/sign-up"
              visit="http://localhost:2017/"
            />
          </ul>
        </div>
      </div>
    </div>
  );
}

export default Cards;
