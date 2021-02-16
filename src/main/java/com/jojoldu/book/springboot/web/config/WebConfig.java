//package com.jojoldu.book.springboot.web.config;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//@EnableWebMvc
////@EnableWebMvc - 설정이 완료된 여러 스프링 빈을 추가해준다.
////DispatcherServlet이 스프링 컨테이너를 생성하기 위해선 입력으로 받는 설정 클래스에는
////HandlerMapping 빈과 HandlerAdapter 빈이 등록되어있어야 한다.
//// 하지만 설정 클래스에 @EnableWebMvc 애노테이션을 추가해주면 해당 빈을 자동으로 추가해준다.
//public class WebConfig implements WebMvcConfigurer {
//
//    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
//            "classpath:/META-INF/resources/", "classpath:/resources/",
//            "classpath:/static/", "classpath:/public/" };
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("http://127.0.0.1:5000")
//                .allowedOrigins("http://localhost:5000");
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**")
//                .addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
//
//    }
//}
