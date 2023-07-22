package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
public class UserService {

    private final CommentRepository repository;

    public UserService(CommentRepository repository) {
        this.repository = repository;
    }

    public CommentRepository getRepository() {
        return repository;
    }
}
