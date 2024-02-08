package com.gillies.findmynexthome.service;

import com.gillies.findmynexthome.model.Blog;
import com.gillies.findmynexthome.model.Property;

import java.util.List;
import java.util.Optional;

public interface BlogService {

    List<Blog> findAllBlogs();

    Optional<Blog> findById(Long id);

    Blog saveBlog(Blog blog);

    Blog updateBlog(Blog blog);
    void deleteBlog(Long id);
}
