# Day#1

Certainly! Here's the complete code and further explanations for Day 1 of the tutorial:

1. Introduction to the project and its goals
    - The goal of this project is to build a movie website using React and Redux. The website will allow users to browse movies, view movie details, search for movies, and navigate through movie pages.
2. Setting up the development environment (Node.js, React, Redux)
    - To set up the development environment, follow these steps:
        1. Install Node.js from the official website ([https://nodejs.org](https://nodejs.org/)). Choose the appropriate version for your operating system and follow the installation instructions.
        2. Open a terminal or command prompt and run the following command to create a new React project:
        This command will create a new directory called `movie-website` and set up a basic React project structure.
            
            ```
            npx create-react-app movie-website
            
            ```
            
        3. Navigate into the project directory:
            
            ```
            cd movie-website
            
            ```
            
3. Ensuring React 17 is installed
    - Open the `package.json` file in the project root directory and check the versions of `react` and `react-dom`. Make sure they are set to 18:
        
        ```json
        {
          "name": "filmpire",
          "version": "0.1.0",
          "private": true,
          "dependencies": {
            "@alan-ai/alan-sdk-web": "^1.8.34",
            "@emotion/react": "^11.9.3",
            "@emotion/styled": "^11.9.3",
            "@mui/icons-material": "^5.8.4",
            "@mui/material": "^5.9.1",
            "@mui/styles": "^5.9.1",
            "@reduxjs/toolkit": "^1.8.3",
            "@testing-library/jest-dom": "^5.16.4",
            "@testing-library/react": "^13.3.0",
            "@testing-library/user-event": "^13.5.0",
            "axios": "^0.27.2",
            "react": "^18.2.0",
            "react-dom": "^18.2.0",
            "react-redux": "^8.0.2",
            "react-router-dom": "^6.3.0",
            "react-scripts": "5.0.1",
            "web-vitals": "^2.1.4"
          },
          "scripts": {
            "start": "react-scripts start",
            "build": "react-scripts build",
            "test": "react-scripts test",
            "eject": "react-scripts eject"
          },
          "eslintConfig": {
            "extends": [
              "react-app",
              "react-app/jest"
            ]
          },
          "browserslist": {
            "production": [
              ">0.2%",
              "not dead",
              "not op_mini all"
            ],
            "development": [
              "last 1 chrome version",
              "last 1 firefox version",
              "last 1 safari version"
            ]
          },
          "devDependencies": {
            "@babel/core": "^7.18.9",
            "babel-eslint": "^10.1.0",
            "eslint": "^8.20.0",
            "eslint-config-airbnb": "^19.0.4",
            "eslint-plugin-import": "^2.26.0",
            "eslint-plugin-jsx-a11y": "^6.6.1",
            "eslint-plugin-react": "^7.30.1",
            "eslint-plugin-react-hooks": "^4.6.0"
          }
        }
        
        ```
        
    - If the versions are different, update them in the `package.json` file and run the following command to install the specified versions:
        
        ```
        npm install
        
        ```
        
4. Building the Navbar component with a logo and header
    - Create a new directory called `components` inside the `src` directory.
    - Inside the `components` directory, create a new file named `Navbar.js`.
    - Open `Navbar.js` and add the following code:
        
        ```jsx
        import React from 'react';
        import './Navbar.css';
        
        const Navbar = () => {
          return (
            <nav className="navbar">
              <div className="logo">Movie Website</div>
              <div className="header">Home</div>
            </nav>
          );
        };
        
        export default Navbar;
        
        ```
        
    - Create a new file named `Navbar.css` in the same `components` directory and add the following styles:
        
        ```css
        .navbar {
          display: flex;
          justify-content: space-between;
          align-items: center;
          padding: 1rem;
          background-color: #f2f2f2;
        }
        
        .logo {
          font-size: 1.5rem;
          font-weight: bold;
        }
        
        .header {
          font-size: 1.2rem;
        }
        
        ```
        
5. Adding a non-functional button to the Navbar
    - Update the `Navbar.js` file to include a non-functional login button:
        
        ```jsx
        import React from 'react';
        import './Navbar.css';
        
        const Navbar = () => {
          return (
            <nav className="navbar">
              <div className="logo">Movie Website</div>
              <div className="header">Home</div>
              <button className="login-button">Login</button>
            </nav>
          );
        };
        
        export default Navbar;
        
        ```
        
    - Add the following styles for the login button in `Navbar.css`:
        
        ```css
        .login-button {
          padding: 0.5rem 1rem;
          background-color: #4285f4;
          color: #fff;
          border: none;
          border-radius: 4px;
          cursor: pointer;
        }
        
        ```
        
6. Concepts covered: React components, JSX, basic styling
    - In this step, we covered the concept of creating a React component (`Navbar`) using JSX syntax. We also learned how to apply basic styling to the component using CSS.

To see the Navbar component in action, open the `src/App.js` file and replace its contents with the following code:

```jsx
import React from 'react';
import Navbar from './components/Navbar';
import './App.css';

const App = () => {
  return (
    <div className="app">
      <Navbar />
      
    </div>
  );
};

export default App;

```

Add these changes in Index.js

```
import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

```

Finally, run the following command in the terminal to start the development server:

```
npm start

```

Open your browser and visit `http://localhost:3000` to see the movie website with the Navbar component.

That concludes Day 1 of the tutorial. You have successfully set up the project, ensured React 17 is installed, created the Navbar component with a logo, header, and a non-functional login button, and applied basic styling.

In the next days, we'll continue building upon this foundation and add more functionality to the movie website.
