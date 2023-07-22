package main;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import services.CommentService;

@Configuration
public class ProjectConfig {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CommentService commentService(){
        return new CommentService();
    }

}
