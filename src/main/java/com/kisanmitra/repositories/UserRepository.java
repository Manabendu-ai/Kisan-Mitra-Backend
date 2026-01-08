package com.kisanmitra.repositories;

import com.kisanmitra.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByUserId(Integer id);
}
