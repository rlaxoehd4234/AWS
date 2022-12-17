package com.jojoldu.book.freelecspringboot2webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts,Long> { // Repository 는 dao 이다 스프링에서는 DAO 대신에 repo 가 쓰인다.


}
