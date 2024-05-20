package com.example.api_uemycourse.domain;

import com.example.api_uemycourse.Model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1L, "Reham", LocalDate.now().minusYears(24)));
        users.add(new User(2L, "Sarah", LocalDate.now().minusYears(24)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(Long id) {
        return users.stream().filter(user -> Objects.equals(user.getId(), id)).findFirst().get();
    }

    public User addUser(User user) {
        if (Objects.isNull(user)) return null;
        users.add(user);
        return user;
    }
}
