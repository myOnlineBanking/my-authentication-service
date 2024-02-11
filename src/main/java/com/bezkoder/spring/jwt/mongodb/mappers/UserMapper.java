package com.bezkoder.spring.jwt.mongodb.mappers;


import com.bezkoder.spring.jwt.mongodb.models.User;
import com.bezkoder.spring.jwt.mongodb.models.dtos.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserMapper {

    public UserDto map(User user) {

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setRoles(user.getRoles());
        userDto.setUsername(user.getUsername());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());

        return userDto;
    }

    public User map(UserDto userDto) {

        User user = new User();

        user.setId(userDto.getId());
        user.setRoles(userDto.getRoles());
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());

        return user;
    }

    public List<UserDto> map(List<User> users) {

        return  users
                .stream()
                .map(this::map)
                .collect(Collectors.toList());
    }

    public List<User> toMap(List<UserDto> userDtos) {

        return  userDtos
                .stream()
                .map(this::map)
                .collect(Collectors.toList());
    }



}
