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
    @Query(value = "select u.Id, u.firstname, u.lastname, u.email, u.password from users u where u.Id = :user_id", nativeQuery = true)
    User getUserById(@Param("user_id")Long user_id);
}
