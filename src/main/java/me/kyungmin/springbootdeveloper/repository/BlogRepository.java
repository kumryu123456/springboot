package me.kyungmin.springbootdeveloper.repository;

import me.kyungmin.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
