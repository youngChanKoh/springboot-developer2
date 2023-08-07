package org.example.springbootdeveloper.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.springbootdeveloper.domain.Article;

import java.time.LocalDateTime;


@Getter
@Setter
public class ArticleListViewResponse {

    private final Long id;
    private final String title;
    private final String content;
    private LocalDateTime createdAt;
    // chap10. author추가
    private String author;

    public ArticleListViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getTitle();
        this.createdAt = article.getCreatedAt();
        this.author = article.getAuthor();
    }
}
