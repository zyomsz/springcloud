package com.yomsz.service;

import com.yomsz.dao.UserDao;
import com.yomsz.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    RestTemplate restTemplate;

    /**
     * 根据ID得到用户对象
     *
     * @param id
     * @return
     */

    public User getUserById(Integer id) {
        User user = userDao.getUser(id);
        return user;
    }

    /**
     * 购买最新的电影票
     *
     * @param id 用户ID
     * @return
     */
    public Map<String, Object> buyMovie(Integer id) {

        Map<String, Object> result = new HashMap<>();

        User user = this.getUserById(id);
        result.put("user", user);




//        Movie movie = restTemplate.getForObject("http://PROVIDERMOVIE/movie", Movie.class);
//
//
//        List list = restTemplate.getForObject("http://PROVIDERMOVIE/type/movieTypeList", List.class);
//        result.put("movieTypeList",list);

//        result.put("movie", movie);
        return result;
    }


//    public Map<String, Object> buyMovieFallbackMethod(Integer id) {
//        Map map = new HashMap();
//        map.put("code",40001);
//        map.put("msg","服务器异常，稍后重试....");
//        return map;
//    }
}