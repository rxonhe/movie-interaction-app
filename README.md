# Movie Interaction App

This is a full-stack application developed to practice skills in MongoDB, Spring Boot, Kotlin, and React. The application allows users to interact with a movie database, offering functionalities like searching for movies, writing reviews, and viewing trailers.

Both the back-end and front-end parts are now complete.

## Technologies Used

- MongoDB
- Spring Boot
- Kotlin
- React

## API Endpoints

- POST `/api/v1/reviews`: Submit a new review. Request body should contain `reviewBody` and `imdbId`.
- GET `/api/v1/movies`: Get a list of all movies in the database.
- GET `/api/v1/movies/{imdbId}`: Get details of a specific movie.

## Running the Project

1. Make sure you have [Node.js](https://nodejs.org/) and npm installed.
2. Clone the repo: `git clone https://github.com/rxonhe/movie-interaction-app.git`
3. Navigate into the project directory: `cd movie-interaction-app`
4. Install the front-end dependencies using npm: `npm install`
5. Run the front-end with: `npm start`

Please note that the Spring Boot application and MongoDB need to be running and accessible to serve data to the React application.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Node.js
- Java 17
- MongoDB
- Gradle
- npm

### Installing

To get the development environment running:

1. Clone the repo: `git clone https://github.com/rxonhe/movie-interaction-app.git`
2. Navigate to the project directory: `cd movie-interaction-app`
3. Install the dependencies for the front end: `npm install`
4. Start the Spring Boot application: `./gradlew bootRun`
5. Start the React application: `npm start`

Please note that you need to have MongoDB running and accessible to connect from the Spring Boot application. And the Spring Boot application should be running to serve data to the React application.

## Contribution

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change. Please make sure to update tests as appropriate.