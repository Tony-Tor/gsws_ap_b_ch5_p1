package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
@Lazy
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {

    public CommentService() {
        System.out.println("CommentService instance created!");
    }
}
