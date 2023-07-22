package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var c1 = context.getBean(CommentService.class);
        var c2 = context.getBean(UserService.class);

        boolean b1 = c1.getRepository() == c2.getRepository();
        System.out.println(b1);

    }
}
