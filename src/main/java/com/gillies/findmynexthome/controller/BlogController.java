package com.gillies.findmynexthome.controller;
import com.gillies.findmynexthome.model.Blog;
import com.gillies.findmynexthome.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    private final BlogService blogService;


    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping
    public List<Blog> findAllBlogs(){
        return blogService.findAllBlogs();
    }

    @GetMapping("/{id}")
    public Optional<Blog> findBlogById(@PathVariable("id") Long id){
        return blogService.findById(id);
    }

    @PostMapping
    public Blog saveBlog(@RequestBody Blog blog){
        return blogService.saveBlog(blog);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Blog> updateBlog(@RequestBody Blog updatedBlog, @PathVariable Long id) {
        Blog existingBlog = blogService.findById(id).get();

        existingBlog.setTitle(updatedBlog.getTitle());
        existingBlog.setBody(updatedBlog.getBody());

        blogService.saveBlog(existingBlog);

        return new ResponseEntity<>(existingBlog, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteBlog(@PathVariable("id") Long id){
        blogService.deleteBlog(id);
    }
}
