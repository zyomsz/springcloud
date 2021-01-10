package com.yomsz.service;


import com.yomsz.dao.MovieDao;
import com.yomsz.pojo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieDao movieDao;

    public Movie getNewMovie() {
        return movieDao.getNewMovie();
    }
}