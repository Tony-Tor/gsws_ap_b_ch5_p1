package main;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import services.CommentService;

@Configuration
@ComponentScan(basePackages = {"services"})
public class ProjectConfig {


}
