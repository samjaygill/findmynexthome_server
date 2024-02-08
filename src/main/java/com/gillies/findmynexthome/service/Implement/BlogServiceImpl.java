package com.gillies.findmynexthome.service.Implement;

import com.gillies.findmynexthome.model.Blog;
import com.gillies.findmynexthome.repository.BlogRepository;
import com.gillies.findmynexthome.service.BlogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {

    private final BlogRepository blogRepository;

    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public List<Blog> findAllBlogs() {
        return this.blogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return this.blogRepository.findById(id);
    }

    @Override
    public Blog saveBlog(Blog blog) {
        return this.blogRepository.save(blog);
    }

    @Override
    public Blog updateBlog(Blog blog) {
        return this.blogRepository.save(blog);
    }

    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }
}
