package com.easytask.api.Domain;

import javax.transaction.Transactional;

import com.easytask.api.Model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

    @Transactional
    @Query("select u from User u where u.email = :email and u.password = :password")
    User getLogin(@Param("email")String email, @Param("password") String password);
}
