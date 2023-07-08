# Movie Interaction App

This is a full-stack application developed to practice skills in MongoDB, Spring Boot, Kotlin, and React. The application allows users to interact with a movie database, offering functionalities like searching for movies, writing reviews, and more.

Currently, the back-end part is complete and front-end development is in progress.

## Technologies Used

- MongoDB
- Spring Boot
- Kotlin
- (In progress) React

## API Endpoints

- POST `/api/v1/reviews`: Submit a new review. Request body should contain `reviewBody` and `imdbId`.
- GET `/api/v1/movies`: Get a list of all movies in the database.
- GET `/api/v1/movies/{imdbId}`: Get details of a specific movie.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 17
- MongoDB
- Gradle

### Installing

To get the development environment running:

1. Clone the repo: `git clone https://github.com/username/movie-interaction-app.git` (replace `username` with your GitHub username)
2. Navigate to the project directory: `cd movie-interaction-app`
3. Start the Spring Boot application: `./gradlew bootRun`


