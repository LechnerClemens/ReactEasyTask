package com.easytask.api.Service;

import com.easytask.api.Domain.IUserRepository;
import com.easytask.api.Model.User;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

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


    // @CrossOrigin
    // @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    // @ResponseStatus(HttpStatus.OK)
    // public User ReadUser(@PathVariable("id") Long id)
    // {
    //     User result = userRepository.getOne(id);
    //     return (User)Hibernate.unproxy(result);
    // }

    // @GetMapping(path="/getAllUsers")
    // @ResponseStatus(HttpStatus.OK)
    // public List<User> GetAllUsers()
    // {
    //     List<User> result = employeeRepository.get
    // }

}
