package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import services.CommentService;

@Configuration
@ComponentScan(basePackages =  {"repositories","services"})
public class ProjectConfig {

    @Bean
    public CommentService commentService() {
        return new CommentService();
    }
}
