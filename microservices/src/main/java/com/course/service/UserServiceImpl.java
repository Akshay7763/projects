package com.course.service;

import com.course.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;
import org.w3c.dom.css.Counter;
@Service
public class UserServiceImpl implements UserService {

    public static List<User> users = new ArrayList<>();
    
    private static int userCount = 0;

    static {
        users.add(new User(++userCount, "Akshay", LocalDate.now().minusYears(35)));
        users.add(new User(++userCount, "Vipul wagh", LocalDate.now().minusYears(42)));
        users.add(new User(++userCount, "suraj Dalwe", LocalDate.now().minusYears(48)));
    }

    public List<User> getAllUser() {

        //Predicate<? super User> predicate = (user -> user.getId()).equals(id);
        //return users.stream().filter(predicate).findFirst().get();
        return users;

    }

    public User getUser(int id){
       // Predicate<? super User> predicate = user -> user.getUserId().equals(id);
        User user =  users.stream()
                .filter(u -> u.getUserId()== id).findFirst().orElse(null);
        return  user;
    }
    
    public User registerUser(User user) {
    	user.setId(++userCount);
    	users.add(user);
		return user;
    	
    }
    public void deletUser(int id){
        // Predicate<? super User> predicate = user -> user.getUserId().equals(id);
         User user =  users.stream()
                 .filter(u -> u.getUserId()== id).findFirst().orElse(null);
         users.remove(user);
        
     }
}
