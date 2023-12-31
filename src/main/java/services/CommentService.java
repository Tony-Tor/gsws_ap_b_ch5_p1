package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
public class CommentService {

    @Autowired
    private CommentRepository repository;

    public CommentRepository getRepository() {
        return repository;
    }

}
