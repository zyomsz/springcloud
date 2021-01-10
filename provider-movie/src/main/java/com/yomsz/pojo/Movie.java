package com.yomsz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * The preson who loves you has gone night and night,
 * walking on the way.
 *
 * @purpose:
 * @data: 2021/1/8 0:09
 * @author: Mr. zhao
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie implements Serializable {
    private Integer id;
    private String movieName;
}
