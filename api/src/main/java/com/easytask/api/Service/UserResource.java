package com.easytask.api.Service;

import com.easytask.api.Domain.IUserRepository;
import com.easytask.api.Model.User;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@Slf4j
@RequestMapping(path="/users")
public class UserResource extends AResource<User, Long>{
    
    @Autowired
    private IUserRepository userRepository;

    public UserResource(@Autowired JpaRepository<User,Long> repository)
    {
        super(repository);
    }

    @CrossOrigin
    @GetMapping(path="/login")
    @ResponseStatus(HttpStatus.OK)
    public User getMethodName(@RequestBody String email, @RequestBody String password) {
        User result = userRepository.getLogin(email, password);
        return (User)Hibernate.unproxy(result);
    }
    
}
