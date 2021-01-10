package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.service.posts.PostsService;
import com.jojoldu.book.springboot.web.dto.PostsResponseDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*
 final이 선언된 모든 필드를 인자값으로 하는 생성자를 롭복의 얘가 해줌 ( RequiredArgsConstructor )
 스프링에서 Bean 주입하는 방식  1. @Autowired  2. setter   3. 생성자  ====> 권장하는 방식 생성자 주입
 생성자 안쓰고 롭복 ㅆ는 이유  클래스 의존성 관계 변경될때 마타 생성자 코드 수정 안하기 위해
*/
@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts",postsService.findAllDesc());
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model){
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }

}
