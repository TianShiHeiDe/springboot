package com.springboot.study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @Value("${book.author}")
    private String author;
    @Value("${book.name}")
    private String name;

    @RequestMapping("/")
    String index() {
        return "book name is :" + name + " and book author is: " + author;
    }
    public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

        //可以禁用banner显示
		SpringApplication application = new SpringApplication(DemoApplication.class);
//		application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
