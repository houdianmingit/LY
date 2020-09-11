package com.cetc.ly;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("com.*")
@RestController
public class SpringbootApplication {

    @RequestMapping("/helloWorld")
    public String index(){
        return "Hello World! this is index!";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}