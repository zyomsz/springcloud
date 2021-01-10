package com.yomsz.dao;

import com.yomsz.pojo.Movie;
import org.springframework.stereotype.Repository;


@Repository // dao对象
public class MovieDao {
    public Movie getNewMovie() {
        Movie movie = new Movie();
        movie.setId(1);
        movie.setMovieName("金瓶梅");
        return movie;
    }
}
