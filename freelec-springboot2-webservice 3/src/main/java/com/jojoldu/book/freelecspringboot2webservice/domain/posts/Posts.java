package com.jojoldu.book.freelecspringboot2webservice.domain.posts;

import com.jojoldu.book.freelecspringboot2webservice.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity{

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY) // auto_increment 가 가능하다 스프링 2.0 에서
    private Long id; // strategy = GenerationType.IDENTITY 를 선언해주면 BigInt 가 된다.

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT" , nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
