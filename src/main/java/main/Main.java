package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("STart");

        var c1 = context.getBean("commentService", CommentService.class);
        var c2 = context.getBean("commentService", CommentService.class);

        boolean b1 = c1 == c2;
        System.out.println(b1);

    }
}
