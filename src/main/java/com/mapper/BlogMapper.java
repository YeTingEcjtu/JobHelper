package com.mapper;

import com.entity.Blog;

import java.util.List;

public interface BlogMapper {
    /*delete one blog by id*/
    int deleteByPrimaryKey(Integer blogId);

    /*insert into blog*/
    int insert(Blog record);

    /*get one blog by id*/
    Blog selectByPrimaryKey(Integer blogId);

    /*get all blog*/
    List<Blog> selectAll();

    /*get some blog*/
    List<Blog> selectSome();

    /*update one blog*/
    int updateByPrimaryKey(Blog record);
}