package com.vocoba.vicobaapi.Services.ServiceImplementations;

import com.vocoba.vicobaapi.Entity.User;
import com.vocoba.vicobaapi.Repository.UserRepository;
import com.vocoba.vicobaapi.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

//    Save the created user
    public User createUser(User user) {
        return userRepository.save(user);
    }

//    Get List of Users
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

//    Get user by id
   public User getUserById(Long id){
        return userRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("No user Found...")
        );
   }

//    Update user
    public User updateUser(User userUpdate, Long id){
        return userRepository.findById(id).map( user->{
            user.setName(user.getName());
            user.setEmail(user.getEmail());
            user.setPhone(user.getPhone());
            user.setRole(user.getRole());
            user.setPassword(user.getPassword());
            return userRepository.save(user);
        }).orElseThrow(()->new RuntimeException("User not Found..."));
    }

//   Delete user by id
   public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
