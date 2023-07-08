import './App.css';
import api from './api/axiosConfig.js';
import {useEffect, useState} from 'react';
import Layout from './components/Layout';
import Home from './components/home/Home';
import {Routes, Route} from 'react-router-dom';
import Header from "./components/header/Header";
import Trailer from "./components/trailer/Trailer";
import Reviews from "./reviews/Reviews";
import NotFound from "./components/notFound/NotFound";

function App() {
    const [movies, setMovies] = useState([]);
    const [movie, setMovie] = useState();
    const [reviews, setReviews] = useState([]);

    const getMovies = async () => {
        try {
            const response = await api.get('api/v1/movies');
            console.log(response.data);
            setMovies(response.data);
        } catch (error) {
            console.log(error);
        }
    }

    const getMovieData = async (movieId) => {
        try {
            const response = await api.get(`api/v1/movies/${movieId}`);
            console.log(response.data);
            setMovie(response.data);
            setReviews(response.data.reviewIds);
            return response.data;
        } catch (error) {
            console.log(error);
        }
    }

    useEffect(() => {
        getMovies();
    }, []);

    return (
        <div className="App">
            <Header></Header>
            <Routes>
                <Route path="/" element={<Layout/>}>
                    <Route path="/" element={<Home movies={movies}/>}/>
                    <Route path="/Trailer/:ytTrailerId" element={<Trailer/>}/>
                    <Route path="/Reviews/:movieId" element={<Reviews getMovieData={getMovieData} reviews={reviews}
                                                                      setReviews={setReviews} movie={movie}/>}/>
                    <Route path="*" element = {<NotFound/>}></Route>
                </Route>
            </Routes>
        </div>
    );
}

export default App;
