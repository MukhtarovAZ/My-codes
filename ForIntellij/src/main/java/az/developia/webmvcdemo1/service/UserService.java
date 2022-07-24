package az.developia.webmvcdemo1.service;

import az.developia.webmvcdemo1.model.User;
import az.developia.webmvcdemo1.repository.CarRepository;
import az.developia.webmvcdemo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void save(User u){
        userRepository.save(u);

    }
}
