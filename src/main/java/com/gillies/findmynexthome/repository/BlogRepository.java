package com.gillies.findmynexthome.repository;

import com.gillies.findmynexthome.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}
